package com.jcs_java_sdk.compute_api.model.transform;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.jcs_java_sdk.compute_api.model.DescribeImagesResponse;

public class DescribeImagesUnmarshaller {
	
	public static DescribeImagesResponse XMLObject(final String xmlDoc)
	{
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(DescribeImagesResponse.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			DescribeImagesResponse res = (DescribeImagesResponse) jaxbUnmarshaller.unmarshal(new StringReader(xmlDoc));
			return res;
		} catch (JAXBException e) {
			e.printStackTrace();
			System.out.println("JAXB Error");
		}
		return null;
		
	}

}
