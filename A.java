package student;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
	public static void ML() {
		System.out.println("欢迎使用学生管理系统");
		System.out.println("1，增加学生");
		System.out.println("2，删除学生");
		System.out.println("3，修改学生");
		System.out.println("4，单一查询学生");
		System.out.println("5，全部查询学生");
		System.out.println("6，退出");
	}
	public static void ML1() {
		System.out.println("1，修改姓名");
		System.out.println("2，修改年龄");
		System.out.println("3，修改地址");
		System.out.println("4，退出");
	}
	public static ArrayList<student> M() {
		ArrayList<student> list1=new ArrayList<student>();
		student a1=new student("1","张一",15,"安徽");
		student a2=new student("2","张二",16,"河北");
		student a3=new student("3","张三",17,"四川");
		student a4=new student("4","张四",18,"上海");
		list1.add(a1);
		list1.add(a2);
		list1.add(a3);
		list1.add(a4);
		return list1;
	}
	public static ArrayList<student> Z(ArrayList<student> list) {
		Scanner sc2=new Scanner(System.in);
		while(true) {
		System.out.println("输入学生ID");
		String str=sc2.next();
		if(apple(list,str)<0) {
		student a1=new student();
		a1.setid(str);
		System.out.println("输入学生姓名");
		a1.setname(sc2.next());
		System.out.println("输入学生年龄");
		a1.setage(sc2.nextInt());
		System.out.println("输入学生家庭地址");
		a1.setchange(sc2.next());
		list.add(a1);
		System.out.println("是否继续输入");
		String aa1=sc2.next();
		if(aa1.equals("y")||aa1.equals("Y")){}else {break;}
		}else {System.out.println("ID重复，是否选择重新输入ID");
		String aa2=sc2.next();
		if(aa2.equals("y")||aa2.equals("Y")){}else {break;}
		}
		}
		return list;
	}
	public static ArrayList<student> S(ArrayList<student> list) {
		Scanner sc3=new Scanner(System.in);
		System.out.println("输入学生ID");
		String str=sc3.next();
		if(apple(list,str)>=0) {list.remove(apple(list,str));}
		else{System.out.println("查无此人");}
		return list;
	}
	public static ArrayList<student> G(ArrayList<student> list) {
		Scanner sc4=new Scanner(System.in);
		System.out.println("输入学生ID");
		String str=sc4.next();
		if(apple(list,str)>=0) {
			student a1=list.get(apple(list,str));
			loop:while(true) {
			ML1();
			String str1=sc4.next();
			switch(str1) {
			case "1" :{
				System.out.println("修改姓名");
				a1.setname(sc4.next());break;}
			case "2" :{
				System.out.println("修改年龄");
				a1.setage(sc4.nextInt());break;}
			case "3" :{
				System.out.println("修改住址");
				a1.setchange(sc4.next());break;}
			case "4" :{System.out.println("退出");break loop;}
			default:
				System.out.println("无此选项");
		}}
			list.set(apple(list,str), a1);}
		else{System.out.println("查无此人");}
		return list;
	}
	public static void C1(ArrayList<student> list) {
		Scanner sc5=new Scanner(System.in);
		System.out.println("输入学生ID");
		String str=sc5.next();
		if(apple(list,str)>=0) {
			student a1=list.get(apple(list,str));
			System.out.println("姓名为"+a1.getname());
			System.out.println("年龄为"+a1.getage());
			System.out.println("家庭住址为"+a1.getchange());}
		else{System.out.println("查无此人");}
	}
	public static void C2(ArrayList<student> list) {
		for(int i=0;i<list.size();i++) {
			student a1=list.get(i);
			System.out.print("ID为"+a1.getid()+"  ");
			System.out.print("姓名为"+a1.getname()+"  ");
			System.out.print("年龄为"+a1.getage()+"  ");
			System.out.println("家庭住址为"+a1.getchange());
		}
	}
	
	public static int apple(ArrayList<student> list,String str) {
		for(int i=0;i<list.size();i++) {
			student a2=list.get(i);
			if(a2.getid().equals(str)) {return  i;}}
			return -1;
	}
}











