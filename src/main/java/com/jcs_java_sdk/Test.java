package com.jcs_java_sdk;

import java.util.ArrayList;

import com.jcs_java_sdk.Compute;
import com.jcs_java_sdk.compute_api.model.DescribeImagesRequest;

public class Test {

	public static void main(String[] args) 
	{
		Compute obj = new Compute();
		DescribeImagesRequest req = new DescribeImagesRequest();
		ArrayList<String> imageIds = new ArrayList<String>();
		imageIds.add("jmi-26f93d93");
		req.setImageIds(imageIds);
		String res = obj.describeImages(req);
		System.out.println(res);
	}

}
