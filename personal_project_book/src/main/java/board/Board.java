package board;

import java.util.Date;

public class Board {
	private int board_no;
	private String board_title;
	private String board_content;
	private String board_writer;
	private Date board_date;
	private int board_groupno;
	private int board_step;
	private int board_depth;
	private int board_readcount;
	private String board_image;
	
	private int board_type_no;	// Foriegn Key(Board_type)

	
	public Board(int board_no, String board_title, String board_content, String board_writer, Date board_date,
			int board_groupno, int board_step, int board_depth, int board_readcount, String board_image,
			int board_type_no) {
		super();
		this.board_no = board_no;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_writer = board_writer;
		this.board_date = board_date;
		this.board_groupno = board_groupno;
		this.board_step = board_step;
		this.board_depth = board_depth;
		this.board_readcount = board_readcount;
		this.board_image = board_image;
		this.board_type_no = board_type_no;
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

	public String getBoard_writer() {
		return board_writer;
	}

	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}

	public Date getBoard_date() {
		return board_date;
	}

	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}

	public int getBoard_groupno() {
		return board_groupno;
	}

	public void setBoard_groupno(int board_groupno) {
		this.board_groupno = board_groupno;
	}

	public int getBoard_step() {
		return board_step;
	}

	public void setBoard_step(int board_step) {
		this.board_step = board_step;
	}

	public int getBoard_depth() {
		return board_depth;
	}

	public void setBoard_depth(int board_depth) {
		this.board_depth = board_depth;
	}

	public int getBoard_readcount() {
		return board_readcount;
	}

	public void setBoard_readcount(int board_readcount) {
		this.board_readcount = board_readcount;
	}

	public String getBoard_image() {
		return board_image;
	}

	public void setBoard_image(String board_image) {
		this.board_image = board_image;
	}

	public int getBoard_type_no() {
		return board_type_no;
	}

	public void setBoard_type_no(int board_type_no) {
		this.board_type_no = board_type_no;
	}
}
