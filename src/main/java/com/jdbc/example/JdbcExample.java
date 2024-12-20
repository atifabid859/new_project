package com.jdbc.example;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class JdbcExample {
	public static void main(String[] args) {
		
		Properties properties =new Properties();
		try {
			FileInputStream fileInputStream = new FileInputStream("src/main/resources/application.properties");
			properties.load(fileInputStream);
			
			String url = properties.getProperty("spring.datasource.url");
			String username = properties.getProperty("spring.datasource.username");
			String password = properties.getProperty("spring.datasource.password");
			String classDriverName = properties.getProperty("spring.datasource.driver-class-name");
			Class.forName(classDriverName);
			String saveData = "insert into student_manage(name,password,email,address) VALUES(?,?,?,?)";
			try (Connection connection = DriverManager.getConnection(url, username, password)){
				
				PreparedStatement preparedStatement = connection.prepareStatement(saveData);
				preparedStatement.setString(1, "salman");
				preparedStatement.setString(2, "12345");
				preparedStatement.setString(3, "salman12@gmail.com");
				preparedStatement.setString(4, "Saki Naka");
				int executeUpdate = preparedStatement.executeUpdate();
				if (executeUpdate > 0) {
					System.out.println("Successfull");
				}
				else {
					System.out.println("Successfull");
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
