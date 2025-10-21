package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {
		String userName = "root";
		String password = "rootmysql123";
		String address = "jdbc:mysql://localhost:3306/dilipdb1";

		String createTable = "create table QEA25QE028(id INT AUTO_INCREMENT PRIMARY KEY,"
				+ " employee_name VARCHAR(40), employee_role VARCHAR(40))";
		
		
		String inserData = "insert into QEA25QE028 (employee_name, employee_role) VALUES(?, ?)";
		
		String readData = "Select * from QEA25QE028";
		
		Connection connectin;
		PreparedStatement st;
		
		try {
			connectin = DriverManager.getConnection(address, userName, password);
			
			
			st = connectin.prepareStatement(readData);
			
			
//			st.setString(1, "Dileep");
//			st.setString(2, "Tester");
//		
//			st.executeUpdate();
//			
//			st.setString(1, "APsar");
//			st.setString(2, "Devps");
//			
//			st.executeUpdate();
//			
//			System.out.println("table is created");
			
			ResultSet result = st.executeQuery();
			
			
			while(result.next()) {
				System.out.println(result.getString("employee_name") +  " " + result.getString("employee_role"));
			}
			
			st.close();
			connectin.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} 
	}
}
