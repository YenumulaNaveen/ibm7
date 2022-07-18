import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;



public class StatementDemo {
	
	public static void main(String[] args) throws SQLException {
		String sql ="insert into person values ('siri', 23, 'siddipet')";
		
		Connection conn = JdbcFactory.getConnection();
		Statement stmt = conn.createStatement();
		//execute sql query
		stmt.executeUpdate(sql);
		System.out.println("Record inserted");
		
	}

}	