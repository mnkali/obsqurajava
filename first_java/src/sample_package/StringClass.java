package sample_package;

public class StringClass {

	public static void main(String[] args) {
		String s= "Hello";
		System.out.println(s);
		
		String a = new String("Java");
		System.out.println(a);
		
		char m[]= {'a','b','c','d'};
		String p=new String(m);
		System.out.println(p);
		
		int len = s.length();
		System.out.println(len);
		
		char c= s.charAt(3);
		System.out.println("Character at "+c+"th Positions is "+c);
		
		int i = 10;
		String New = String.valueOf(s);
		System.out.println(New);
		
		String name = "Mohseen";
		String nm = "Mohseen";
		System.out.println(name == nm); //True
		
		String ss = new String("Mohseen");
		System.out.println(ss == name); //False
		
		String ab = "Hello";
		String cd = "Java";
		String ef = "hello";
		String gh = "Hello";
		System.out.println(ab.equals(ef)); // False
		System.out.println(ab.equals(gh)); //True
		System.out.println(ab.equalsIgnoreCase(ef));//true
		
		String ij = "";
		String jk = " ";
		System.out.println(ij.isEmpty()); //True
		System.out.println(jk.isEmpty()); //False
		
	}

}
