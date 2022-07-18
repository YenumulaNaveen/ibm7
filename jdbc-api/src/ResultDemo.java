import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class ResultDemo {
	
	public static void main(String[] args){
		String sql="select * from person";
		
		try {
		Connection c=JdbcFactory.getConnection();
		Statement stmt=c.createStatement();
		
		ResultSet rs= stmt.executeQuery(sql);
		
		ResultSetMetaData meta = (ResultSetMetaData) rs.getMetaData();
		for(int conn=1; conn<=meta.getColumnCount(); conn++)
			System.out.println(meta.getColumnName(conn) + "\t");
		
		System.out.println();
		
		while(rs.next())
			System.out.println(rs.getString(1)+"\t"+rs.getInt("age") + "\t" + rs.getString(3));}
		catch (SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
	}
 }

}
