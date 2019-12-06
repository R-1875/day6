package dynamicqueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.util.*;

public class UpdateDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
		
		
		
		PreparedStatement pst= 
				
		con.prepareStatement("update allemp set empSal=? where empName like ? ");
		
		
		pst.setDouble(1, s.nextDouble());
		pst.setString(2, s.next());
		
		
		
		int rows=pst.executeUpdate();
		
		System.out.println(rows);
		
		pst.close();
		con.close();

	}

}
