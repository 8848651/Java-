package study1;

public class DT {
	public static void main(String[] args) {
		Animal aa1=new Animal();
		Animal aa2=new cat();
		Animal aa3=new dog();
		cat cat1=new cat();
		
		AA1(aa3);
		AB1(aa3);
		AC1(aa3);
		System.out.println();
		
		AAA(aa1);
		AAA(cat1);
		AAA(aa2);
		
		System.out.println();
		AAB(cat1);
		AAB(aa2);
		//BBB();
		
		System.out.println();
		apple(aa1);
		apple(cat1);
		apple(aa2);
		
		System.out.println();
		apple001(aa1);
		apple001(cat1);
		apple001(aa2);
	
	}
	//Animal aa2=new cat();
	//多态方法调用仅支持父类中有的，子类中特有的方法无法调用，调用的是子类中被重写的方法
	//只能使用父类中有的成员变量，不能使用子类中独有的成员变量
	//show1()父类子类都有，show2()只有父类有
	//show3()为子类独有
	//如果子类父类都想用父类中的方法，尽量将该方法写成静态方法
	//如果写成动态方法，那么子类就不要重写
	//dog aa3=new dog();
	//动态方法被重写调子类，没重写调父类
	//静态方法被重新声明调子类，没有调父类
	//Animal aa3=new dog();
	//动态方法被重写调子类，没重写调父类
	//静态方法无论子类有没有声明调的都是父类
	public static void AAA(Animal aa1) {
		System.out.println(aa1.getClass());
		aa1.show1();
	}
	public static void AAB(Animal aa1) {
		aa1.show2();
	}
	//无论是dog,Animal还是cat调的都是父类中的静态方法
	public static void AA1(Animal aa1) {
		aa1.A001();
	}
	public static void AB1(Animal aa1) {
		aa1.B001();
	}
	public static void AC1(Animal aa1) {
		aa1.B002();
	}
	//父类方法被重写，但仍想调用父类方法。无论父类还是子类都调用父类方法
	//错误示范
	public static void apple001(Animal aa1) {
		aa1.show001();
	}
	//
	public static void apple(Animal aa1) {
		if(aa1 instanceof cat){apple1((cat) aa1);}
		else{aa1.show1();}}
	public static void apple1(cat aa1) {
		aa1.show3();
	}
	//子类可以是父类的实例化对象，父类不能是子类的实例化对象
	public static void BBB() {
		Animal aa1=new Animal();
		cat cat1=new cat();
		dog dog1=new dog();
		Animal aa2=new cat();
		
		System.out.println(aa1 instanceof Animal);
		System.out.println(aa1 instanceof cat);
		//System.out.println(dog1 instanceof cat);
		System.out.println(cat1 instanceof Animal);
		System.out.println(cat1 instanceof cat);
		System.out.println(aa2 instanceof Animal);
		System.out.println(aa2 instanceof cat);
		System.out.println(aa2 instanceof dog);
	}
	
}
