package dynamicqueries;

import java.sql.*;
import java.util.Scanner;

public class SelectDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		
		
		Connection con=
DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
		
		
		
		PreparedStatement pst= 
				
con.prepareStatement("select * from ? ");
				
		pst.setString(1, s.next());
				ResultSet rs=pst.executeQuery();
				
			
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + "  " +  rs.getString(2) +  "  " + rs.getDouble(3) );
		}
		
		
		pst.close();
		con.close();
	} 
		
		

	

}
