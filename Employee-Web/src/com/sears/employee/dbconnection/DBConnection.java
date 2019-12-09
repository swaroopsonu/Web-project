package com.sears.employee.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection con = null;

	static {

		String UserName = "interns";
		String PassWord = "Interns@2019";

		String Url = "jdbc:mysql://172.29.80.35:3372/training_schema";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(Url, UserName, PassWord);
		}// end of try
		catch (ClassNotFoundException cne) {
			cne.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// end of static

	public static Connection getCon() {
		return con;
	}

}
