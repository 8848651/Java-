package student;

import java.util.Random;

public class student2 {
	private String id;
	private String name;
	private String age;
	private String change;
	public student2() {this(null, null, null, null);}//用户名，密码，身份证号，手机号
	public student2(String id,String name,String age,String change) {
		this.name=name;
		this.id =id;
		this.change=change;
		this.age=age;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setid(String id) {
		this.id=id;
	}
	public void setage(String age) {
		this.age=age;
	}
	public void setchange(String change) {
		this.change=change;
	}
	
	public String getname() {
		return name;
	}
	public String getid() {
		return id;
	}
	public String getage() {
		return age;
	}
	public String getchange() {
		return change;
	}
}




















