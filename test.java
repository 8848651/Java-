package study6;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		apple();
		
		//Scanner strScanner=new Scanner(System.in);
		//String str=strScanner.next();
		}
	public static void apple(){
		JK1 jk1=new JK1("����","18","��");
		jk1.name();
		jk1.age();
		jk1.gender();
		jk1.method2();
		//�ӿ������ýӿھ�̬����
		J0.method3();
		//���ýӿڳ����ķ���
		System.out.println(JK1.a1);
	
		JK2 jk2=new JK2();
		apple1(jk2);
		
		JK31 jk31=new JK31();
		jk31.method1();
	}
	//�ӿڵĶ�̬
	//ֻҪʵ����ʵ���˸ýӿڣ��ýӿھͿ��Խ��ո�ʵ����
	//�����Ե���ʵ����ķ�����ֻ�нӿ���ķ����������������ɵ���
	public static void apple1(J2 j2){
		j2.gender();
		j2.menth();
		System.out.println("000");
	}
}
