package study5;

public class test {
	public static void main(String[] args) {
		change1();	
		}
	public static void change1() {
		person_SX a1=new person_SX("����","25");
		person1_SX a2=new person1_SX("����","25","��");
		person_SX2 a3=new person_SX2("����","16","��");
		
		a2.name();
		a2.age();
		a2.gender();
		
		a3.age();
		a3.name();
		a3.gender();

	}
}
