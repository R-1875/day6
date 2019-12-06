package dynamicqueries;


import java.util.*;
import java.sql.*;
public class DeleteDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		Scanner s=new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=
				
DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");

PreparedStatement pst= 
				
con.prepareStatement("delete from allemp where empId=? ");	

pst.setInt(1, s.nextInt());


int rows=pst.executeUpdate();

System.out.println(rows + "row deleted sucessfully");

pst.close();
con.close();
		
		
		
	}

}
