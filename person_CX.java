package study5;

public abstract class person_CX {
	//���󷽷�Ҫ�����������д�÷�����Ҫ����д���з���
	//ֻҪ���ڳ��󷽷��������������࣬�г��󷽷�һ���ǳ����࣬�����಻һ���г��󷽷�
	//�����಻�ܱ�ʵ�����������й��췽��
	//person_CXΪ�����࣬person_CX2�̳���person_CXҲΪ������
	//person_SX2Ϊperson_CX2�̳���ǳ�����
	//person_SXΪperson_CX�̳���ǳ�����,person1_CX�̳в�����person_SX��
	//person1_SXΪperson1_CX�̳���ǳ�����
	//�����಻���Զ��徲̬����
	private String name;
	public person_CX() {}
	public person_CX(String name) {this.name=name;}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	
	public abstract void age();
	
	public void name() {
		System.out.println("����Ϊ"+name);
	}
}
