/*******************************************************************************
 * Copyright (c) 2016 Jiocloud.com, Inc. or its affiliates.  All Rights Reserved
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, dis-
 * tribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the fol-
 * lowing conditions:
 *
 * The above copyright notice and permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABIL-
 * ITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT
 * SHALL THE AUTHOR BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 *******************************************************************************/
package com.ril.jcs.services;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
public class Signature 
{
	private static final String HMAC_SHA256_ALGORITHM = "HmacSHA256";
	private static final String UTF8_CHARSET = "UTF-8";
	private static final String VERSION = "2";
	private static final String JCS_ACCESS_KEY_ID = "JCSAccessKeyId";
	private static final String SIGNATURE_VERSION = "SignatureVersion";
	private static final String SIGNATURE_METHOD = "SignatureMethod";
	private static final String TIMESTAMP = "Timestamp";
	private static final String SIGNATURE  = "Signature";
	
	private static void addParams(TreeMap<String, String> params)
	{
		params.put(JCS_ACCESS_KEY_ID, AuthVar.accessKey);
		params.put(SIGNATURE_VERSION,VERSION);
		params.put(SIGNATURE_METHOD, HMAC_SHA256_ALGORITHM);
		//Time
		Date dNow = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		formatDate.setTimeZone(TimeZone.getTimeZone("GMT"));

		params.put(TIMESTAMP, formatDate.format(dNow));
	}
	
	private static void UrlParser()
	{
		if(AuthVar.path != null || !AuthVar.path.isEmpty())
		{
			AuthVar.path = "/";
		}

		AuthVar.protocol = Utils.getProtocol(AuthVar.url);

		if(!AuthVar.protocol.equals("http") && !AuthVar.protocol.equals("https"))
		{
			System.out.println("Unsupported Protocol in the given url");
		}

		AuthVar.host = Utils.getHost(AuthVar.url);
		AuthVar.port = "None";
		//If port present in URL
		if(AuthVar.host.contains(":"))
		{
			String[] parts = AuthVar.host.split(":");
			AuthVar.host = parts[0];
			AuthVar.port = parts[1];
		}
		
	}
	private static String sortParams(TreeMap<String, String> params)
	{	
		StringBuilder qs = new StringBuilder();
		//join the params using & delimiter

		for(Entry<String, String> entry: params.entrySet())
		{
			//url and utf-8
			try 
			{
				qs.append(entry.getKey()+"="+URLEncoder.encode(entry.getValue(),"UTF-8")+"&");
			} catch (UnsupportedEncodingException e) 
			{	
				e.printStackTrace();
			}		
		}


		return qs.substring(0,qs.length()-1);
	}

	private static String stringToSign(TreeMap<String, String> params)
	{
		StringBuilder ss = new StringBuilder(AuthVar.verb + "\n" + AuthVar.host);
		if(!AuthVar.port.equals("None"))
		{
			ss.append(AuthVar.port);
		}
		ss.append("\n"+ AuthVar.path + "\n");
		addParams(params);
		ss.append(sortParams(params));
		return ss.toString();
	}

	public static void addSignature(TreeMap<String, String> params)
	{
		
		UrlParser();
		String secret = AuthVar.secretKey;
		String canonicalString = stringToSign(params);

		Mac sha256_HMAC;
		try 
		{
			sha256_HMAC = Mac.getInstance(HMAC_SHA256_ALGORITHM);
			SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), HMAC_SHA256_ALGORITHM);
			sha256_HMAC.init(secret_key);

			@SuppressWarnings("restriction")
			String hmacSignature = DatatypeConverter.printBase64Binary(sha256_HMAC.doFinal(canonicalString.getBytes()));


			params.put(SIGNATURE, hmacSignature);
		}
		catch (NoSuchAlgorithmException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (InvalidKeyException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
