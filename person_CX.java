package study5;

public abstract class person_CX {
	//抽象方法要求子类必须重写该方法，要求重写所有方法
	//只要存在抽象方法必须声明抽象类，有抽象方法一定是抽象类，抽象类不一定有抽象方法
	//抽象类不能被实例化，可以有构造方法
	//person_CX为抽象类，person_CX2继承了person_CX也为抽象类
	//person_SX2为person_CX2继承类非抽象类
	//person_SX为person_CX继承类非抽象类,person1_CX继承并抽象person_SX类
	//person1_SX为person1_CX继承类非抽象类
	//抽象类不可以定义静态方法
	private String name;
	public person_CX() {}
	public person_CX(String name) {this.name=name;}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	
	public abstract void age();
	
	public void name() {
		System.out.println("姓名为"+name);
	}
}
