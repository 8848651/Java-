package study1;

public class Z {
	public static void main(String[] args) {
		apple2();
	
	}
	//���ڸ����еľ�̬���������������ำֵ���Ǹ��ำֵ�������ุ��͹�ͬ����ֵ
	//�������ʹ�ø���ľ�̬���������಻��ʹ������ľ�̬����
	//����Ӹ��ྲ̬������ͬ����ʹ�����ྲ̬���������෽��������
	//ʹ��Ҫ���ྲ̬����A����������Bдһ�����������þ�̬����A����������B����
	//����������ͨ��B������A��̬������
	public static void apple2() {
		dog dog1=new dog();
		dog1.setname2("003");
		dog1.show();
		dog1.show1();
		dog1.A001();
		dog1.A002();
		dog1.B001();
		dog1.B002();
		System.out.println();
		
		Animal a2=new Animal();
		a2.show();
		a2.A001();
		System.out.println();
		
		cat cat1=new cat();
		cat1.show();
		cat1.A001();
		cat1.A1();
		System.out.println();
	}
	
	public static void apple1() {
		Animal a1=new Animal();
		a1.name1="001";
		a1.setname2("002");
		a1.show();
		System.out.println();
	
		Animal a2=new Animal();
		a2.show();
		System.out.println();
		
		cat cat1=new cat();
		cat1.show();
		System.out.println();
	}
	
}
