package study6;


//�ӿ�ʹ��interface���壬public interface �ӿ���{}
//�ӿڲ���ʵ����
//�ӿں�����ʵ�ֹ�ϵʹ��implements�ؼ��ֱ�ʾ
//���Ե�ʵ��Ҳ���Զ�ʵ��
// public class ���� implements �ӿ�1���ӿ�2{}
//Ҳ�����ڼ̳е�ͬʱʵ�ֶ���ӿ�
//public class ����1 extends����2 implements �ӿ�1���ӿ�2{}
//��������һ�࣬��һ������ĳ���
//�ӿ��Ƕ���Ϊ�ĳ�����Ϊ���ܳ���Ϊ�ࡣ���������Ϊ��ʾ��������Ϊ������
//����ӿ���ͬ���ķ���ֻҪдһ�ξͿ���
//�ӿ�֮����Զ�̳�Ҳ���Ե��̳�
//���ʵ����ʵ�����ӽӿڣ�����Ҫ��д���еĽӿ�
public class JK extends A1 implements J1,J2{
	private String age;
	private String gender;
	public JK() {super();}
	public JK(String name,String age,String gender) {
		super(name);
		this.age=age;
		this.gender=gender;
		}
	
	public void setage(String age) {
		this.age=age;
	}
	public String getage() {
		return age;
	}
	public void setgender(String gender) {
		this.gender=gender;
	}
	
	public String getgender() {
		return gender;
	}

	@Override
	public void name() {
		System.out.println("����Ϊ"+getname());
	}
	@Override
	public void gender() {
		System.out.println("�ձ�Ϊ"+getgender());
	}
	@Override
	public void age() {
		System.out.println("����Ϊ"+getage());
	}
	@Override
	public void menth() {
		System.out.println("�ӿ�1�ͽӿ�2�����ķ���");
	}
	@Override
	public void menth1() {
		System.out.println("�ӿ�1���еķ���");
	}
	@Override
	public void method() {
		System.out.println("�ӿ�0�ķ���");
	}

}
