package study5;

public class person1_SX extends person1_CX{
	private String gender;
	public person1_SX(){}
	public person1_SX(String name,String age,String gender){
		super(name,age);
		this.gender=gender;
		}
	public void gender() {
		System.out.println("�Ա�Ϊ"+gender);
	}
	@Override
	public void gender1() {
		// TODO �Զ����ɵķ������
		
	}
}
