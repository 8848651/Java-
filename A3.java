package study2;

public class A3 extends A1{
	private String n3;
	public A3() {
		super();
		}
	public A3(String n1,String n3) {
		super(n1);
		this.n3=n3;
		}
	
	public void setn3(String n3) {
		this.n3=n3;
	}
	public String getn3() {
		return n3;
	}
	
	public static A1 name(A1 a1) {//������ͬ�ľ�̬����
		System.out.println("3,������ͬ�ľ�̬����");
		System.out.println();
		return a1;
	}
	
	public A1 name1(A1 a1) {//������ͬ�Ķ�̬����
		System.out.println("3,������ͬ�Ķ�̬����");
		System.out.println();
		return a1;
	}
	public static A1 apple3(A1 a1) {//���ֲ�ͬ�ľ�̬����
		System.out.println("3,���ֲ�ͬ�ľ�̬����");
		System.out.println();
		return a1;
	}
	public A1 one3(A1 a1) {//���ֲ�ͬ�Ķ�̬����
		System.out.println("3,���ֲ�ͬ�Ķ�̬����");
		System.out.println();
		return a1;
	}
	
	public A1 name1001(A1 a1) {//��̬�����������еľ�̬����
		System.out.println("3,��̬�����������еľ�̬����");
		a1=apple3(a1);
		System.out.println();
		return a1;
	}
	public A1 name1002(A1 a1) {//��̬�����������еľ���̬̬����
		System.out.println("3,��̬�����������еĶ�̬����");
		a1=one3(a1);
		System.out.println();
		return a1;
	}
}
