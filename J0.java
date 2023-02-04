package study6;

public interface J0 {
	public abstract void method();
	//默认方法不是抽象方法不会强制重写
	//重写去掉default
	//多个接口中有相同的默认方法，就必须重写该方法
	//子类接口将默认方法变为抽象方法，必须重写该方法
	//接口中的静态方法，只能通过接口名调用不能通过实现类调用
	public default void method2() {
		System.out.println("接口默认方法");
		apple();
		apple1();
	}
	public static void method3() {
		System.out.println("接口中的静态方法");
		apple1();
	}
	//普通私有方法，服务于默认方法
	private void apple() {
		System.out.println("接口中的私有方法");
	}
	//静态私有方法，服务于静态方法，默认方法也能用
	private static void apple1() {
		System.out.println("接口中的私有方法");
	}
}
