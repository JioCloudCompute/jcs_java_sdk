package com.jcs_java_sdk;

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
	
	/*public static void main(String[] args)
	{
		System.out.println(getHost("https://compute.jiocloud.com"));
	}*/

}
