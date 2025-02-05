import java.sql.*;
import java.util.*;
public class emp {
	public static void main(String[] args)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connectioncon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ammulu123");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("INSERT INTO e1 values(23,'john',10000,'CSE')");
			ResultSetrs=stmt.executeQuery("select * from e1");
			while(rs.next())
			{
				System.out.println ("\t"+rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4));
			}
			stmt.close();
			con.close();
		}
		catch(ClassNotFoundExceptione)
		{
			System.out.println("Exception:"+"oracle driver not available"+e.getMessage());
		}
		catch(SQLExceptione)
		{
			System.out.println("Exception:"+"improper syntax in statement"+e.getMessage());
		}
	}
}
