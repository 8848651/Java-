package study7;

public class CYNBL {
	//内部类可以直接访问外部类的成员，包括私有
	//外部类访问内部类要创建对象
	//获取成员内部类的方法
	//1，外部类编写方法对外提供内部类对象
	//2，直接创建例如：CYNBL.NBL str=new CYNBL().new NBL()
	//外部类内部类将其看成为父类的两个平行子类只不过是特殊的平行类
	private String a1;
	public String a2;
	
	//如果内部类是private修饰外部无法获取
	//私有内部类
	private class NBL{
		private String a3;
		public String a4;
		
		public void show() {
			System.out.println(a1);
			System.out.println(a2);
		}
	}
	
	//1，外部获取私有内部类方法使用object接收，或直接使用
	public NBL getNBL() {
		return new NBL();
	}
	
	public void show() {
		System.out.println(a1);
		//无法调用a4，必须创建对象调用
		//System.out.println(a4);
		NBL aa1=new NBL();
		System.out.println(aa1.a3);
		System.out.println(aa1.a4);
	}

}
