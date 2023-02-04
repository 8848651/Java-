package study6;

public interface J1 extends J0{
	//接口成员变量为final只能是常量，无构造方法
	//可以定义私有方法，变量自动修改为public static final 常量
	int a1=10;
	public abstract void age();
	public abstract void menth();
	public abstract void menth1();
}
