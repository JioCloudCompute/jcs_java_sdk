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

import java.util.TreeMap;

import com.ril.jcs.services.HttpVar;
import com.ril.jcs.services.Requestify;
import com.ril.jcs.services.compute.exception.ComputeClientException;
import com.ril.jcs.services.compute.model.CreateKeyPairRequest;
import com.ril.jcs.services.compute.model.DeleteKeyPairRequest;
import com.ril.jcs.services.compute.model.ImportKeyPairRequest;

public class KeyPair 
{
	public String describeKeyPairs(HttpVar info) throws ComputeClientException
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.DESCRIBE_KEY_PAIRS);
		params.put(Constants.VERSION, info.version);
		
		return Requestify.makeRequest(info, params);
	}
	
	public String createKeyPair(HttpVar info, CreateKeyPairRequest req) throws ComputeClientException
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.CREATE_KEY_PAIR);
		params.put(Constants.VERSION, info.version);
		
		if(req.getKeyName().length() == 0)
		{
			System.out.println("Error : KeyName required");
		}
		else
		{
			params.put(Constants.KEY_NAME, req.getKeyName());
		}
		return Requestify.makeRequest(info, params);		
	}
	
	public String deleteKeyPair(HttpVar info, DeleteKeyPairRequest req) throws ComputeClientException
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.DELETE_KEY_PAIR);
		params.put(Constants.VERSION, info.version);
		
		if(req.getKeyName().length() == 0)
		{
			System.out.println("Error : KeyName required");
		}
		else
		{
			params.put(Constants.KEY_NAME, req.getKeyName());
		}
		return Requestify.makeRequest(info, params);		
	}

	public String importKeyPair(HttpVar info, ImportKeyPairRequest req) throws ComputeClientException
	{
		TreeMap<String, String>params = new TreeMap<String,String>();
		params.put(Constants.ACTION, Constants.IMPORT_KEY_PAIR);
		params.put(Constants.VERSION, info.version);
		
		if(req.getKeyName().length() == 0)
		{
			System.out.println("Error : Key-name required");
		}
		else
		{
			params.put(Constants.KEY_NAME, req.getKeyName());
		}

		if(req.getPublicKeyMaterial().length() == 0)
		{
			System.out.println("Error : public-key-material required");
		}
		else
		{
			params.put(Constants.PUBLIC_KEY_MATERIAL, req.getPublicKeyMaterial());
		}
		return Requestify.makeRequest(info, params);		
	}
}
