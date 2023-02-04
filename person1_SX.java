package study5;

public class person1_SX extends person1_CX{
	private String gender;
	public person1_SX(){}
	public person1_SX(String name,String age,String gender){
		super(name,age);
		this.gender=gender;
		}
	public void gender() {
		System.out.println("性别为"+gender);
	}
	@Override
	public void gender1() {
		// TODO 自动生成的方法存根
		
	}
}
