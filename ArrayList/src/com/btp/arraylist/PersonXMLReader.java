package com.btp.arraylist;

import org.w3c.dom.NodeList;

public class PersonXMLReader extends XMLReader {
	public PersonXMLReader() {
		
	}
	
	public void populateRolodex(Rolodex rolodex, String fileName) {
		NodeList nodeList;
		loadFileFromResources(fileName);
		nodeList = getNodeList("people");
	}
}
