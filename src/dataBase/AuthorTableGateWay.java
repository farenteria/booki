package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.*;
import com.mysql.jdbc.exceptions.jdbc4.MySQLDataException;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class AuthorTableGateWay {
	
	//URL has server host, port, and database
	

	//create the connection
	
	
	public AuthorTableGateWay() {
		try {
			MysqlDataSource ds = new MysqlDataSource();
			ds.setURL("jdbc:mysql://easel2.fulgentcorp.com:3306/authorInfo");
			ds.setUser("wwh124");
			ds.setPassword("sanAntonio1234");
			Connection conn = ds.getConnection();
			System.out.println("connected\n");
			conn.close();
		}catch(Exception ex){
			System.out.println(ex);// error checking for connection	
		}
		
	}
	
	

}
