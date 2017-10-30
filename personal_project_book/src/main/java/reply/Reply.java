package reply;

import java.util.Date;

public class Reply {
	private int reply_no;
	private String reply_writer;
	private String reply_content;
	private Date reply_date;
	private int board_no;		// FK(Board)
	
	
	public Reply(int reply_no, String reply_writer, String reply_content, Date reply_date, int board_no) {
		super();
		this.reply_no = reply_no;
		this.reply_writer = reply_writer;
		this.reply_content = reply_content;
		this.reply_date = reply_date;
		this.board_no = board_no;
	}
	public int getReply_no() {
		return reply_no;
	}
	public void setReply_no(int reply_no) {
		this.reply_no = reply_no;
	}
	public String getReply_writer() {
		return reply_writer;
	}
	public void setReply_writer(String reply_writer) {
		this.reply_writer = reply_writer;
	}
	public String getReply_content() {
		return reply_content;
	}
	public void setReply_content(String reply_content) {
		this.reply_content = reply_content;
	}
	public Date getReply_date() {
		return reply_date;
	}
	public void setReply_date(Date reply_date) {
		this.reply_date = reply_date;
	}
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	
}
