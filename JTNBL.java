package study7;

public class JTNBL {
	//��ֻ̬�ܷ��ʾ�̬
	//��̬�ڲ���ֻ�ܷ����ⲿ�ľ�̬�����;�̬����
	//������ʷǾ�̬��Ҫʵ����
	//ֻҪ�Ǿ�̬�Ķ�����������.ֱ�ӻ�ȡ��,JTNBL.NBL aa1=new JTNBL.NBL();
		private String a1;	
		private static String a2;
		public JTNBL() {}
		public JTNBL(String a1) {
			this.a1=a1;
		}	
		public static class NBL{
			public void show() {
				System.out.println("��̬����");
				System.out.println(a2);
			}
			public static void show1() {
				System.out.println("��̬����");
				System.out.println(a2);
			}
		}
		public void show() {
			System.out.println(a1);
		}
	}
