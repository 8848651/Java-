package study5;

public class person_SX2 extends person_CX2{

	public person_SX2() {}
	public person_SX2(String name,String age,String gender) {
		super(name, age, gender);
	}
	@Override
	public void gender() {
		System.out.println("性别为"+getgender());
	}

	@Override
	public void age() {
		System.out.println("年龄为"+getage());
	}

}
