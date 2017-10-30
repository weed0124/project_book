package category_sub;

public class Category_sub {
	private int book_mca_no;
	private String book_mca_name;
	private int book_ca_no;			// FK(Category)
	
	public Category_sub(int book_mca_no, String book_mca_name, int book_ca_no) {
		super();
		this.book_mca_no = book_mca_no;
		this.book_mca_name = book_mca_name;
		this.book_ca_no = book_ca_no;
	}
	public int getBook_mca_no() {
		return book_mca_no;
	}
	public void setBook_mca_no(int book_mca_no) {
		this.book_mca_no = book_mca_no;
	}
	public String getBook_mca_name() {
		return book_mca_name;
	}
	public void setBook_mca_name(String book_mca_name) {
		this.book_mca_name = book_mca_name;
	}
	public int getBook_ca_no() {
		return book_ca_no;
	}
	public void setBook_ca_no(int book_ca_no) {
		this.book_ca_no = book_ca_no;
	}
}
