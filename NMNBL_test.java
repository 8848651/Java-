package study7;

public class NMNBL_test {
	public static void main(String[] args) {
		new swim() {	
			@Override
			public void swim() {
				// TODO �Զ����ɵķ������
				System.out.println("�����ڲ���ʵ�ֽӿ�swim����");
			}
		};
		
		new swim() {	
			@Override
			public void swim() {
				// TODO �Զ����ɵķ������
				System.out.println("�����ڲ���ʵ�ֽӿ�swim����");
			}
		}.swim();
		
		new swim1() {
			
			@Override
			public void swim1() {
				// TODO �Զ����ɵķ������
				System.out.println("�����ڲ���ʵ�ֳ�����swim1����");
			}
		};
		
		
	}
}
