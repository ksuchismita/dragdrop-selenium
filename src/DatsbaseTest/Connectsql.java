package DatsbaseTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class Connectsql {

	@Test
	public void testDB() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "suchi", "suchinew");
		System.out.println("database connected");
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from emp");
		ResultSet rs1 = smt.executeQuery("select * from employee");
		while (rs.next()) {
			System.out.println("EID : " + rs.getInt("EID") + " - ESALARY : "
					+ rs.getInt("ESALARY") + " - EADDRESS : "
					+ rs.getShort("EADDRESS") + " - PHNO : "
					+ rs.getInt("PHNO"));		}
		while (rs1.next()){
		
			String Ename = rs1.getString("Ename");
			System.out.println("address of emp is :" +Ename);
		}
	}

}
