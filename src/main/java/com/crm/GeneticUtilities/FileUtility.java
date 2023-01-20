package com.crm.GeneticUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
public String readdatafromPropertyFile(String key) throws Throwable {
	FileInputStream fis=new FileInputStream(IPathConstant.FILEPATH);
	Properties pob=new Properties();
	pob.load(fis);
	String value=pob.getProperty(key);
	return value;
}
}
