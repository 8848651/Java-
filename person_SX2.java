package study5;

public class person_SX2 extends person_CX2{

	public person_SX2() {}
	public person_SX2(String name,String age,String gender) {
		super(name, age, gender);
	}
	@Override
	public void gender() {
		System.out.println("�Ա�Ϊ"+getgender());
	}

	@Override
	public void age() {
		System.out.println("����Ϊ"+getage());
	}

}
