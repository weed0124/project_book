package review;

import java.util.Date;

public class Review {
	private int rev_no;
	private String rev_title;
	private String rev_content;
	private String rev_writer;
	private Date rev_date;
	private int rev_rate;
	private int rev_readcount;
	
	
	public Review(int rev_no, String rev_title, String rev_content, String rev_writer, Date rev_date, int rev_rate,
			int rev_readcount) {
		super();
		this.rev_no = rev_no;
		this.rev_title = rev_title;
		this.rev_content = rev_content;
		this.rev_writer = rev_writer;
		this.rev_date = rev_date;
		this.rev_rate = rev_rate;
		this.rev_readcount = rev_readcount;
	}
	public int getRev_no() {
		return rev_no;
	}
	public void setRev_no(int rev_no) {
		this.rev_no = rev_no;
	}
	public String getRev_title() {
		return rev_title;
	}
	public void setRev_title(String rev_title) {
		this.rev_title = rev_title;
	}
	public String getRev_content() {
		return rev_content;
	}
	public void setRev_content(String rev_content) {
		this.rev_content = rev_content;
	}
	public String getRev_writer() {
		return rev_writer;
	}
	public void setRev_writer(String rev_writer) {
		this.rev_writer = rev_writer;
	}
	public Date getRev_date() {
		return rev_date;
	}
	public void setRev_date(Date rev_date) {
		this.rev_date = rev_date;
	}
	public int getRev_rate() {
		return rev_rate;
	}
	public void setRev_rate(int rev_rate) {
		this.rev_rate = rev_rate;
	}
	public int getRev_readcount() {
		return rev_readcount;
	}
	public void setRev_readcount(int rev_readcount) {
		this.rev_readcount = rev_readcount;
	}
	
	
}
