package study2;

public class A1 {

	private String n1;
	public A1() {}
	public A1(String n1) {
		this.n1=n1;
		}
	
	public void setn1(String n1) {
		this.n1=n1;
	}
	public String getn1() {
		return n1;
	}
	
	public static A1 name(A1 a1) {//名字相同的静态方法
		System.out.println("1,名字相同的静态方法");
		System.out.println();
		return a1;
	}
	
	public A1 name1(A1 a1) {//名字相同的动态方法
		System.out.println("1,名字相同的动态方法");
		System.out.println();
		return a1;
	}
	public static A1 apple(A1 a1) {//名字不同的静态方法
		System.out.println("1,名字不同的静态方法");
		System.out.println();
		return a1;
	}
	public A1 one(A1 a1) {//名字不同的动态方法
		System.out.println("1,名字不同的动态方法");
		System.out.println();
		return a1;
	}
	
	public A1 name1001(A1 a1) {//多态调用子类特有的静态方法
		System.out.println("1,多态调用子类特有的静态方法");
		a1=apple(a1);
		System.out.println();
		return a1;
	}
	public A1 name1002(A1 a1) {//多态调用子类特有的静动态态方法
		System.out.println("1,多态调用子类特有的动态方法");
		a1=one(a1);
		System.out.println();
		return a1;
	}
	
}
