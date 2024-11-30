package ir.freeland.jsondatabasesequrity.quize.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Tt {
	
	private static String user;
	private static String pass;
	private static String url;
	
	private static Connection con;
	
	private Tt(String user, String pass, String url) {
		super();
		this.user = user;
		this.pass = pass;
		this.url = url;
	}

	public static Connection getConnection() {
	
		if(con==null) {
		    try {
				con = DriverManager.getConnection(user, pass, url);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
		
	}

}
