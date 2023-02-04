package study2;

public class Z {
	public static void main(String[] args) {
	change();	
	}
	//多态
	//final
	//final修饰方法，该方法为最终方法，不可被重写
	//final修饰类，该类不可被继承
	//final修饰变量，变量变常量，不可被更改
	public static void change() {
		A1 aa1=new A2();
		A1 aa2=new A3();
		//调静态方法，都用的父类静态方法，子类父类相同方法名
		aa1=aa1.name(aa1);
		aa2=aa2.name(aa2);
		//调静态方法，都用的父类静态方法，子类父类不同方法名
		aa1=aa1.apple(aa1);
		aa2=aa2.apple(aa2);
		//调动态方法，按虚方法表来，子类父类相同方法名
		aa1=aa1.name1(aa1);
		aa2=aa2.name1(aa2);
		//调动态方法，子类没有找父类，子类父类不同方法名
		aa1=aa1.one(aa1);
		aa2=aa2.one(aa2);
		//调动态方法，子类特有的静态方法
		aa1=aa1.name1001(aa1);
		aa2=aa2.name1001(aa2);
		//调动态方法，子类特有的动态方法
		aa1=aa1.name1002(aa1);
		aa2=aa2.name1002(aa2);
	}
}
