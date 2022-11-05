package stud;

public class Student {

	
	private String roll_no, name, mail_id, mobile, parent_name, parent_mobile, address;
	private int xth_mark, xiith_mark;
	
	
	
	public Student(String roll_no, String name, String mail_id, String mobile, String parent_name, String parent_mobile,
			String address, int xth_mark, int xiith_mark) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.mail_id = mail_id;
		this.mobile = mobile;
		this.parent_name = parent_name;
		this.parent_mobile = parent_mobile;
		this.address = address;
		this.xth_mark = xth_mark;
		this.xiith_mark = xiith_mark;
	}

	public Student() {
		super();
	}

	public String getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail_id() {
		return mail_id;
	}

	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getParent_name() {
		return parent_name;
	}

	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}

	public String getParent_mobile() {
		return parent_mobile;
	}

	public void setParent_mobile(String parent_mobile) {
		this.parent_mobile = parent_mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getXth_mark() {
		return xth_mark;
	}

	public void setXth_mark(int xth_mark) {
		this.xth_mark = xth_mark;
	}

	public int getXiith_mark() {
		return xiith_mark;
	}

	public void setXiith_mark(int xiith_mark) {
		this.xiith_mark = xiith_mark;
	}
}
