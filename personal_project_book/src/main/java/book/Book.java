package book;

import java.util.Date;

public class Book {
	private String book_code;
	private String book_name;
	private String book_writer;
	private String book_publish;
	private Date book_date;
	private int book_price;
	private int book_stook;
	private int book_page;
	private String book_desc;
	private String book_index;
	private int book_salecount;
	private int writer_no;		// FK(Writer)
	private int book_ca_no;		// FK(Category)
	private int book_mca_no;	// FK(Category_sub)
	
	
	public Book(String book_code, String book_name, String book_writer, String book_publish, Date book_date,
			int book_price, int book_stook, int book_page, String book_desc, String book_index, int book_salecount,
			int writer_no, int book_ca_no, int book_mca_no) {
		super();
		this.book_code = book_code;
		this.book_name = book_name;
		this.book_writer = book_writer;
		this.book_publish = book_publish;
		this.book_date = book_date;
		this.book_price = book_price;
		this.book_stook = book_stook;
		this.book_page = book_page;
		this.book_desc = book_desc;
		this.book_index = book_index;
		this.book_salecount = book_salecount;
		this.writer_no = writer_no;
		this.book_ca_no = book_ca_no;
		this.book_mca_no = book_mca_no;
	}
	
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_writer() {
		return book_writer;
	}
	public void setBook_writer(String book_writer) {
		this.book_writer = book_writer;
	}
	public String getBook_publish() {
		return book_publish;
	}
	public void setBook_publish(String book_publish) {
		this.book_publish = book_publish;
	}
	public Date getBook_date() {
		return book_date;
	}
	public void setBook_date(Date book_date) {
		this.book_date = book_date;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	public int getBook_stook() {
		return book_stook;
	}
	public void setBook_stook(int book_stook) {
		this.book_stook = book_stook;
	}
	public int getBook_page() {
		return book_page;
	}
	public void setBook_page(int book_page) {
		this.book_page = book_page;
	}
	public String getBook_desc() {
		return book_desc;
	}
	public void setBook_desc(String book_desc) {
		this.book_desc = book_desc;
	}
	public String getBook_index() {
		return book_index;
	}
	public void setBook_index(String book_index) {
		this.book_index = book_index;
	}
	public int getBook_salecount() {
		return book_salecount;
	}
	public void setBook_salecount(int book_salecount) {
		this.book_salecount = book_salecount;
	}
	public int getWriter_no() {
		return writer_no;
	}
	public void setWriter_no(int writer_no) {
		this.writer_no = writer_no;
	}
	public int getBook_ca_no() {
		return book_ca_no;
	}
	public void setBook_ca_no(int book_ca_no) {
		this.book_ca_no = book_ca_no;
	}
	public int getBook_mca_no() {
		return book_mca_no;
	}
	public void setBook_mca_no(int book_mca_no) {
		this.book_mca_no = book_mca_no;
	}
}
