package DAO;


import java.sql.*;  
public class DbConnect{ 
    
public Connection getDbConnection(){ 
    
try{ 
    
    
    String db_name="sms";
    String url = "jdbc:mysql://localhost:3306/" + db_name;
		String user = "root";
		String pass = "1234";
//step1 load the driver class  
Class.forName("com.mysql.cj.jdbc.Driver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(url,user,pass);  
  
if(con==null)
{
    System.err.println("Connectin failed");
}
else
        return con;
}catch(Exception e){ System.out.println(e);}  
  
return null;
}  
}  