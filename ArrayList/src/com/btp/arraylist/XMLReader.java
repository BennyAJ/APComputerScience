package com.btp.arraylist;

import java.io.File;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class XMLReader {
	private File file;
	private DocumentBuilderFactory docBuilderFactory;
	private DocumentBuilder docBuilder;
	private Document doc;
	
	public XMLReader() {
		try { //Requires a try catch in case it fails
			docBuilderFactory = DocumentBuilderFactory.newInstance(); //Gets instance of a factory
			docBuilder = docBuilderFactory.newDocumentBuilder(); //Creates a new document builder
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void fillDocument(File file) {
		try { //Requires a try catch
			doc = docBuilder.parse(this.file);
			doc.getDocumentElement().normalize(); //Ensures data is in a correctly readable format
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void loadFileFromResources(String fileName) { //Loads from a file within the project
		URL url = getClass().getResource(fileName); //Gets the location of a file in the project by its name
		file = new File(url.getPath()); //Sets the working file to this path
		fillDocument(file);
	}
	
	public void loadFileFromSystem(String filePath) { //Loads from a file on the system
		file = new File(filePath); //Sets the working file to an absolute or relative system path
		fillDocument(file);
	}
	
	public NodeList getNodeList(String nodeTag) {
		if(file.exists()) {//Checks to make sure a legitimate file has been loaded
			return doc.getElementsByTagName(nodeTag); //Returns the list of nodes with given tag
		}
		else {
			System.err.println("No file has been loaded");
			return null; //Returns nothing
		}
	}
}
