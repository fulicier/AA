package Infor;

public class Book {
	private String title;
	private String publisher;
	private String publishdate;
	private String country;
	private String name;
	private String price;
	private long isbn;
	private int age;
	private int id;
	private int authorid;
	
	public int GetAuthorID(){
		return authorid;
	}
	public int GetID(){
		return id;
	}
	public int GetAge(){
		return age;
	}
	public long GetISBN(){
		return isbn;
	}
	public String GetPrice(){
		return price;
	}
	public String GetTitle(){
		return title;
	}
	public String GetPublisher(){
		return publisher;
	}
	public String GetPublishDate(){
		return publishdate;
	}
	public String GetCountry(){
		return country;
	}
	public String GetName(){
		return name;
	}
	
	public void SetAuthorID(int authorid){
		this.authorid = authorid;
	}
	public void SetISBN(long isbn){
		this.isbn = isbn;
	}
	public void SetPrice(String price){
		this.price = price;
	}
	public void SetTitle(String title){
		this.title = title;
	}
	public void SetPublisher(String publisher){
		this.publisher = publisher;
	}
	public void SetPublishDate(String publishdate){
		this.publishdate = publishdate;
	}
	public void SetCountry(String country){
		this.country = country;
	}
	public void SetName(String name){
		this.name = name;
	}
}
