package study;

public class ZFC {
	public static void main(String[] args) {
		//�ַ����Ĵ���
		String aa1=new String();
		String aa2="123";
		String aa5="456";
		String aa7="000";
		
		//�ַ���ת�ַ�����
		char[] a1=aa1.toCharArray();
		
		//�ַ�����ת�ַ���
		String aa6=new String(a1);
		
		//��ȡ�ַ���ĳһ��ֵ
		char a2=aa2.charAt(0);
		System.out.println(a2);
		
		//�и��ַ���
		String aa3=aa2.substring(1);
		System.out.println(aa3);
		String aa4=aa2.substring(0,1);
		System.out.println(aa4);
		
		//StringBuilder��������ַ���
		StringBuilder bb1=new StringBuilder();
		bb1.append(aa2);
		bb1.append(aa5);
		System.out.println(bb1);
		
		//StringBuilder������ת�ַ���
		bb1.reverse();
		System.out.println(bb1);
		
		//StringBuilder����ȡ���ַ���
		String bb2=bb1.toString();
		System.out.println(bb2);
		
		//StringBuilder�����滻�ַ���
		bb1.replace(2, 4, aa7);
		System.out.println(bb1);
		
		//StringBuilder��������
		int m1=bb1.length();
		System.out.println(m1);
		
	}
}
