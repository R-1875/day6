package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
		
Statement st= con.createStatement();



//int rows=st.executeUpdate("insert into allemp(empId,empName,empSal) values (104,'DJ',6666.66)");

//int rows=st.executeUpdate("insert into allemp(empId,empName,empSal) values (101,'VJ',9999.99)");

Resultset rows=(Resultset) st.executeQuery("select * from allemp");


System.out.println(rows+"    row inserted");


st.close();
con.close();		

	}

}
