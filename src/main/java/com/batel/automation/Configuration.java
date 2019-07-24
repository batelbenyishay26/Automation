package com.batel.automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties propertyFile = new Properties();
		InputStream input =null;
		
		try {
			input = new FileInputStream("app.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			propertyFile.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(propertyFile.getProperty("URL"));
	}

}
