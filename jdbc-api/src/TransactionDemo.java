import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class TransactionDemo {
	public static void main(String[] args ) {
		String sql1 = "insert into person values('derk',43,'mysoor')";
		String sql2 = "update person set age=22 where name='siri'";
		String sql3 = "delete from person where nam='frank'";
		Connection conn = null;
		
		try {
			conn = JdbcFactory.getConnection();
		conn.setAutoCommit(false);
		
		Statement stmt = conn.createStatement();
		stmt.addBatch(sql1);
		stmt.addBatch(sql2);
		stmt.addBatch(sql3);

		stmt.executeBatch();
		conn.commit();
		System.out.println("transaction completed");
	}
	catch (SQLException e) {
		System.out.println("transaction failed due to...");
		e.printStackTrace();
		try {
			conn.rollback();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	}

}
