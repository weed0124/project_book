package board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class BoardDaoImpl implements BoardDao {
	
	private SqlSession sqlSession;

	public BoardDaoImpl() {}

	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public int createBoard(Board board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public Board readByNoBoard(int no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Board> board_readAll(int startRow, int endRow, String board_type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Board> board_readAll_writer(int startRow, int endRow, String board_type, String board_writer)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateBoard(Board board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteBoard(int no) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Board> board_searchByTitle(int startRow, int endRow, String board_title) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Board> board_searchByContent(int startRow, int endRow, String board_content) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Board> board_readBoardType(String board_type) {
		// TODO Auto-generated method stub
		return null;
	}

	public int board_searchCountByTitle(String board_title) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int board_searchCountByContent(String board_content) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int readCountByType(String board_type) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int readCountByWriter(String board_writer) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateReadCount(Board board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int totalPageCountBoard() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int reply_board_stepAdd(Board board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int reply_createBoard(Board board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
