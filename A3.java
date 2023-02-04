package student;

import java.util.ArrayList;
import java.util.Scanner;

public class A3 {
	public static void A3() {
		ArrayList<student> list=new ArrayList<student>();
		list=A.M();
		Scanner sc1=new Scanner(System.in);
		loop:while(true) {
		A.ML();
		String aa1=sc1.next();
		switch(aa1) {
			case "1" :{list=A.Z(list);break;}
			case "2" :{list=A.S(list);break;}
			case "3" :{list=A.G(list);break;}
			case "4" :{A.C1(list);break;}
			case "5" :{A.C2(list);break;}
			case "6" :{System.out.println("退出");break loop;}
			default:System.out.print("无此选项");
		}}
	}
	public static void A4() {
		ArrayList<student2> list=new ArrayList<student2>();
		list=A1.M();
		Scanner sc1=new Scanner(System.in);
		loop:while(true) {
		A1.ML1();
		String aa1=sc1.next();
		switch(aa1) {
			case "1" :{
				String	str1=A1.A2();
				System.out.println("请输入验证码");
				System.out.println(str1);
				if(sc1.next().equals(str1)) {
				list=A1.D(list);break;}}
			case "2" :{list=A1.Z(list);break;}
			case "3" :{list=A1.X(list);break;}
			case "4" :{A1.C(list);;break;}
			case "5" :{break loop;}
			default:System.out.print("无此选项");
		}}}
}
