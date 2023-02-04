package student;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class A1 {
	public static void ML1() {
		System.out.println("1，登陆");
		System.out.println("2，注册");
		System.out.println("3，修改密码");
		System.out.println("4，查询所有用户");
		System.out.println("5，退出");
	}
	public static ArrayList<student2> D(ArrayList<student2> list) {
		Scanner sc3=new Scanner(System.in);
		System.out.println("输入账号");
		String str=sc3.next();
		if(apple(list,str)>=0) {
			int m=0;
			for(int i=0;i<3;i++) {
			student2 aa3=list.get(apple(list,str));
			System.out.println("输入密码");
			String str1=sc3.next();
			if(str1.equals(aa3.getname())) {
				A3.A3();
				break;
			}else {System.out.println("密码不一致，是否重新输入");
			String aa2=sc3.next();
			if(aa2.equals("y")||aa2.equals("Y")){m++;}else {break;}}}
			if(m==3) {System.out.println("密码不一致，是否修改");
			String aa2=sc3.next();
			if(aa2.equals("y")||aa2.equals("Y")) {list=X(list);}}}
		else {System.out.println("无账号，是否创建账号");
		String aa2=sc3.next();
		if(aa2.equals("y")||aa2.equals("Y")){
			list=Z(list);
		}else {}}
		return list;
	}
	public static ArrayList<student2> Z(ArrayList<student2> list) {
		Scanner sc3=new Scanner(System.in);
		student2 aa1=new student2();
		loop:while(true) {
			String s1=new String();
			String s2=new String();
			String s3=new String();
			String s4=new String();
			while(true) {
				System.out.println("请3到15位数字加字母,不可以为纯数字");
				String a1=sc3.next();
				if(apple1(a1)) {s1=a1;aa1.setid(a1);break;}
				else {System.out.println("3到15位数字加字母，是否选择重新输入");
				String aa2=sc3.next();
				if(aa2.equals("y")||aa2.equals("Y")){}else {break loop;}}
			}
			
			while(true) {
				System.out.println("输入密码");
				String str1=sc3.next();
				System.out.println("再次输入密码");
				String str2=sc3.next();
				if(str1.equals(str2)){s2=str2;aa1.setname(str2);break;}
				else {System.out.println("，是否选择重新输入密码");
				String aa2=sc3.next();
				if(aa2.equals("y")||aa2.equals("Y")){}else {break loop;}}
			}
			
			while(true) {
				System.out.println("输入身份证号");
				String a1=sc3.next();
				if(apple2(a1)) {s3=a1;aa1.setage(a1);break;}
				else {System.out.println("是否选择重新输入身份证号");
				String aa2=sc3.next();
				if(aa2.equals("y")||aa2.equals("Y")){}else {break loop;}}
			}
			
			while(true) {
				System.out.println("输入手机号");
				String a1=sc3.next();
				if(apple3(a1)) {s4=a1;aa1.setchange(a1);break;}
				else {System.out.println("是否选择重新输入手机号");
				String aa2=sc3.next();
				if(aa2.equals("y")||aa2.equals("Y")){}else {break loop;}}
			}
			if(aa1.getid().equals(s1)&&aa1.getname().equals(s2)
			&&aa1.getage().equals(s3)&&aa1.getchange().equals(s4))
			{System.out.println("注册成功");list.add(aa1);break;}
		}
		return list;
	}
	public static ArrayList<student2> X(ArrayList<student2> list) {
		Scanner sc3=new Scanner(System.in);
		System.out.println("输入账号");
		String str=sc3.next();
		if(apple(list,str)>=0) {
			student2 aa1=list.get(apple(list,str));
			loop:while(true) {
				String s1=new String();
				String s2=new String();
				while(true) {
					System.out.println("输入身份证号");
					String a1=sc3.next();
					if(a1.equals(aa1.getage())) {s1=a1;break;}
					else {System.out.println("是否选择重新输入");
					String aa2=sc3.next();
					if(aa2.equals("y")||aa2.equals("Y")){}else {break loop;}}
				}
				
				while(true) {
					System.out.println("输入手机号");
					String a1=sc3.next();
					if(a1.equals(aa1.getchange())) {s2=a1;break;}
					else {System.out.println("是否选择重新输入");
					String aa2=sc3.next();
					if(aa2.equals("y")||aa2.equals("Y")){}else {break loop;}}
				}
				if(s1.equals(aa1.getage())&&s2.equals(aa1.getchange())) {
					System.out.println("输入密码");
					String a1=sc3.next();
					aa1.setname(a1);
					break;}}
			list.set(apple(list,str), aa1);
			System.out.println("修改成功");}
		else {System.out.println("无账号，是否创建账号");
		String aa2=sc3.next();
		if(aa2.equals("y")||aa2.equals("Y")){
			list=Z(list);
		}else {}}
		return list;
	}
	//验证码
	public static String A2() {
		String a1=new String();
		Random r=new Random();
		char[] aa3=new char[52];
		for(int i=0;i<26;i++) {aa3[i]=(char)(65+i);}
		for(int i=26;i<52;i++) {aa3[i]=(char)(71+i);}
		for(int i=0;i<4;i++) {
			int a2=r.nextInt(aa3.length);
			a1=a1+aa3[a2];}
		a1=a1+r.nextInt(10);
		char[] aa1=a1.toCharArray();
		for(int i=0;i<a1.length();i++) {
			int a2=r.nextInt(a1.length());
			char aa2=aa1[i];
			aa1[i]=aa1[a2];
			aa1[a2]=aa2;
		}
		a1=new String(aa1);
		return a1;
	}
	public static ArrayList<student2> M() {
		ArrayList<student2> list1=new ArrayList<student2>();
		String str1="341322200105112819";
		String str2="34132220010511281X";
		String str3="34132220010511281x";
		String str4="341322200105112820";
		String st1="M123";
		String st2="M124";
		String st3="M125";
		String st4="M126";
		String s1="15178235073";
		String s2="15055368395";
		String s3="13956881262";
		String s4="15755726841";
		String sr1="M15178235073";
		String sr2="M15055368395";
		String sr3="M13956881262";
		String sr4="M15755726841";
		student2 a1=new student2(st1,sr1,str1,s1);
		student2 a2=new student2(st2,sr2,str2,s2);
		student2 a3=new student2(st3,sr3,str3,s3);
		student2 a4=new student2(st4,sr4,str4,s4);
		list1.add(a1);
		list1.add(a2);
		list1.add(a3);
		list1.add(a4);
		return list1;
	}
	public static int apple(ArrayList<student2> list,String str) {
		for(int i=0;i<list.size();i++) {
			student2 a2=list.get(i);
			if(a2.getid().equals(str)) {return  i;}}
			return -1;
	}
	//账号
	public static boolean apple1(String str) {
		if(str.length()>3&&str.length()<15) {
			if(a1(str)&&a2(str)){return true;}}
		return false;
	}
	public static boolean a1(String str) {
		char[] a1= {'0','1','2','3','4','5','6','7','8','9'};
		char[] a2=str.toCharArray();
		int m=0;
		for(int i=0;i<a2.length;i++) {
			for(int n=0;n<a1.length;n++) {
				if(a1[n]==a2[i]) {m++;}}}
		if(m==a2.length) {return false;}
		return true;
	}
	public static boolean a2(String str) {
		char[] a1=new char[52];
		for(int i=0;i<26;i++) {a1[i]=(char)(65+i);}
		for(int i=26;i<52;i++) {a1[i]=(char)(71+i);}
		char[] a2=str.toCharArray();
		int m=0;
		for(int i=0;i<a2.length;i++) {
			for(int n=0;n<a1.length;n++) {
				if(a1[n]==a2[i]) {m++;}}}
		if(m==a2.length) {return false;}
		return true;
	}
	//身份证号
	public static boolean apple2(String str) {
		char[] a1=str.toCharArray();
		if(a3(str)) {
			if(a4(a1[a1.length-1])||a1[a1.length-1]=='x'||a1[a1.length-1]=='X') {
				return true;
			}}
		return false;
	}
	public static boolean a3(String str) {
		char[] a1=str.toCharArray();
		char[] a2=new char[a1.length-1];
		if(a1.length==18&&a1[0]!='0') {
			for(int i=0;i<a2.length;i++) {
				a2[i]=a1[i];
			}
			String a3=new String(a2);
			if(a1(a3)) {return false;}else {return true;}
		}
		return false;
	}
	public static boolean a4(char str) {
		char[] a1= {'0','1','2','3','4','5','6','7','8','9'};
		for(int i=0;i<a1.length;i++) {
			if(a1[i]==str) {return true;}}
		return false;
	}
	//手机号
	public static boolean apple3(String str) {
		char[] a1=str.toCharArray();
		char[] a2=new char[a1.length-1];
		if(a1.length==11&&a1[0]!='0') {
			if(a1(str)) {return false;}else {return true;}
		}
		return false;
	}
	public static void C(ArrayList<student2> list) {
		for(int i=0;i<list.size();i++) {
			student2 a1=list.get(i);
			System.out.print("账号"+"  "+a1.getid()+" ");
			System.out.print("密码"+" "+a1.getname()+" ");
			System.out.print("身份证号码"+" "+a1.getage()+" ");
			System.out.println("手机号"+" "+a1.getchange()+" ");
		}
	}

	
}










