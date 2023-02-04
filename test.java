package study6;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		apple();
		
		//Scanner strScanner=new Scanner(System.in);
		//String str=strScanner.next();
		}
	public static void apple(){
		JK1 jk1=new JK1("张三","18","男");
		jk1.name();
		jk1.age();
		jk1.gender();
		jk1.method2();
		//接口名调用接口静态方法
		J0.method3();
		//调用接口常量的方法
		System.out.println(JK1.a1);
	
		JK2 jk2=new JK2();
		apple1(jk2);
		
		JK31 jk31=new JK31();
		jk31.method1();
	}
	//接口的多态
	//只要实现类实现了该接口，该接口就可以接收该实现类
	//还可以调用实现类的方法，只有接口里的方法，其他方法不可调用
	public static void apple1(J2 j2){
		j2.gender();
		j2.menth();
		System.out.println("000");
	}
}
