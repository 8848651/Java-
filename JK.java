package study6;


//接口使用interface定义，public interface 接口名{}
//接口不能实例化
//接口和类是实现关系使用implements关键字表示
//可以单实现也可以多实现
// public class 类名 implements 接口1，接口2{}
//也可以在继承的同时实现多个接口
//public class 类名1 extends类名2 implements 接口1，接口2{}
//抽象类是一类，对一类事物的抽象
//接口是对行为的抽象，行为不能抽象为类。类可以用行为表示，但是行为不是类
//如果接口有同名的方法只要写一次就可以
//接口之间可以多继承也可以单继承
//如果实现类实现了子接口，就需要重写所有的接口
public class JK extends A1 implements J1,J2{
	private String age;
	private String gender;
	public JK() {super();}
	public JK(String name,String age,String gender) {
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

	@Override
	public void name() {
		System.out.println("姓名为"+getname());
	}
	@Override
	public void gender() {
		System.out.println("姓别为"+getgender());
	}
	@Override
	public void age() {
		System.out.println("年龄为"+getage());
	}
	@Override
	public void menth() {
		System.out.println("接口1和接口2重名的方法");
	}
	@Override
	public void menth1() {
		System.out.println("接口1特有的方法");
	}
	@Override
	public void method() {
		System.out.println("接口0的方法");
	}

}
