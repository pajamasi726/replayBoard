package DB;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBManager 
{
	private static DataSource ds = null;

	private DBManager()
	{
		init();
	}// method end
	
	private void init()
	{
		Context init = null;
		try 
		{
			init = new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/boardDB");
		} 
		catch (NamingException e){e.printStackTrace();}
	}
	
	public static Connection get_DB_Connection()
	{
		Connection conn = null;
		
		if(ds == null)
		{
			new DBManager();
		}
		try 
		{
			// dbcp pool 로 부터 커넥션 한개 받아오기
			conn = ds.getConnection();
		} 
		catch (SQLException e) 
		{ 
			e.printStackTrace();
		}
	
		return conn;
	}
}
