package board;

public class Board_type {
	private int board_type_no;
	private String board_type_name;
	
	public Board_type(int board_type_no, String board_type_name) {
		super();
		this.board_type_no = board_type_no;
		this.board_type_name = board_type_name;
	}
	public int getBoard_type_no() {
		return board_type_no;
	}
	public void setBoard_type_no(int board_type_no) {
		this.board_type_no = board_type_no;
	}
	public String getBoard_type_name() {
		return board_type_name;
	}
	public void setBoard_type_name(String board_type_name) {
		this.board_type_name = board_type_name;
	}
}
