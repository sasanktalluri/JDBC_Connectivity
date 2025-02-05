package jdbc_amigowallet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

		int id=10;
		String status="Testing";
		try 
 	 	{ 
 	 	 	// Class.forName("oracle.jdbc.driver.OracleDriver"); 
 	 	 	// Connection con = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe","system","9848"); 
 	 	 	Connection con = DriverManager.getConnection ("jdbc:postgresql://localhost:5432/Amigo_Wallet","postgres","admin"); 
			Statement stmt=con.createStatement(); 
	
 	 	 	stmt.executeUpdate("INSERT INTO status values("+id+",'"+status+"')"); 
 	 	 	ResultSet rs=stmt.executeQuery("select * from status"); 
 	 	 	while(rs.next()) 
 	 	 	{ 
				System.out.println ("\t"+rs.getInt(1) + "\t" + rs.getString(2)); 
 	 	 	} 
 	 	 	stmt.close();  	 	 	
			con.close(); 
 	 	} 
 	 	catch(Exception e) {
			
			e.printStackTrace();
		}
		

    }
}