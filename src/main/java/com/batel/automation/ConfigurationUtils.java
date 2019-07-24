package com.batel.automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationUtils {
	public static void main(String[] args) throws IOException
	{
	//public ConfigurationUtils()
		Properties propertyFile = new Properties();
		InputStream input =null;
		
		try {
			input = new FileInputStream("app.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		propertyFile.load(input);
		System.out.println(propertyFile.getProperty("URL"));
		
	}
}

