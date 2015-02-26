package com.btp.arraylist;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class PersonXMLReader extends XMLReader {
	public PersonXMLReader() {
		
	}
	
	public void populateRolodex(Rolodex rolodex, String fileName) {
		String firstName;
		String lastName;
		String address;
		String phoneNum;
		NodeList nodeList;
		loadFileFromResources(fileName);
		nodeList = getNodeList("person");
		System.out.println("LENGTH = " + nodeList.getLength());
		for(int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			firstName = element.getElementsByTagName("firstname").item(0).getTextContent();
			lastName = element.getElementsByTagName("lastname").item(0).getTextContent();
			address = element.getElementsByTagName("address").item(0).getTextContent();
			phoneNum = element.getElementsByTagName("phone").item(0).getTextContent();
			System.out.println("Adding " + firstName + " " + lastName + ", " + address + ", " + phoneNum);
			rolodex.addFileEntry(firstName, lastName, address, phoneNum);
		}
	}
}
