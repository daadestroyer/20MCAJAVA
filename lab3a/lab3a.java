package lab3a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 

public class lab3a {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rvce", "root", "root");
			Statement st = con.createStatement();
			
			 
			
			/* 
			String query2 = "insert into student values (103,'Shubhanshu','Arya','23','shubhanshuarya1000@gmail.com')";
			int rs = st.executeUpdate(query2);
			if(rs>0) {
				System.out.println("Data Inserted Successfully...");
			}
			else {
				System.out.println("Data Is Not Inserted...");
			}
			 */
			
			/*
			String query3 = "delete from student where id = 103";
			int rs = st.executeUpdate(query3);
			if(rs>0) {
				System.out.println("Data Deleted Successfully...");
			}
			else {
				System.out.println("Data Is Not Deleted ...");
			}
			*/
			
			/*
			String query4 = "update student set age = 25 where id = 104";
			int rs = st.executeUpdate(query4);
			if(rs>0) {
				System.out.println("Data Deleted Successfully...");
			}
			else {
				System.out.println("Data Is Not Deleted ...");
			}
			*/
			

			String query5 = "select * from student";
			ResultSet resultSet = st.executeQuery(query5);
			 
			while (resultSet.next()) {
				System.out.println("ID : "+resultSet.getInt("id"));
				System.out.println("First Name : "+resultSet.getString("first"));
				System.out.println("Last Name : "+resultSet.getString("last"));
				System.out.println("Age : "+resultSet.getInt("age"));
				System.out.println("Email : "+resultSet.getString("email"));
				System.out.println();
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}