package com.spring.training.basic.xml;

public class XMLPersonDao {
	
	public XMLJdbcConnection getJdbcConnection() {
		return xmlJdbcConnection;
	}

	

	XMLJdbcConnection xmlJdbcConnection;

	public void setXmlJdbcConnection(XMLJdbcConnection xmlJdbcConnection) {
		this.xmlJdbcConnection = xmlJdbcConnection;
	}

	public XMLPersonDao() {
		System.out.println("PersonDao Created");
	}
	
}
