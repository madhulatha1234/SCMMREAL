package com.crm.GeneticUtilities;

public interface IPathConstant {
	
	 String DBURL="jdbc:mysql://localhost:3306/";
	String DBUSERNAME ="root";
	 String DBPASSWORD="root";
	 String  FILEPATH="./src/test/resources/CommonData.properties";
	 String EXCELPATH="./src/test/resources/Sheet2.xlsx";
	 String UsernameByID="login:username";
	 String PasswordByID="login:password";
	 String MSGClickByXpath="//body[@class='login-box']";
	 String DDAddressBYID="login:type";
	 String ClickOnLoginButtonByXpath="//input[@value='Login']";
	 
	 
}
