public class StringConstructors{
	public static void main(String[] args){
		String str1 = new String();
		String str2 = new String("Good Morning");
		char data[] = {'H','o','t',' ','D','o','g'};
		String str3 = new String(data);
		String str4 = new String(data, 4, 3);
		byte bytedata[] = {(byte)'1',(byte)'i',(byte)'n',(byte)'e',(byte)'a',(byte)'r'};
		String str5 = new String(bytedata);
		String str6 = new String(bytedata,3,3);
		StringBuffer sb = new StringBuffer("Have a great day !");
		String str7 = new String(sb);
		
		System.out.println("str1 is "+str1);
		System.out.println("str2 is "+str2);
		System.out.println("str3 is "+str3);
		System.out.println("str4 is "+str4);
		System.out.println("str5 is "+str5);
		System.out.println("str6 is "+str6);
		System.out.println("str7 is "+str7);
		
		System.out.println("hello".toUpperCase());
		System.out.println("hello".concat(" there").concat(" ,Java!"));
		
		String s1 = "Tom Talbert Tried Trains";
		String s2;
		s2 = s1.replace('T','D');
		System.out.println(s1);
		System.out.println(s2);
		
		String g1 = "    Hello   ";
		String g2;
		g2 = g1.trim();
		System.out.println(g1);
		System.out.println(g2);
		
		String fullName = "Diamond Store Bangkok";
		String middleName = fullName.substring(8,13);
		String lastName = fullName.substring(14);
		System.out.println("fullName = "+fullName);
		System.out.println("middleName = "+middleName);
		System.out.println("lastName = "+lastName);
		
		boolean b=true;
		char[] letters = {'a','b','c','d','e'};
		double d = 2.4981567;
		int i =7;
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(letters));
		System.out.println(String.valueOf(letters,1,3));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(i));	
		
	}
}