package com.jcs_java_sdk.compute_api;

import java.util.TreeMap;

import com.jcs_java_sdk.HttpVar;
import com.jcs_java_sdk.Requestify;
import com.jcs_java_sdk.compute_api.model.CreateKeyPairRequest;
import com.jcs_java_sdk.compute_api.model.DeleteKeyPairRequest;
import com.jcs_java_sdk.compute_api.model.ImportKeyPairRequest;

public class KeyPair 
{
	public String describeKeyPairs(HttpVar info)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "DescribeKeyPairs");
		params.put("Version", info.version);
		
		return Requestify.makeRequest(info, params);
	}
	
	public String createKeyPair(HttpVar info, CreateKeyPairRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "CreateKeyPair");
		params.put("Version", info.version);
		
		if(req.getKeyName().length() == 0)
		{
			System.out.println("Error : KeyName required");
		}
		else
		{
			params.put("KeyName", req.getKeyName());
		}
		return Requestify.makeRequest(info, params);		
	}
	
	public String deleteKeyPair(HttpVar info, DeleteKeyPairRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "DeleteKeyPair");
		params.put("Version", info.version);
		
		if(req.getKeyName().length() == 0)
		{
			System.out.println("Error : KeyName required");
		}
		else
		{
			params.put("KeyName", req.getKeyName());
		}
		return Requestify.makeRequest(info, params);		
	}

	public String importKeyPair(HttpVar info, ImportKeyPairRequest req)
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put("Action", "ImportKeyPair");
		params.put("Version", info.version);
		
		if(req.getKeyName().length() == 0)
		{
			System.out.println("Error : Key-name required");
		}
		else
		{
			params.put("KeyName", req.getKeyName());
		}

		if(req.getPublicKeyMaterial().length() == 0)
		{
			System.out.println("Error : public-key-material required");
		}
		else
		{
			params.put("PublicKeyMaterial", req.getPublicKeyMaterial());
		}
		return Requestify.makeRequest(info, params);		
	}
}
