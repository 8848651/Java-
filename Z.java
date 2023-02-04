package study1;

public class Z {
	public static void main(String[] args) {
		apple2();
	
	}
	//对于父类中的静态变量，无论是子类赋值还是父类赋值，其子类父类就共同被赋值
	//子类可以使用父类的静态方法，父类不能使用子类的静态方法
	//如果子父类静态方法相同，会使用子类静态方法，父类方法被隐藏
	//使用要父类静态方法A可以重新另B写一个方法，调用静态方法A，子类中无B方法
	//到父类中找通过B来调用A静态方法。
	public static void apple2() {
		dog dog1=new dog();
		dog1.setname2("003");
		dog1.show();
		dog1.show1();
		dog1.A001();
		dog1.A002();
		dog1.B001();
		dog1.B002();
		System.out.println();
		
		Animal a2=new Animal();
		a2.show();
		a2.A001();
		System.out.println();
		
		cat cat1=new cat();
		cat1.show();
		cat1.A001();
		cat1.A1();
		System.out.println();
	}
	
	public static void apple1() {
		Animal a1=new Animal();
		a1.name1="001";
		a1.setname2("002");
		a1.show();
		System.out.println();
	
		Animal a2=new Animal();
		a2.show();
		System.out.println();
		
		cat cat1=new cat();
		cat1.show();
		System.out.println();
	}
	
}
