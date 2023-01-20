package com.crm.GeneticUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
public int getRandomNo() {
	Random ran=new Random();
	int random = ran.nextInt(500);
	return random;
}
public String getSystemData() {
	Date dt=new Date();
	String data = dt.toString();
	return data;
}
public String getSystemDateAndTimeInFormat() {
	SimpleDateFormat dateformate=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	Date systemDate=new Date();
	String getdateandtime = dateformate.format(systemDate);
	System.out.println(getdateandtime);
	return getdateandtime.replace(":", "-");
	
}
}
