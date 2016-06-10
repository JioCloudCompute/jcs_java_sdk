package com.jcs_java_sdk;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.regex.Pattern;

public class Utils {
	
	public static String getProtocol(String url)
	{	
		String regex = "(http[s]?)://((?:[a-zA-Z]|[0-9]|[$-_@.&+]|[!*\\(\\),]|(?:%[0-9a-fA-F][0-9a-fA-F]))+)";
		
		if(!Pattern.matches(regex, url))
		{
			System.out.println("Unsupported URL endpoint");
			return "None";
		}
		else
		{
			return url.split("://")[0];
		}
			
	}
	
	public static String getHost(String url)
	{	
		String regex = "(http[s]?)://((?:[a-zA-Z]|[0-9]|[$-_@.&+]|[!*\\(\\),]|(?:%[0-9a-fA-F][0-9a-fA-F]))+)";
		
		if(!Pattern.matches(regex, url))
		{
			System.out.println("Unsupported URL endpoint");
			return "None";
		}
		else
		{
			return url.split("://")[1];
		}		
	}
	
	public static PrivateKey getPrivateKey(String filename) throws Exception {
        
		File f = new File(filename);
	    FileInputStream fis = new FileInputStream(f);
	    DataInputStream dis = new DataInputStream(fis);
	    byte[] keyBytes = new byte[(int)f.length()];
	    dis.readFully(keyBytes);
	    dis.close();

	    PKCS8EncodedKeySpec spec =
	      new PKCS8EncodedKeySpec(keyBytes);
	    KeyFactory kf = KeyFactory.getInstance("RSA");
	    return kf.generatePrivate(spec);
    }
	/*public static void main(String[] args)
	{
		System.out.println(getHost("https://compute.jiocloud.com"));
	}*/

}
