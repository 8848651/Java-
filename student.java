package student;

import java.util.Random;

public class student {
	private String id;
	private String name;
	private int age;
	private String change;
	public student() {this(null, null, 0, null);}
	public student(String id,String name,int age,String change) {
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
	public void setage(int age) {
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
	public int getage() {
		return age;
	}
	public String getchange() {
		return change;
	}
}




















