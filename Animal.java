package study1;

public class Animal {
	private String eat;
	private String drink;
	public String sleep;
	private String play;
	public static String name1;
	private static String name2;
	
	public Animal() {}
	public Animal(String eat,String drink,String sleep,String play) {
		this.eat=eat;
		this.drink=drink;
		this.sleep=sleep;
		this.play=play;
		}
	
	public void seteat(String eat) {
		this.eat=eat;
	}
	public void setdrink(String drink) {
		this.drink=drink;
	}
	public void setplay(String play) {
		this.play=play;
	}
	public void setsleep(String sleep) {
		this.sleep=sleep;
	}
	
	public String geteat() {
		return eat;
	}
	public String getdrink() {
		return drink;
	}
	public String getplay() {
		return play;
	}
	public String getsleep() {
		return sleep;
	}
	
	public void setname2(String name2) {
		this.name2=name2;
	}
	public String getname2() {
		return name2;
	}

	public void show() {
		System.out.println("����");
		System.out.println(eat);
		System.out.println(drink);
		System.out.println(play);
		System.out.println(sleep);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println();
	}
	private void take() {
		System.out.println("���಻�ɵ��ã�ֻ�и����ʵ�����Ե���");
	}
	
	public static void A001() {
		System.out.println("������þ�̬����");
	}
	public static void B001() {
		A001();
	}
	public void B002() {
		A001();
	}
	
	public void show1() {
		System.out.println("��̬����1");
	}
	public void show2() {
		System.out.println("��̬����2");
	}
	public void show001() {
		//������ʾ������д�ķ���
		this.show1();
	}
}
