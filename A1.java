package study2;

public class A1 {

	private String n1;
	public A1() {}
	public A1(String n1) {
		this.n1=n1;
		}
	
	public void setn1(String n1) {
		this.n1=n1;
	}
	public String getn1() {
		return n1;
	}
	
	public static A1 name(A1 a1) {//������ͬ�ľ�̬����
		System.out.println("1,������ͬ�ľ�̬����");
		System.out.println();
		return a1;
	}
	
	public A1 name1(A1 a1) {//������ͬ�Ķ�̬����
		System.out.println("1,������ͬ�Ķ�̬����");
		System.out.println();
		return a1;
	}
	public static A1 apple(A1 a1) {//���ֲ�ͬ�ľ�̬����
		System.out.println("1,���ֲ�ͬ�ľ�̬����");
		System.out.println();
		return a1;
	}
	public A1 one(A1 a1) {//���ֲ�ͬ�Ķ�̬����
		System.out.println("1,���ֲ�ͬ�Ķ�̬����");
		System.out.println();
		return a1;
	}
	
	public A1 name1001(A1 a1) {//��̬�����������еľ�̬����
		System.out.println("1,��̬�����������еľ�̬����");
		a1=apple(a1);
		System.out.println();
		return a1;
	}
	public A1 name1002(A1 a1) {//��̬�����������еľ���̬̬����
		System.out.println("1,��̬�����������еĶ�̬����");
		a1=one(a1);
		System.out.println();
		return a1;
	}
	
}
