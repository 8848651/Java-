package study1;

public class dog extends Animal{
	private String eat;
	private int play;
	public  dog() {super();}
	public dog(String sleep,String drink,String eat,String eat1,int play1,String play) {
		super(eat, drink, sleep, play);
		this.eat=eat1;
		this.play=play1;
		}
	public void seteat(String eat) {
		this.eat=eat;
	}
	public void setplay(int play) {
		this.play=play;
	}
	public void seteat1(String eat) {
		super.seteat(eat);
	}
	public void setplay1(String play) {
		super.setplay(play);
	}
	
	public String geteat() {
		return eat;
	}
	public int getplay0() {
		return play;
	}
	public String geteat1() {
		return super.geteat();
	}
	public String getplay1() {
		return super.getplay();
	}
	
	public void show() {
		//最近原则，如果子类虚方法与父类相同，优先调用子类虚方法(无返回值)
		//有返回值，如果子类虚方法与父类相同，则返回值类型必须相同
		//有返回值，返回值类型不同，则子类虚方法不能与父类相同
		//只有添加到虚方法表中的方法才可以重写
		String eat=new String(" ");
		System.out.println("狗");
		System.out.println(eat);
		System.out.println(this.eat);
		System.out.println(geteat());
		System.out.println(this.geteat());
		System.out.println(super.geteat());
		System.out.println(getdrink());
		System.out.println();
	}
	
	public void show1() {
		System.out.println(name1);
		System.out.println(this.name1);
		System.out.println(super.name1);
		System.out.println(super.getname2());
		System.out.println();
	}
	public static void A001() {
		System.out.println("狗1调用静态方法");
	}
	public static void A002() {
		System.out.println("狗2调用静态方法");
	}
	public void B002() {
		A001();
	}
}






