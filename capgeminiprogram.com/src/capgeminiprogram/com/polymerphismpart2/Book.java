package capgeminiprogram.com.polymerphismpart2;

public class Book {
	private String Author;
	private String Name;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Book(String author, String name) {
		super();
		Author = author;
		Name = name;
	}
	@Override
	public String toString() {
		return "Book [Author=" + Author + ", Name=" + Name + "]";
	}
	
	
}
