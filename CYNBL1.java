package study7;

public class CYNBL1 {
	private String a1="001";

	private class NBL{
		private String a1="002";
		
		public void show() {
			String a1="003";
			System.out.println(a1);//003
			System.out.println(this.a1);//002
			System.out.println(CYNBL1.this.a1);//001
		}
	}

}
