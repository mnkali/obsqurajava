package sample_package;

public class String_buffer_builder {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("String Buffer");
		System.out.println(sb);
		
		StringBuilder bld = new StringBuilder("String Builder");
		System.out.println(bld); 
		
		//Methods for String Buffer
		//Append
		sb.append("Hello"); //add the new string at last
		System.out.println(sb);
		
		//Insert
		sb.insert(2, "new"); //Based on the index
		System.out.println(sb);
		
		//Replace
		sb.replace(1, 3, "java");//start, end, string
		System.out.println(sb);
		
		//Delete
		sb.delete(1, 3);
		System.out.println(sb);
		
		//Reverse
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("--------String Builder------------");
		//Methods for String Builder
				//Append
		bld.append(" Hello"); //add the new string at last
				System.out.println(bld);
				
				//Insert
				bld.insert(2, "new"); //Based on the index
				System.out.println(bld);
				
				//Replace
				bld.replace(1, 3, "java");//start, end, string
				System.out.println(bld);
				
				//Delete
				bld.delete(1, 3);
				System.out.println(bld);
				
				//Reverse
				bld.reverse();
				System.out.println(bld);
	}

}
