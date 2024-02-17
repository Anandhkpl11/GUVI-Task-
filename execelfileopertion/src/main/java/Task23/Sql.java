package Task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.checkerframework.checker.units.qual.s;

public class Sql {
	
	public static void main(String[] args) throws SQLException {
		
		
		//Q.No 1     https://docs.google.com/document/d/1pOYhSCpodnykeMdW7Lgst_93CBVpo5N9HhRqPyhoYxE/edit?usp=sharing
		
	   //Q.No 2	JDBC Connection
		
		//Database connection
		
		String databaseurl="jdbc:mysql://localhost:3306";
		String username="root";
		String password="root";
		
		// connect sql
	 Connection connection = DriverManager.getConnection(databaseurl, username,password);
	 
	 if(connection!=null) {
			
			System.out.println("Connection sucessfull");
		} else {
			
			System.out.println("Connection unsucessfull");
		}

	 
	 Statement statement = connection.createStatement();
	 String createdb="create database Emp";
	 String use="Emp";
	 String createtable="create table employee(empcode int,empname varchar(20),empage int,empsalary int)";
	 String insertdata="insert into employee values(101,'Jenny',25,10000)"+
	                                               "(102,'jacky',30,20000)"+
			                                       "(103,'Joe',20,40000)"+
	                                               "(104,'John',40,80000"+
			                                        "(105,'Shameer',25,90000";
	 String select="select * from employee";
	 
	 
	 
	 //create database
    statement.execute(createdb);
	
	 //create database use
	 statement.execute(use);
	 
	 //create table
	 statement.execute(createtable);
	 
	 // add employee data
	 
	 statement.execute(insertdata);
	 
	 // execute Query
	 ResultSet executeQuery = statement.executeQuery(select);
	 
	// iterate result
	 
	 while (executeQuery.next()) {
		System.out.println(executeQuery.getInt("empcode")+" "+executeQuery.getString("empname")+" "+
				           executeQuery.getInt("empage")+" "+executeQuery.getInt("empsalary"));
		
	}	 
		
		
	 connection.close();
		
		
		
		
		
	}
	
	

}
