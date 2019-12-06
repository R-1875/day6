package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//import com.mysql.cj.protocol.Resultset;

public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
		
Statement st= con.createStatement();



//int rows=st.executeUpdate("insert into allemp(empId,empName,empSal) values (104,'DJ',6666.66)");

int rows=st.executeUpdate("update allemp set empSal=empSal+2222.22 where empId=102 ");

//Resultset rows= st.executeQuery("select * from allemp");

//while(r.next())
//{
//	
//	int id=r.getInt("empId")
//}


System.out.println(rows+"    row inserted");


st.close();
con.close();		

	}
 
		// TODO Auto-generated method stub

	

}
