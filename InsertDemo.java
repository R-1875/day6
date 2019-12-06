package dynamicqueries;


import java.sql.*;

import java.util.*;

public class InsertDemo {

	public static void main(String[] args) throws Exception{
		
		
		Scanner s=new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
		
		
		PreparedStatement pst= con.prepareStatement("insert into allemp values (?,?,?) ");
		
		
		pst.setInt(1, s.nextInt());
		pst.setString(2, s.next());
		pst.setDouble(3, s.nextDouble());
		
		
		
		int rows=pst.executeUpdate();
		
		
	}

}
