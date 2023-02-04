package study7;

public class JTNBL {
	//静态只能访问静态
	//静态内部类只能访问外部的静态变量和静态方法
	//如果访问非静态就要实例化
	//只要是静态的都可以用类名.直接获取如,JTNBL.NBL aa1=new JTNBL.NBL();
		private String a1;	
		private static String a2;
		public JTNBL() {}
		public JTNBL(String a1) {
			this.a1=a1;
		}	
		public static class NBL{
			public void show() {
				System.out.println("动态方法");
				System.out.println(a2);
			}
			public static void show1() {
				System.out.println("静态方法");
				System.out.println(a2);
			}
		}
		public void show() {
			System.out.println(a1);
		}
	}
