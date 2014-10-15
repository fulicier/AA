package ACT;
import com.opensymphony.xwork2.ActionSupport;import Infor.Book;

import Oper.Operate;
import java.util.List;

public class Action extends ActionSupport {
	private List<Book> books;
	private List<Book> authors;
	private long isbn;
	private String name;
	private Book b;
	public String List() throws Exception {
		books = Operate.BookList(name);
		//System.out.print("1");
		return SUCCESS;
	}
	public String Detail() throws Exception {
		b = Operate.Show(isbn);
		return INPUT;
	}
	public String GetAuthor(){
		return name;
	}
	public void SetAuthor(String name){
		this.name = name;
	}
	public Long GetISBN(){
		return isbn;
	}
	public void SetISBN(long isbn){
		this.isbn = isbn;
	}
}
