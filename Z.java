package study2;

public class Z {
	public static void main(String[] args) {
	change();	
	}
	//��̬
	//final
	//final���η������÷���Ϊ���շ��������ɱ���д
	//final�����࣬���಻�ɱ��̳�
	//final���α����������䳣�������ɱ�����
	public static void change() {
		A1 aa1=new A2();
		A1 aa2=new A3();
		//����̬���������õĸ��ྲ̬���������ุ����ͬ������
		aa1=aa1.name(aa1);
		aa2=aa2.name(aa2);
		//����̬���������õĸ��ྲ̬���������ุ�಻ͬ������
		aa1=aa1.apple(aa1);
		aa2=aa2.apple(aa2);
		//����̬���������鷽�����������ุ����ͬ������
		aa1=aa1.name1(aa1);
		aa2=aa2.name1(aa2);
		//����̬����������û���Ҹ��࣬���ุ�಻ͬ������
		aa1=aa1.one(aa1);
		aa2=aa2.one(aa2);
		//����̬�������������еľ�̬����
		aa1=aa1.name1001(aa1);
		aa2=aa2.name1001(aa2);
		//����̬�������������еĶ�̬����
		aa1=aa1.name1002(aa1);
		aa2=aa2.name1002(aa2);
	}
}
