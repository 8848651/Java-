package study7;

public class CYNBL {
	//�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽��
	//�ⲿ������ڲ���Ҫ��������
	//��ȡ��Ա�ڲ���ķ���
	//1���ⲿ���д���������ṩ�ڲ������
	//2��ֱ�Ӵ������磺CYNBL.NBL str=new CYNBL().new NBL()
	//�ⲿ���ڲ��ཫ�俴��Ϊ���������ƽ������ֻ�����������ƽ����
	private String a1;
	public String a2;
	
	//����ڲ�����private�����ⲿ�޷���ȡ
	//˽���ڲ���
	private class NBL{
		private String a3;
		public String a4;
		
		public void show() {
			System.out.println(a1);
			System.out.println(a2);
		}
	}
	
	//1���ⲿ��ȡ˽���ڲ��෽��ʹ��object���գ���ֱ��ʹ��
	public NBL getNBL() {
		return new NBL();
	}
	
	public void show() {
		System.out.println(a1);
		//�޷�����a4�����봴���������
		//System.out.println(a4);
		NBL aa1=new NBL();
		System.out.println(aa1.a3);
		System.out.println(aa1.a4);
	}

}
