package lab3a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionProgram {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rvce", "root", "root");

			if (con != null) {
				System.out.println("Connected");
			} else {
				System.out.println("Not Connected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
