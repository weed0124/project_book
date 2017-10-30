package cart;

public class Cart {
	private int cart_no;
	private int cart_count;
	private String book_code;	// FK(Book)
	private int m_no;			// FK(Member)
	
	public Cart(int cart_no, int cart_count, String book_code, int m_no) {
		super();
		this.cart_no = cart_no;
		this.cart_count = cart_count;
		this.book_code = book_code;
		this.m_no = m_no;
	}
	public int getCart_no() {
		return cart_no;
	}
	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}
	public int getCart_count() {
		return cart_count;
	}
	public void setCart_count(int cart_count) {
		this.cart_count = cart_count;
	}
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
}
