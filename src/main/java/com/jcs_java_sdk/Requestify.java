package com.jcs_java_sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.jcs_java_sdk.compute_api.model.ErrorResponse;

public class Requestify 
{
	public static String makeRequest(HttpVar info, TreeMap<String, String>params) 
	{
		AuthVar authData = new AuthVar();
		authData.url = info.url;
		authData.verb = info.verb;
		authData.headers = info.headers;
		authData.accessKey = Config.getAccessKey();
		authData.secretKey = Config.getSecretKey();
		authData.path = "";
		if(info.url.endsWith("/"))
		{
			info.url = info.url.substring(0,info.url.length()-1);
		}
		
		Authorization authObject = new Authorization(authData);
		authObject.addAuthorization(params);
		StringBuilder requestString = new StringBuilder(info.url);
		requestString.append("/?");
		
		for (Map.Entry<String, String> entry : params.entrySet())
		{
		    try 
		    {
				requestString.append(entry.getKey() + "=").append(URLEncoder.encode(entry.getValue(), "UTF-8") + "&");
			} 
		    catch (UnsupportedEncodingException e) 
		    {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return requester(requestString.substring(0, requestString.length()-1));
	}
	
	private static String requester (String requestString )
	{
	       // Create a trust manager that does not validate certificate chains
		if(!Config.isSecure())
		{
	        TrustManager[] trustAllCerts = new TrustManager[] 
	        {	new X509TrustManager() 
	        	{
	                public java.security.cert.X509Certificate[] getAcceptedIssuers() 
	                {
	                    return null;
	                }
	                public void checkClientTrusted(X509Certificate[] certs, String authType) 
	                {
	                }
	                public void checkServerTrusted(X509Certificate[] certs, String authType) 
	                {
	                }
	            }
	        };
	 
	        // Install the all-trusting trust manager
		        SSLContext sc;
			try 
			{
				sc = SSLContext.getInstance("SSL");
				sc.init(null, trustAllCerts, new java.security.SecureRandom());
				HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
			} 
			catch (NoSuchAlgorithmException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (KeyManagementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		        
		        
		 
		        // Create all-trusting host name verifier
	        HostnameVerifier allHostsValid = new HostnameVerifier() 
	        {
	            public boolean verify(String hostname, SSLSession session) 
	            {
	                return true;
	            }
	        };
		}
        
		HttpsURLConnection connection;
		InputStream response = null;
		int responseCode = 0;
		
		try 
		{
			connection = (HttpsURLConnection) new URL(requestString).openConnection();
			connection.setRequestProperty("Accept-Charset", "UTF-8");
			responseCode = connection.getResponseCode();
			  
			if(responseCode == 200)
			{
				response = connection.getInputStream();
			}
			else
			{
				response = connection.getErrorStream();
			}

		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			Scanner scanner = new Scanner(response);
		    String responseBody = scanner.useDelimiter("\\A").next();
		    if(responseCode != 200)
		    {
		    	ErrorResponse.Error(responseBody);
		    	scanner.close();
		    	return null;
		    }
		    scanner.close();
		    return responseBody;
	}
}
