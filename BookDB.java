package SQL;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class BookDB {
	  public static Statement stmt = null;
	  public static ResultSet rs = null;
	  public static Connection conn = null;
	  
	  public static Connection Connect() {
		  try {
			  Class.forName("com.mysql.jdbc.Driver").newInstance();
		  } catch (Exception ex) {
			  ex.printStackTrace();
		  }
		  try {
			  conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb","root","123456");
		  } catch (SQLException ex) {
			  ex.printStackTrace();
		  }
		  return conn;
	  }
	  public static PreparedStatement Query(String sql,Connection conn){
		  PreparedStatement p = null;
			try {
				p = conn.prepareStatement(sql);
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return p;
	  }
		public static void close(Connection conn) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		public static void close(Statement stmt) {
			try {
				stmt.close();
				stmt = null;
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		public static void close(ResultSet rs) {
			try {
				rs.close();
				rs = null;
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
}
