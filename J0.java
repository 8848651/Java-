package study6;

public interface J0 {
	public abstract void method();
	//Ĭ�Ϸ������ǳ��󷽷�����ǿ����д
	//��дȥ��default
	//����ӿ�������ͬ��Ĭ�Ϸ������ͱ�����д�÷���
	//����ӿڽ�Ĭ�Ϸ�����Ϊ���󷽷���������д�÷���
	//�ӿ��еľ�̬������ֻ��ͨ���ӿ������ò���ͨ��ʵ�������
	public default void method2() {
		System.out.println("�ӿ�Ĭ�Ϸ���");
		apple();
		apple1();
	}
	public static void method3() {
		System.out.println("�ӿ��еľ�̬����");
		apple1();
	}
	//��ͨ˽�з�����������Ĭ�Ϸ���
	private void apple() {
		System.out.println("�ӿ��е�˽�з���");
	}
	//��̬˽�з����������ھ�̬������Ĭ�Ϸ���Ҳ����
	private static void apple1() {
		System.out.println("�ӿ��е�˽�з���");
	}
}
