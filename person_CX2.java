package study5;

public abstract class person_CX2 extends person_CX {
	private String age;
	private String gender;
	public person_CX2() {}
	public person_CX2(String name,String age,String gender) {
		super(name);
		this.age=age;
		this.gender=gender;
		}
	public void setage(String age) {
		this.age=age;
	}
	public String getage() {
		return age;
	}
	public void setgender(String gender) {
		this.gender=gender;
	}
	
	public String getgender() {
		return gender;
	}
	
	public abstract void gender();
}
