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
import com.ril.jcs.services.compute.model.CreateKeyPairRequest;
import com.ril.jcs.services.compute.model.DeleteKeyPairRequest;
import com.ril.jcs.services.compute.model.ImportKeyPairRequest;

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
