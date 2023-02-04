package study1;

public class cat extends Animal{
	private String happy;
	public String gender;
	private int age;
	public cat() {super();}
	public cat(String happy,String sleep,String drink,String eat,String play,int age) {
		super(eat, drink, sleep, play);
		this.happy=happy;
		this.age=age;
		}
	public void sethappy(String happy) {
		this.happy=happy;
	}
	public void setage(int age) {
		this.age=age;
	}
	
	public int getage() {
		return age;
	}
	public String gethappy() {
		return happy;
	}
	public void show() {//如果子类虚方法与父类相同，优先调用子类虚方法
		System.out.println("猫");
		System.out.println(happy);
		System.out.println(gethappy());
		System.out.println(this.gethappy());
		System.out.println(name1);
		System.out.println(getname2());
		System.out.println(super.getname2());
		System.out.println(geteat());
		System.out.println(super.geteat());
		System.out.println();
	}
	public static void A1() {
		System.out.println("猫调用静态方法");
	}
	public void show1() {
		System.out.println("多态子类1");
	}
	public void show3() {
		super.show1();
	}
}












