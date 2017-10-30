package point;

import java.util.Date;

public class Point {
	private int pt_no;
	private int pt_point;
	private Date pt_date;
	private int pt_usedpoint;
	private String pt_type;
	private int m_no;		// FK(Member)
	
	
	public Point(int pt_no, int pt_point, Date pt_date, int pt_usedpoint, String pt_type, int m_no) {
		super();
		this.pt_no = pt_no;
		this.pt_point = pt_point;
		this.pt_date = pt_date;
		this.pt_usedpoint = pt_usedpoint;
		this.pt_type = pt_type;
		this.m_no = m_no;
	}
	public int getPt_no() {
		return pt_no;
	}
	public void setPt_no(int pt_no) {
		this.pt_no = pt_no;
	}
	public int getPt_point() {
		return pt_point;
	}
	public void setPt_point(int pt_point) {
		this.pt_point = pt_point;
	}
	public Date getPt_date() {
		return pt_date;
	}
	public void setPt_date(Date pt_date) {
		this.pt_date = pt_date;
	}
	public int getPt_usedpoint() {
		return pt_usedpoint;
	}
	public void setPt_usedpoint(int pt_usedpoint) {
		this.pt_usedpoint = pt_usedpoint;
	}
	public String getPt_type() {
		return pt_type;
	}
	public void setPt_type(String pt_type) {
		this.pt_type = pt_type;
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	
	
}
