package study1;

public class cat extends Animal{
	private String happy;
	public String gender;
	private int age;
	public cat() {super();}
	public cat(String happy,String sleep,String drink,String eat,String play,int age) {
		super(eat, drink, sleep, play);
		this.happy=happy;
		this.age=age;
		}
	public void sethappy(String happy) {
		this.happy=happy;
	}
	public void setage(int age) {
		this.age=age;
	}
	
	public int getage() {
		return age;
	}
	public String gethappy() {
		return happy;
	}
	public void show() {//��������鷽���븸����ͬ�����ȵ��������鷽��
		System.out.println("è");
		System.out.println(happy);
		System.out.println(gethappy());
		System.out.println(this.gethappy());
		System.out.println(name1);
		System.out.println(getname2());
		System.out.println(super.getname2());
		System.out.println(geteat());
		System.out.println(super.geteat());
		System.out.println();
	}
	public static void A1() {
		System.out.println("è���þ�̬����");
	}
	public void show1() {
		System.out.println("��̬����1");
	}
	public void show3() {
		super.show1();
	}
}












