package category;

public class Category {
	private int book_ca_no;
	private String book_ca_name;
	
	
	public Category(int book_ca_no, String book_ca_name) {
		super();
		this.book_ca_no = book_ca_no;
		this.book_ca_name = book_ca_name;
	}
	public int getBook_ca_no() {
		return book_ca_no;
	}
	public void setBook_ca_no(int book_ca_no) {
		this.book_ca_no = book_ca_no;
	}
	public String getBook_ca_name() {
		return book_ca_name;
	}
	public void setBook_ca_name(String book_ca_name) {
		this.book_ca_name = book_ca_name;
	}
}
