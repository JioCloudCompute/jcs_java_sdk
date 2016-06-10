package com.jcs_java_sdk;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class Config {
	
	static boolean secure;
	static boolean debug;
	static String accessKey;
	static String secretKey;
	static HashMap<String, String> endPoints;
	public Config() throws IOException
	{
		secure = false;
		debug = false;
		
		//Get Access Key and Secret Key from file
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
		Properties prop = new Properties();
		
		if(inputStream != null)
		{
			prop.load(inputStream);
		}else
		{
			throw new FileNotFoundException("Property File Not Found");
		}
		
		accessKey = prop.getProperty("accessKey");
		secretKey = prop.getProperty("secretKey");
		secure = Boolean.parseBoolean(prop.getProperty("secure"));
		debug = Boolean.parseBoolean(prop.getProperty("debug"));
		
		//Set up endpoints
		endPoints = new HashMap<String, String>();
		endPoints.put("compute","https://compute.ind-west-1.staging.jiocloudservices.com");
		endPoints.put("vpc", "https://vpc.ind-west-1.jiocloudservices.com");
		endPoints.put("dss", "https://dss.ind-west-1.jiocloudservices.com");
		endPoints.put("iam", "https://iam.ind-west-1.jiocloudservices.com");
		endPoints.put("rds", "https://rds.ind-west-1.jiocloudservices.com");
	}

	public static boolean isSecure() {
		return secure;
	}

	public static boolean isDebug() {
		return debug;
	}

	public static String getAccessKey() {
		return accessKey;
	}

	public static String getSecretKey() {
		return secretKey;
	}
	
	public static String getServiceUrl(String serviceName){
		return (String)endPoints.get(serviceName);
		
	}

}
