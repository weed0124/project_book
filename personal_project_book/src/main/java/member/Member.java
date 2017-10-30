package member;

public class Member {
	private int m_no;
	private String m_id;
	private String m_pw;
	private String m_question;
	private String m_answer;
	private String m_name;
	private String m_birth;
	private String m_gender;
	private String m_email;
	private String m_zipcode;
	private String m_address1;
	private String m_address2;
	private String m_phone;
	private int m_point;
	private String m_since;
	
	
	public Member(int m_no, String m_id, String m_pw, String m_question, String m_answer, String m_name, String m_birth,
			String m_gender, String m_email, String m_zipcode, String m_address1, String m_address2, String m_phone,
			int m_point, String m_since) {
		super();
		this.m_no = m_no;
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_question = m_question;
		this.m_answer = m_answer;
		this.m_name = m_name;
		this.m_birth = m_birth;
		this.m_gender = m_gender;
		this.m_email = m_email;
		this.m_zipcode = m_zipcode;
		this.m_address1 = m_address1;
		this.m_address2 = m_address2;
		this.m_phone = m_phone;
		this.m_point = m_point;
		this.m_since = m_since;
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_question() {
		return m_question;
	}
	public void setM_question(String m_question) {
		this.m_question = m_question;
	}
	public String getM_answer() {
		return m_answer;
	}
	public void setM_answer(String m_answer) {
		this.m_answer = m_answer;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_birth() {
		return m_birth;
	}
	public void setM_birth(String m_birth) {
		this.m_birth = m_birth;
	}
	public String getM_gender() {
		return m_gender;
	}
	public void setM_gender(String m_gender) {
		this.m_gender = m_gender;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_zipcode() {
		return m_zipcode;
	}
	public void setM_zipcode(String m_zipcode) {
		this.m_zipcode = m_zipcode;
	}
	public String getM_address1() {
		return m_address1;
	}
	public void setM_address1(String m_address1) {
		this.m_address1 = m_address1;
	}
	public String getM_address2() {
		return m_address2;
	}
	public void setM_address2(String m_address2) {
		this.m_address2 = m_address2;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	public int getM_point() {
		return m_point;
	}
	public void setM_point(int m_point) {
		this.m_point = m_point;
	}
	public String getM_since() {
		return m_since;
	}
	public void setM_since(String m_since) {
		this.m_since = m_since;
	}
}
