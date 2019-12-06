package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
		
Statement st= con.createStatement();



//int rows=st.executeUpdate("insert into allemp(empId,empName,empSal) values (104,'DJ',6666.66)");

int rows=st.executeUpdate("update allemp set empSal=empSal+1000 ");




System.out.println(rows+"    row inserted");


st.close();
con.close();		

	} 
}
