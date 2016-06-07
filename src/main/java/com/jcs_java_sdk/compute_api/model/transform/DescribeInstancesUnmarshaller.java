package com.jcs_java_sdk.compute_api.model.transform;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamReader;

import com.jcs_java_sdk.compute_api.model.DescribeInstancesResponse;

public class DescribeInstancesUnmarshaller {
	
	public static DescribeInstancesResponse XMLObject(final String xmlDoc)
	{	
		
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(DescribeInstancesResponse.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			DescribeInstancesResponse res = (DescribeInstancesResponse) jaxbUnmarshaller.unmarshal(new StringReader(xmlDoc));
			return res;
		} catch (JAXBException e) {
			e.printStackTrace();
			System.out.println("JAXB Error");
		}
		return null;
		
	}

}
