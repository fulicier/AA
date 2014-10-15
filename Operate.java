package Oper;

import Infor.Book;
import SQL.BookDB;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Operate {
	public static List<Book> BookList(String name) throws SQLException {
		String sql;
		Connection conn = BookDB.Connect();
		if( name !="")
			sql = "SELECT _book.isbn AS isbn,_book.title AS title,_author.name AS name FROM _book JOIN _author  ON _author.authorid=_book.authorid where name LIKE '%"+name+"%'";
		else
			sql = "	SELECT _book.isbn AS isbn,_book.title AS title,_author.name AS name FROM _book JOIN _author  ON _author.authorid=_book.authorid ";	
		PreparedStatement p = BookDB.Query(sql,conn);
		List<Book> books = new ArrayList<Book>();
		try {
			ResultSet rs = p.executeQuery();
			Book b = null;
			while(rs.next()) {
				b = new Book();
				b.SetISBN(rs.getLong("isbn"));
				b.SetTitle(rs.getString("title"));
				b.SetPublisher(rs.getString("publisher"));
				b.SetPrice(rs.getString("price"));
				books.add(b);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		BookDB.close(p);
		BookDB.close(conn);
		return books;
	}
			
	public static void Delete(long isbn) {
		Connection conn = BookDB.Connect();
		String sql = "delete from _book where isbn = ?";
		PreparedStatement p = BookDB.Query(sql,conn);
		try {
			p.setLong(1,isbn);
			p.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		BookDB.close(p);
		BookDB.close(conn);
	}

public static Book Show(long isbn) {
	Connection conn = BookDB.Connect();
	String sql = "SELECT _book.isbn AS isbn,_book.title AS title,_book.publisher AS publisher,_book.publishdate AS publishdate,_book.price AS price,_author.name AS name,_author.age AS age,_author.country AS country FROM _book JOIN _author  ON _author.authorid=_book.authorid  where _book.isbn = ?";
	PreparedStatement p = BookDB.Query(sql,conn);
	Book b = null;
	try {
		p.setLong(1,isbn);
		ResultSet rs = p.executeQuery();
	
		if(rs.next()) {
			b = new Book();
			b.SetISBN(rs.getLong("isbn"));
			b.SetName(rs.getString("name"));
			b.SetPublisher(rs.getString("publisher"));
			b.SetPublishDate(rs.getString("publishdate"));
			b.SetPrice(rs.getString("price"));
			b.SetTitle(rs.getString("title"));
			b.SetAge(rs.getInt("age"));
			b.SetCountry(rs.getString("country"));
		}
	} catch (SQLException ex) {
		ex.printStackTrace();
	}
	BookDB.close(p);
	BookDB.close(conn);
	return b;
	}
}
