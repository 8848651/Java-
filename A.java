package student;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
	public static void ML() {
		System.out.println("��ӭʹ��ѧ������ϵͳ");
		System.out.println("1������ѧ��");
		System.out.println("2��ɾ��ѧ��");
		System.out.println("3���޸�ѧ��");
		System.out.println("4����һ��ѯѧ��");
		System.out.println("5��ȫ����ѯѧ��");
		System.out.println("6���˳�");
	}
	public static void ML1() {
		System.out.println("1���޸�����");
		System.out.println("2���޸�����");
		System.out.println("3���޸ĵ�ַ");
		System.out.println("4���˳�");
	}
	public static ArrayList<student> M() {
		ArrayList<student> list1=new ArrayList<student>();
		student a1=new student("1","��һ",15,"����");
		student a2=new student("2","�Ŷ�",16,"�ӱ�");
		student a3=new student("3","����",17,"�Ĵ�");
		student a4=new student("4","����",18,"�Ϻ�");
		list1.add(a1);
		list1.add(a2);
		list1.add(a3);
		list1.add(a4);
		return list1;
	}
	public static ArrayList<student> Z(ArrayList<student> list) {
		Scanner sc2=new Scanner(System.in);
		while(true) {
		System.out.println("����ѧ��ID");
		String str=sc2.next();
		if(apple(list,str)<0) {
		student a1=new student();
		a1.setid(str);
		System.out.println("����ѧ������");
		a1.setname(sc2.next());
		System.out.println("����ѧ������");
		a1.setage(sc2.nextInt());
		System.out.println("����ѧ����ͥ��ַ");
		a1.setchange(sc2.next());
		list.add(a1);
		System.out.println("�Ƿ��������");
		String aa1=sc2.next();
		if(aa1.equals("y")||aa1.equals("Y")){}else {break;}
		}else {System.out.println("ID�ظ����Ƿ�ѡ����������ID");
		String aa2=sc2.next();
		if(aa2.equals("y")||aa2.equals("Y")){}else {break;}
		}
		}
		return list;
	}
	public static ArrayList<student> S(ArrayList<student> list) {
		Scanner sc3=new Scanner(System.in);
		System.out.println("����ѧ��ID");
		String str=sc3.next();
		if(apple(list,str)>=0) {list.remove(apple(list,str));}
		else{System.out.println("���޴���");}
		return list;
	}
	public static ArrayList<student> G(ArrayList<student> list) {
		Scanner sc4=new Scanner(System.in);
		System.out.println("����ѧ��ID");
		String str=sc4.next();
		if(apple(list,str)>=0) {
			student a1=list.get(apple(list,str));
			loop:while(true) {
			ML1();
			String str1=sc4.next();
			switch(str1) {
			case "1" :{
				System.out.println("�޸�����");
				a1.setname(sc4.next());break;}
			case "2" :{
				System.out.println("�޸�����");
				a1.setage(sc4.nextInt());break;}
			case "3" :{
				System.out.println("�޸�סַ");
				a1.setchange(sc4.next());break;}
			case "4" :{System.out.println("�˳�");break loop;}
			default:
				System.out.println("�޴�ѡ��");
		}}
			list.set(apple(list,str), a1);}
		else{System.out.println("���޴���");}
		return list;
	}
	public static void C1(ArrayList<student> list) {
		Scanner sc5=new Scanner(System.in);
		System.out.println("����ѧ��ID");
		String str=sc5.next();
		if(apple(list,str)>=0) {
			student a1=list.get(apple(list,str));
			System.out.println("����Ϊ"+a1.getname());
			System.out.println("����Ϊ"+a1.getage());
			System.out.println("��ͥסַΪ"+a1.getchange());}
		else{System.out.println("���޴���");}
	}
	public static void C2(ArrayList<student> list) {
		for(int i=0;i<list.size();i++) {
			student a1=list.get(i);
			System.out.print("IDΪ"+a1.getid()+"  ");
			System.out.print("����Ϊ"+a1.getname()+"  ");
			System.out.print("����Ϊ"+a1.getage()+"  ");
			System.out.println("��ͥסַΪ"+a1.getchange());
		}
	}
	
	public static int apple(ArrayList<student> list,String str) {
		for(int i=0;i<list.size();i++) {
			student a2=list.get(i);
			if(a2.getid().equals(str)) {return  i;}}
			return -1;
	}
}











