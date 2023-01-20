package com.crm.GeneticUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {
	Connection con=null;
public void connectToDB() throws Throwable {
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	 con = DriverManager.getConnection(IPathConstant.DBURL,IPathConstant.DBUSERNAME,IPathConstant.DBPASSWORD);
	 
	}
public String executeQuery(String query,int columeIndex,String expData) throws Throwable {
	ResultSet result = con.createStatement().executeQuery(query);
	boolean flag = false;
	while(result.next()) {
		String data = result.getString(columeIndex);
		System.out.println(data);
		if(data.equalsIgnoreCase(expData)) {
			flag=true;
			break;
		}
	}
	if(flag) {
		System.out.println(expData +"Project is created");
		return expData;
	}
	else {
		System.out.println("Projected is not created");
		return " ";
	}}
	public void closeDB() throws Throwable {
		
	con.close();
}
}
