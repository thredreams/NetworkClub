package domain;

public class stu {
	String school;
	String college;
	String specialty;
	String name;
	String num;
	String gender;
	String tele;
	String qq;
	@Override
	public String toString() {
		return "stu [school=" + school + ", college=" + college + ", specialty=" + specialty + ", name=" + name
				+ ", num=" + num + ", gender=" + gender + ", tele=" + tele + ", qq=" + qq + "]";
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}

}
