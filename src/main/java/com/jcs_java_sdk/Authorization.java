package com.jcs_java_sdk;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
public class Authorization 
{
	private AuthVar data;
	
	public Authorization(final AuthVar data)
	{
		this.data = data;
		
		if(data.path != null || !data.path.isEmpty())
		{
			this.data.path = "/";
		}
		
		this.data.protocol = Utils.getProtocol(data.url);
		
		if(!this.data.protocol.equals("http") && !this.data.protocol.equals("https"))
		{
			System.out.println("Unsupported Protocol in the given url");
		}
		
		this.data.host = Utils.getHost(data.url);
		this.data.port = "None";
		//If port present in URL
		if(this.data.host.contains(":"))
		{
			String[] parts = this.data.host.split(":");
			this.data.host = parts[0];
			this.data.port = parts[1];
		}
		
	}
	
	private void addParams(TreeMap<String, String> params)
	{
		params.put("JCSAccessKeyId", this.data.accessKey);
		params.put("SignatureVersion","2");
		params.put("SignatureMethod", "HmacSHA256");
		//Time
		Date dNow = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		formatDate.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		params.put("Timestamp", formatDate.format(dNow));
	}
	private String sortParams(TreeMap<String, String> params)
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
	
	private String stringToSign(TreeMap<String, String> params)
	{
		StringBuilder ss = new StringBuilder(data.verb + "\n" + this.data.host);
		if(!this.data.port.equals("None"))
		{
			ss.append(this.data.port);
		}
		ss.append("\n"+ this.data.path + "\n");
		this.addParams(params);
		ss.append(sortParams(params));
		return ss.toString();
	}
	
	public void addAuthorization(TreeMap<String, String> params)
	{
		try {
		     String secret = this.data.secretKey;
		     String canonicalString = stringToSign(params);
		     		     
		     Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
		     SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
		     sha256_HMAC.init(secret_key);
		     
		     @SuppressWarnings("restriction")
			 String hmacSignature = DatatypeConverter.printBase64Binary(sha256_HMAC.doFinal(canonicalString.getBytes()));
		     
		     
		     params.put("Signature", hmacSignature);
		    
			}catch (Exception e)
			{
		     System.out.println("Error");
		    }
	}

}
