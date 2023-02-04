package study7;

public class CYNBL2 {
	private String a1;
	public CYNBL2() {}
	public CYNBL2(String a1) {
		this.a1=a1;
	}	
	public class NBL{
		public NBL() {}
		public NBL(String a1) {
			CYNBL2.this.a1=a1;
		}
		public void show() {
			System.out.println(a1);
		}
	}
	public void show() {
		System.out.println(a1);
	}
}
