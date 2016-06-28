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
package com.ril.jcs.services.compute;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.util.TreeMap;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.xml.bind.DatatypeConverter;

import com.ril.jcs.services.HttpVar;
import com.ril.jcs.services.Requestify;
import com.ril.jcs.services.Utils;
import com.ril.jcs.services.compute.model.DescribeInstanceTypesRequest;
import com.ril.jcs.services.compute.model.DescribeInstancesRequest;
import com.ril.jcs.services.compute.model.GetPasswordDataRequest;
import com.ril.jcs.services.compute.model.RebootInstancesRequest;
import com.ril.jcs.services.compute.model.RunInstancesRequest;
import com.ril.jcs.services.compute.model.StartInstancesRequest;
import com.ril.jcs.services.compute.model.StopInstancesRequest;
import com.ril.jcs.services.compute.model.TerminateInstancesRequest;

public class Instance
{
	public String describeInstances(HttpVar info, DescribeInstancesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.DESCRIBE_INSTANCES);
		params.put(Constants.VERSION, info.version);
		
		for(int i=0 ;  i<req.getInstanceIds().size() ; i++)
		{
			params.put(Constants.INSTANCE_ID + "." + Integer.toString(i+1), req.getInstanceIds().get(i));
		}
		
		return Requestify.makeRequest(info, params);
	}
	
	public String describeInstanceTypes(HttpVar info, DescribeInstanceTypesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.DESCRIBE_INSTANCE_TYPES);
		params.put(Constants.VERSION, info.version);
		
		for(int i=0 ;  i<req.getInstanceTypeIds().size() ; i++)
		{
			params.put( Constants.INSTANCE_TYPE_ID + "." + Integer.toString(i+1), req.getInstanceTypeIds().get(i));
		}
		
		return Requestify.makeRequest(info, params);
	}
	
	public String startInstances(HttpVar info, StartInstancesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.START_INSTANCES);
		params.put(Constants.VERSION, info.version);
		if(req.getInstanceIds().size() == 0)
		{
			System.out.println("Error : Instance-Id needed");
		}
		else
		{
			for(int i=0 ;  i<req.getInstanceIds().size() ; i++)
			{
				params.put(Constants.INSTANCE_ID + "." + Integer.toString(i+1), req.getInstanceIds().get(i));
			}
		}
		
		return Requestify.makeRequest(info, params);
	}
	
	public String stopInstances(HttpVar info, StopInstancesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.STOP_INSTANCES);
		params.put(Constants.VERSION, info.version);
		
		if(req.getInstanceIds().size() == 0)
		{
			System.out.println("Error : Instance-Id needed");
		}
		else
		{
			for(int i=0 ;  i<req.getInstanceIds().size() ; i++)
			{
				params.put(Constants.INSTANCE_ID + "." + Integer.toString(i+1), req.getInstanceIds().get(i));
			}
		}
		
		return Requestify.makeRequest(info, params);
	}	
	
	public String rebootInstances(HttpVar info, RebootInstancesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.REBOOT_INSTANCES);
		params.put(Constants.VERSION, info.version);
		
		if(req.getInstanceIds().size() == 0)
		{
			System.out.println("Error : Instance-Id needed");
		}
		else
		{
			for(int i=0 ;  i<req.getInstanceIds().size() ; i++)
			{
				params.put(Constants.INSTANCE_ID + "." + Integer.toString(i+1), req.getInstanceIds().get(i));
			}
		}
		
		return Requestify.makeRequest(info, params);
	}
	
	public String terminateInstances(HttpVar info, TerminateInstancesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.TERMINATE_INSTANCES);
		params.put(Constants.VERSION, info.version);
		
		if(req.getInstanceIds().size() == 0)
		{
			System.out.println("Error : Instance-Id needed");
		}
		else
		{
			for(int i=0 ;  i<req.getInstanceIds().size() ; i++)
			{
				params.put(Constants.INSTANCE_ID + "." + Integer.toString(i+1), req.getInstanceIds().get(i));
			}
		}
		
		return Requestify.makeRequest(info, params);
	}
	
	public String runInstances(HttpVar info, RunInstancesRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.RUN_INSTANCES);
		params.put(Constants.VERSION, info.version);
		
		if(req.getImageId().length() == 0)
		{
			System.out.println("Error : Image-Id needed");
		}
		else
		{
			params.put(Constants.IMAGE_ID, req.getImageId());
		}

		if(req.getInstanceTypeId().length() == 0)
		{
			System.out.println("Error : InstanceType-Id needed");
		}
		else
		{
			params.put(Constants.INSTANCE_TYPE_ID, req.getInstanceTypeId());
		}
		if(req.getBlockDeviceMapping().size() != 0)
		{
			for(int i=0 ; i<req.getBlockDeviceMapping().size() ; i++)
			{
				params.put(Constants.BLOCK_DEVICE_MAPPING +  "." + Integer.toString(i+1) + "." + Constants.DEVICE_NAME, req.getBlockDeviceMapping().get(i).deviceName);
				params.put(Constants.BLOCK_DEVICE_MAPPING +  "." + Integer.toString(i+1) + "." + Constants.DELETE_ON_TERMINATION, Boolean.toString(req.getBlockDeviceMapping().get(i).deleteOnTermination));
				params.put(Constants.BLOCK_DEVICE_MAPPING +  "." + Integer.toString(i+1) + "." + Constants.VOLUME_SIZE, Double.toString(req.getBlockDeviceMapping().get(i).volumeSize));
			}
		}
		if(req.getInstanceCount() != -1)
		{
			params.put(Constants.INSTANCE_COUNT, Integer.toString(req.getInstanceCount()));
		}
		if(req.getSubnetId().length()!=0)
		{
			params.put(Constants.SUBNET_ID, req.getSubnetId());
		}
		if(req.getPrivateIpAddress().length()!=0)
		{
			params.put(Constants.PRIVATE_IP_ADDRESS, req.getPrivateIpAddress());
		}
		if(!req.getSecurityGroupIds().isEmpty())
		{
			for(int i=0 ;  i<req.getSecurityGroupIds().size() ; i++)
			{
				params.put(Constants.SECURITY_GROUP_ID + "." + Integer.toString(i+1), req.getSecurityGroupIds().get(i));
			}
		}
		
		if(req.getKeyName().length()!=0)
		{
			params.put(Constants.KEY_NAME, req.getKeyName());
		}
		
		return Requestify.makeRequest(info, params);
	}
	
	public String decryptInstancePassword(String password, String privateKeyFile, String passphrase)
	{
		RSAPrivateKey privateKey;
		
		byte[] decodedPassword = null;
		String decryptedMessage = null;
		try 
		{
			decodedPassword = DatatypeConverter.parseBase64Binary(new String(DatatypeConverter.parseBase64Binary(password), "UTF-8"));

			

			privateKey = (RSAPrivateKey) Utils.readPrivateKey(privateKeyFile,passphrase);
			Cipher decrypt=Cipher.getInstance("RSA/ECB/PKCS1Padding");
			decrypt.init(Cipher.DECRYPT_MODE, privateKey);
			decryptedMessage = new String(decrypt.doFinal(decodedPassword), StandardCharsets.UTF_8);
			
		} 
		catch (InvalidKeyException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return decryptedMessage;
		
	}
	
	public String getPasswordData(HttpVar info, GetPasswordDataRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.GET_PASSWORD_DATA);
		params.put(Constants.VERSION, info.version);
		
		if(req.getInstanceId().length() == 0)
		{
			System.out.println("Instance-Id required");
		}
		else
		{
			params.put(Constants.INSTANCE_ID, req.getInstanceId());
		}
		return Requestify.makeRequest(info, params);
	}
	
	
}
