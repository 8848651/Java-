package study7;

public class NMNBL_test {
	public static void main(String[] args) {
		new swim() {	
			@Override
			public void swim() {
				// TODO 自动生成的方法存根
				System.out.println("匿名内部类实现接口swim方法");
			}
		};
		
		new swim() {	
			@Override
			public void swim() {
				// TODO 自动生成的方法存根
				System.out.println("匿名内部类实现接口swim方法");
			}
		}.swim();
		
		new swim1() {
			
			@Override
			public void swim1() {
				// TODO 自动生成的方法存根
				System.out.println("匿名内部类实现抽象类swim1方法");
			}
		};
		
		
	}
}
