package study2;

public class A2 extends A1{
	private String n2;
	public A2() {
		super();
		}
	public A2(String n1,String n2) {
		super(n1);
		this.n2=n2;
		}
	
	public void setn2(String n2) {
		this.n2=n2;
	}
	public String getn2() {
		return n2;
	}
	
	public static A1 name(A1 a1) {//������ͬ�ľ�̬����
		System.out.println("2,������ͬ�ľ�̬����");
		System.out.println();
		return a1;
	}
	
	public A1 name1(A1 a1) {//������ͬ�Ķ�̬����
		System.out.println("2,������ͬ�Ķ�̬����");
		System.out.println();
		return a1;
	}
	public static A1 apple2(A1 a1) {//���ֲ�ͬ�ľ�̬����
		System.out.println("2,���ֲ�ͬ�ľ�̬����");
		System.out.println();
		return a1;
	}
	public A1 one2(A1 a1) {//���ֲ�ͬ�Ķ�̬����
		System.out.println("2,���ֲ�ͬ�Ķ�̬����");
		System.out.println();
		return a1;
	}
	
	public A1 name1001(A1 a1) {//��̬�����������еľ�̬����
		System.out.println("2,��̬�����������еľ�̬����");
		a1=apple2(a1);
		System.out.println();
		return a1;
	}
	public A1 name1002(A1 a1) {//��̬�����������еľ���̬̬����
		System.out.println("2,��̬�����������еĶ�̬����");
		a1=one2 (a1);
		System.out.println();
		return a1;
	}
}
