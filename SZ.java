package study;

public class SZ {
	public static void main(String[] args) {
		//����Ĵ���
		int[] aa1=new int[3];
		int[] aa2=new int[] {1,2,3};
		//����ĳ���
		int a1=aa1.length;
		//����ı���
		for (int i = 0; i < aa1.length; i++) {
			System.out.println(aa1[i]);
		}
		//����26����ĸ����
		char[] aa3=new char[52];
		for(int i=0;i<26;i++) {
			aa3[i]=(char)(65+i);
			}
		for(int i=26;i<52;i++) {
			aa3[i]=(char)(71+i);
			}
	}
}
