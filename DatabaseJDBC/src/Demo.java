import java.sql.*;  
class Demo
{
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/DBCon","root","Khadake1234");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
//PreparedStatement ps = con.prepareStatement("CREATE DATABASE databasename");
//int result = ps.executeUpdate();
ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  