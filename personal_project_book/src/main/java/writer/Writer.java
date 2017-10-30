package writer;

public class Writer {
	private int writer_no;
	private String writer_name;
	private String writer_intro;
	private String book_code;		// FK(Book)
	
	
	public Writer(int writer_no, String writer_name, String writer_intro, String book_code) {
		super();
		this.writer_no = writer_no;
		this.writer_name = writer_name;
		this.writer_intro = writer_intro;
		this.book_code = book_code;
	}
	public int getWriter_no() {
		return writer_no;
	}
	public void setWriter_no(int writer_no) {
		this.writer_no = writer_no;
	}
	public String getWriter_name() {
		return writer_name;
	}
	public void setWriter_name(String writer_name) {
		this.writer_name = writer_name;
	}
	public String getWriter_intro() {
		return writer_intro;
	}
	public void setWriter_intro(String writer_intro) {
		this.writer_intro = writer_intro;
	}
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	
	
}
