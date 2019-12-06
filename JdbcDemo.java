package com.slk.backend;


import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try
	{
		Class.forName("com.mysql.jdbc.Driver"); 
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
		
		
		
		
		
		Statement st= con.createStatement();
		
		
		
		int rows=st.executeUpdate("insert into allemp(empId,empName,empSal) values (101,'VJ',9999.99)");
		
		System.out.println(rows+"   row inserted");
		
		
		st.close();
		con.close();
		
		
	}
		catch(Exception e)
		{
			
			
		}
		
		
		

		
		
		
		
	}

}
