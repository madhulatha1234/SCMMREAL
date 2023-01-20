package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class createdatatoserver {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		int result=0;
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		 con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
		Statement state = con.createStatement();
	String query="insert into project values('TY_SCM_888','Supply_management','21/12/2022','Madhu','ongoing',4);";
		
		result = state.executeUpdate("delete from project where project_id = 'TY_SCM_88';");
		//result=state.executeUpdate(query);
		if(result==1) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("data not deleted");
		}
		con.close();
	}

}
