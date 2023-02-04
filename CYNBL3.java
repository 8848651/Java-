package study7;

//可以创建父类的内部类对象
//外部类继承父类外部类，内部类继承父类内部类
public class CYNBL3 extends CYNBL2{
	public CYNBL3() {}
	public CYNBL3(String a1) {
		super(a1);
	}	
	public class NBL1 extends NBL{
		public NBL1() {}
		public NBL1(String a1) {
			super(a1);
		}
		public void show() {
			super.show();
		}
	}
	public void show() {
		super.show();
	}
}
