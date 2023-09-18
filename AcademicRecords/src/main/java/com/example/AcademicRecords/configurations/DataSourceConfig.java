package com.example.AcademicRecords.configurations;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC"); // Specify the correct driver class name for SQLite
		dataSource.setUrl("jdbc:sqlite:coloque o caminho para o banco de dado aqui"); // Replace with
																										// your database
																										// file path
		return dataSource;
	}
}
