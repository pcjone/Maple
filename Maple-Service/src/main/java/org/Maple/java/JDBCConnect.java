package org.Maple.java;

import java.sql.*;

public class JDBCConnect {
	
	public static final String USER = "username";
	public static final String PASS = "password";
	
	public static final String DB_URL = "";
	
	public void connect() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Connecting to database...");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		
		
		
		System.out.println("Creating statement...");
		Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT id, first, last, age FROM Employees";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()){
		    //Retrieve by column name
		    int id  = rs.getInt("id");
		    int age = rs.getInt("age");
		    String first = rs.getString("first");
		    String last = rs.getString("last");

		    //Display values
		    System.out.print("ID: " + id);
		    System.out.print(", Age: " + age);
		    System.out.print(", First: " + first);
		    System.out.println(", Last: " + last);
		}
		
		rs.close();
		stmt.close();
		conn.close();
	}

}
