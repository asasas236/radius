package com.telnet.radius.demo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.telnet.radius.model.Radacct;

public class MySqlConnTest {

	public static void main(String[] args) {

		

	}
	
	public void test1(){
		int randpwd = (int) (Math.random() * 999999);
		System.out.println(randpwd);
	}

	public void test() {
		Date date = new Date(System.currentTimeMillis());
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.getTime());

		Integer year = 2013;
		System.out.println(year.equals(2013));
	}

	public static void testConn() {
		String driver = "com.mysql.jdbc.Driver";
		// String url = "jdbc:mysql://192.168.9.222:3306/radius";
		// String url = "jdbc:mysql://localhost:3306/radius";
		String url = "jdbc:mysql://192.168.2.13:3306/radius";
		/*
		 * String username = "root"; String password = "";
		 */
		String username = "myuser";
		String password = "mypassword";

		try {
			Class.forName(driver);
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(url, username, password);
				if (conn != null && !conn.isClosed()) {
					System.out.println("Connection ok!!!");
				} else {

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
