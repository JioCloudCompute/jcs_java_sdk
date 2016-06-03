package com.jcs_java_sdk;

import java.util.ArrayList;

import com.jcs_java_sdk.Compute;
import com.jcs_java_sdk.compute_api.model.DescribeImagesRequest;
import com.jcs_java_sdk.compute_api.model.DescribeImagesResponse;
import com.jcs_java_sdk.compute_api.model.transform.DescribeImagesUnmarshaller;

public class Test {

	public static void main(String[] args) 
	{
		Compute obj = new Compute();
		DescribeImagesRequest req = new DescribeImagesRequest();
		ArrayList<String> imageIds = new ArrayList<String>();
		imageIds.add("jmi-26f93d93");
		req.setImageIds(imageIds);
		String xmlDoc = obj.describeImages(req);
		System.out.println(xmlDoc);
		DescribeImagesResponse res = DescribeImagesUnmarshaller.XMLObject(xmlDoc);
		System.out.println( res.getRequestId());
		boolean a = true;
		System.out.println(res.getImages().get(0).getBlockDeviceMapping().isDeleteOnTermination());
	}

}
