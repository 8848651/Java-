package study5;

public class person_SX extends person_CX{
	private String age;
	
	public person_SX(){}
	public person_SX(String name,String age){
		super(name);
		this.age=age;
		}
	public void setage(String age) {
		this.age=age;
	}
	public String getage() {
		return age;
	}
	public void age() {
		System.out.println("ÄêÁäÎª"+age);
	}
}
