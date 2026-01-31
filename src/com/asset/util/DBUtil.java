package com.asset.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
public static Connection getConnection()throws Exception
{   Connection con=null;
try
{
	Class.forName("oracle.jdbc.OracleDriver");
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String pass="1234";
	con=DriverManager.getConnection(url,user,pass);
	return con;
}
catch(ClassNotFoundException|SQLException e)
{
	System.out.println(e);
}
return null;
}
}
