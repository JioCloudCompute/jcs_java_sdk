package com.jcs_java_sdk.compute_api.model;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ErrorResponse {
		
	public static void Error(final String xmlDoc)
	{
		DocumentBuilder db;
		try {
			db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			InputSource is = new InputSource();
			is.setCharacterStream(new StringReader(xmlDoc));

			Document doc;
			try {
				doc = db.parse(is);
				Element Root = doc.getDocumentElement();
				Node Ch = Root.getFirstChild().getFirstChild().getFirstChild();
				System.out.println(Ch.getNodeValue());
				Ch= Ch.getNextSibling();
				System.out.println(Ch.getNodeValue());
				
			} catch (SAXException | IOException e) {
				e.printStackTrace();
			}
			
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
    
	}
}
