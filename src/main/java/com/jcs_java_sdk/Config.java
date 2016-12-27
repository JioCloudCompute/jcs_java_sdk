/*******************************************************************************
 * Copyright (c) 2016 Jiocloud.com, Inc. or its affiliates.  All Rights Reserved
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, dis-
 * tribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the fol-
 * lowing conditions:
 *
 * The above copyright notice and this permission notice shall be included
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
	public Config(String compute_endpoint, String access_key, String secret_key) throws IOException
	{
		secure = true;
		debug = false;	
  	accessKey = access_key;
		secretKey = secret_key;
		//Set up endpoints
		endPoints = new HashMap<String, String>();
    endPoints.put("compute", compute_endpoint);
	}

  public void setSecure(boolean sec)
  {
    secure=sec;
  }
  public void setDebug(boolean deb)
  {
    debug = deb;
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
