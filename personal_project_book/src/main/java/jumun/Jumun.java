package jumun;

public class Jumun {
	private int jumun_no;
	private String jumun_name;
	private String jumun_zipcode;
	private String jumun_address1;
	private String jumun_address2;
	private int jumun_pay;
	private String book_code;		// FK(Book)
	private int m_no;				// FK(Member)
	
	
	
	public Jumun(int jumun_no, String jumun_name, String jumun_zipcode, String jumun_address1, String jumun_address2,
			int jumun_pay, String book_code, int m_no) {
		super();
		this.jumun_no = jumun_no;
		this.jumun_name = jumun_name;
		this.jumun_zipcode = jumun_zipcode;
		this.jumun_address1 = jumun_address1;
		this.jumun_address2 = jumun_address2;
		this.jumun_pay = jumun_pay;
		this.book_code = book_code;
		this.m_no = m_no;
	}
	public int getJumun_no() {
		return jumun_no;
	}
	public void setJumun_no(int jumun_no) {
		this.jumun_no = jumun_no;
	}
	public String getJumun_name() {
		return jumun_name;
	}
	public void setJumun_name(String jumun_name) {
		this.jumun_name = jumun_name;
	}
	public String getJumun_zipcode() {
		return jumun_zipcode;
	}
	public void setJumun_zipcode(String jumun_zipcode) {
		this.jumun_zipcode = jumun_zipcode;
	}
	public String getJumun_address1() {
		return jumun_address1;
	}
	public void setJumun_address1(String jumun_address1) {
		this.jumun_address1 = jumun_address1;
	}
	public String getJumun_address2() {
		return jumun_address2;
	}
	public void setJumun_address2(String jumun_address2) {
		this.jumun_address2 = jumun_address2;
	}
	public int getJumun_pay() {
		return jumun_pay;
	}
	public void setJumun_pay(int jumun_pay) {
		this.jumun_pay = jumun_pay;
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
