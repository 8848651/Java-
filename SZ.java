package study;

public class SZ {
	public static void main(String[] args) {
		//数组的创建
		int[] aa1=new int[3];
		int[] aa2=new int[] {1,2,3};
		//数组的长度
		int a1=aa1.length;
		//数组的遍历
		for (int i = 0; i < aa1.length; i++) {
			System.out.println(aa1[i]);
		}
		//创建26个字母数组
		char[] aa3=new char[52];
		for(int i=0;i<26;i++) {
			aa3[i]=(char)(65+i);
			}
		for(int i=26;i<52;i++) {
			aa3[i]=(char)(71+i);
			}
	}
}
