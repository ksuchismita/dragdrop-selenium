package DatsbaseTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.testng.annotations.Test;

import com.mysql.jdbc.Statement;

public class DBDemo {
	@Test
	public void DBMethod() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver"); // driverloaded
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "suchi", "suchi");//create connect
		
		java.sql.Statement smt = con.createStatement();
		
		ResultSet rs = smt.executeQuery("select* from STUDENT");
		
		
		ResultSet rs1 = smt.executeQuery("select name from STUDENT");
		
		ResultSet rs2 = smt.executeQuery("insert into STUDENT values('srilanka', 106, 3465789326)");
		
		while(rs.next()){
			System.out.println("name:" +rs.getString("NAME") + "  " +"rollno:" +rs.getInt("ROLLNO") + "  " + "phno:" +rs.getInt("PHNO"));
		}
		while(rs1.next()){
			String name = rs1.getString("NAME");
			System.out.println(name);
		}
			while(rs2.next()){
				String name = rs2.getString("NAME");
				System.out.println(name);
				
				
			}
		
			
	}
  
  }
	 

