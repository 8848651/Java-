package study1;

public class DT {
	public static void main(String[] args) {
		Animal aa1=new Animal();
		Animal aa2=new cat();
		Animal aa3=new dog();
		cat cat1=new cat();
		
		AA1(aa3);
		AB1(aa3);
		AC1(aa3);
		System.out.println();
		
		AAA(aa1);
		AAA(cat1);
		AAA(aa2);
		
		System.out.println();
		AAB(cat1);
		AAB(aa2);
		//BBB();
		
		System.out.println();
		apple(aa1);
		apple(cat1);
		apple(aa2);
		
		System.out.println();
		apple001(aa1);
		apple001(cat1);
		apple001(aa2);
	
	}
	//Animal aa2=new cat();
	//��̬�������ý�֧�ָ������еģ����������еķ����޷����ã����õ��������б���д�ķ���
	//ֻ��ʹ�ø������еĳ�Ա����������ʹ�������ж��еĳ�Ա����
	//show1()�������඼�У�show2()ֻ�и�����
	//show3()Ϊ�������
	//������ุ�඼���ø����еķ������������÷���д�ɾ�̬����
	//���д�ɶ�̬��������ô����Ͳ�Ҫ��д
	//dog aa3=new dog();
	//��̬��������д�����࣬û��д������
	//��̬�������������������࣬û�е�����
	//Animal aa3=new dog();
	//��̬��������д�����࣬û��д������
	//��̬��������������û���������Ķ��Ǹ���
	public static void AAA(Animal aa1) {
		System.out.println(aa1.getClass());
		aa1.show1();
	}
	public static void AAB(Animal aa1) {
		aa1.show2();
	}
	//������dog,Animal����cat���Ķ��Ǹ����еľ�̬����
	public static void AA1(Animal aa1) {
		aa1.A001();
	}
	public static void AB1(Animal aa1) {
		aa1.B001();
	}
	public static void AC1(Animal aa1) {
		aa1.B002();
	}
	//���෽������д����������ø��෽�������۸��໹�����඼���ø��෽��
	//����ʾ��
	public static void apple001(Animal aa1) {
		aa1.show001();
	}
	//
	public static void apple(Animal aa1) {
		if(aa1 instanceof cat){apple1((cat) aa1);}
		else{aa1.show1();}}
	public static void apple1(cat aa1) {
		aa1.show3();
	}
	//��������Ǹ����ʵ�������󣬸��಻���������ʵ��������
	public static void BBB() {
		Animal aa1=new Animal();
		cat cat1=new cat();
		dog dog1=new dog();
		Animal aa2=new cat();
		
		System.out.println(aa1 instanceof Animal);
		System.out.println(aa1 instanceof cat);
		//System.out.println(dog1 instanceof cat);
		System.out.println(cat1 instanceof Animal);
		System.out.println(cat1 instanceof cat);
		System.out.println(aa2 instanceof Animal);
		System.out.println(aa2 instanceof cat);
		System.out.println(aa2 instanceof dog);
	}
	
}
