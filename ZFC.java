package study;

public class ZFC {
	public static void main(String[] args) {
		//×Ö·û´®µÄ´´½¨
		String aa1=new String();
		String aa2="123";
		String aa5="456";
		String aa7="000";
		
		//×Ö·û´®×ª×Ö·ûÊý×é
		char[] a1=aa1.toCharArray();
		
		//×Ö·ûÊý×é×ª×Ö·û´®
		String aa6=new String(a1);
		
		//»ñÈ¡×Ö·û´®Ä³Ò»¸öÖµ
		char a2=aa2.charAt(0);
		System.out.println(a2);
		
		//ÇÐ¸î×Ö·û´®
		String aa3=aa2.substring(1);
		System.out.println(aa3);
		String aa4=aa2.substring(0,1);
		System.out.println(aa4);
		
		//StringBuilderÈÝÆ÷Ìí¼Ó×Ö·û´®
		StringBuilder bb1=new StringBuilder();
		bb1.append(aa2);
		bb1.append(aa5);
		System.out.println(bb1);
		
		//StringBuilderÈÝÆ÷·­×ª×Ö·û´®
		bb1.reverse();
		System.out.println(bb1);
		
		//StringBuilderÈÝÆ÷È¡³ö×Ö·û´®
		String bb2=bb1.toString();
		System.out.println(bb2);
		
		//StringBuilderÈÝÆ÷Ìæ»»×Ö·û´®
		bb1.replace(2, 4, aa7);
		System.out.println(bb1);
		
		//StringBuilderÈÝÆ÷³¤¶È
		int m1=bb1.length();
		System.out.println(m1);
		
	}
}
