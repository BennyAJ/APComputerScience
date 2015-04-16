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
		loadFileFromResources(fileName); //Gets the xml file
		nodeList = getNodeList("person"); //Gets main list of nodes
		for(int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i); //Goes to each entry in node list
			firstName = element.getElementsByTagName("firstname").item(0).getTextContent();
			lastName = element.getElementsByTagName("lastname").item(0).getTextContent();
			address = element.getElementsByTagName("address").item(0).getTextContent();
			phoneNum = element.getElementsByTagName("phone").item(0).getTextContent();
			//Fills each rolodex entry with xml data
			rolodex.addFileEntry(firstName, lastName, address, phoneNum);
		}
	}
}
