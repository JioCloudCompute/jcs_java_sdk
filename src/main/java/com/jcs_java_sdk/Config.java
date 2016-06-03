package com.jcs_java_sdk;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class Config {
	
	boolean secure;
	boolean debug;
	String accessKey;
	String secretKey;
	HashMap<String, String> endPoints;
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
		
		//Set up endpoints
		endPoints = new HashMap<String, String>();
		endPoints.put("compute","https://compute.ind-west-1.staging.jiocloudservices.com");
		endPoints.put("vpc", "https://vpc.ind-west-1.jiocloudservices.com");
		endPoints.put("dss", "https://dss.ind-west-1.jiocloudservices.com");
		endPoints.put("iam", "https://iam.ind-west-1.jiocloudservices.com");
		endPoints.put("rds", "https://rds.ind-west-1.jiocloudservices.com");
	}

	public boolean isSecure() {
		return secure;
	}

	public boolean isDebug() {
		return debug;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getSecretKey() {
		return secretKey;
	}
	
	public String getServiceUrl(String serviceName){
		return (String)endPoints.get(serviceName);
		
	}

}
