package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class AAcreatedataintodatabase {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
Driver driver=new Driver();
DriverManager.registerDriver(driver);

ResultSet res = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet45","root","root")
.createStatement().executeQuery("Select * from studentInfo");
//System.out.println(res);
String st="java";
boolean flag=false;
while(res.next())
{
	String actualresult = res.getString(3);
	System.out.println(actualresult);
	if(actualresult.contains(st)) {
	flag=true;
	}

}
if(flag) {
	System.out.println("database is fetch");
}
else {
	System.out.println("Data base is not fetch");
}

	}

}
