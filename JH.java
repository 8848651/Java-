package study;
//Java内存工具，1，终端
//jps
//jhsdb hsdb
import java.util.ArrayList;
import java.util.Scanner;

public class JH {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		//增
		list.add("aaa");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println(list);
		//删
		boolean a1=list.remove("aaa");
		System.out.println(a1);
		System.out.println(list);
		
		String a2=list.remove(0);
		System.out.println(a2);
		System.out.println(list);
		//改
		String a3=list.set(0,"ddd");
		System.out.println(a3);
		System.out.println(list);
		//查
		String a4=list.get(0);
		System.out.println(a4);
		System.out.println(list.size());
	}
}
