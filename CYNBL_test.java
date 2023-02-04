package study7;

public class CYNBL_test {
	public static void main(String[] args) {
		}

	public static void Applet(){
		CYNBL3 aa1=new CYNBL3("111");
		
		CYNBL3.NBL aa2=new CYNBL3().new NBL("222");
		CYNBL3.NBL aa3=new CYNBL3("333").new NBL();
		CYNBL3.NBL aa4=new CYNBL3("444").new NBL("555");
		
		CYNBL3.NBL1 aa5=new CYNBL3().new NBL1("22");
		CYNBL3.NBL1 aa6=new CYNBL3("33").new NBL1();
		CYNBL3.NBL1 aa7=new CYNBL3("44").new NBL1("55");
		aa1.show();
		System.out.println();
		
		aa2.show();
		aa3.show();
		aa4.show();
		System.out.println();
		
		aa5.show();
		aa6.show();
		aa7.show();
	}
	
	public static void Applet1(){
		CYNBL2 aa1=new CYNBL2("111");
		CYNBL2.NBL aa2=new CYNBL2().new NBL("222");
		CYNBL2.NBL aa3=new CYNBL2("333").new NBL();
		CYNBL2.NBL aa4=new CYNBL2("444").new NBL("555");
		aa1.show();
		aa2.show();
		aa3.show();
		aa4.show();
	}
	
	public static void Applet2(){
		CYNBL4 aa1=new CYNBL4("111");
		
		CYNBL4.NBL aa2=new CYNBL4().new NBL("222");
		CYNBL4.NBL aa3=new CYNBL4("333").new NBL();
		CYNBL4.NBL aa4=new CYNBL4("444").new NBL("555");
		
		CYNBL4.NBL1 aa5=new CYNBL4().new NBL1("22");
		CYNBL4.NBL1 aa6=new CYNBL4("33").new NBL1();
		CYNBL4.NBL1 aa7=new CYNBL4("44").new NBL1("55");
		
		CYNBL4.NBL1.NBL a1=new CYNBL4().new NBL1().new NBL("1");
		CYNBL4.NBL1.NBL a2=new CYNBL4().new NBL1("2").new NBL();
		CYNBL4.NBL1.NBL a3=new CYNBL4("3").new NBL1().new NBL();
		CYNBL4.NBL1.NBL a4=new CYNBL4().new NBL1("5").new NBL("4");
		CYNBL4.NBL1.NBL a5=new CYNBL4("7").new NBL1().new NBL("6");
		CYNBL4.NBL1.NBL a6=new CYNBL4("9").new NBL1("8").new NBL();
		CYNBL4.NBL1.NBL a7=new CYNBL4("11").new NBL1("10").new NBL();
		CYNBL4.NBL1.NBL a8=new CYNBL4("14").new NBL1("13").new NBL("12");

		aa1.show();
		System.out.println();
		
		aa2.show();
		aa3.show();
		aa4.show();
		System.out.println();
		
		aa5.show();
		aa6.show();
		aa7.show();
		System.out.println();
		
		a1.show();
		a2.show();
		a3.show();
		a4.show();
		a5.show();
		a6.show();
		a7.show();
		a8.show();
	}
}
