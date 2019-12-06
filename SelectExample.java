package fetchrows;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.util.Scanner;

public class SelectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try{
			
			Scanner s=new Scanner(System.in);
			
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
			
			
			
			Statement st= con.createStatement();
			
			
			
			ResultSet rs= st.executeQuery("select * from allemp  ");
			
			
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + "  " +  rs.getString(2) +  "  " + rs.getDouble(3) );
			}
			
			
			st.close();
			con.close();
		} 
		
		
		catch(Exception e)
		{
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
