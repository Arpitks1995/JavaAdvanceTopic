package stringMethod;

public class LengthMethods {

	public static void main(String[] args) {
		String s1="Azam";
		System.out.println((int)'z');
		String s2="Adam";
		System.out.println((int)'d');
		System.out.println(s1.compareTo(s2));//yai basically difference nikal kai dai rah hai
		
		for (char c = 'a'; c<='z'; c++) {
			int ic=c;
			System.out.println(c+ " ascii-> " +ic);
			
		}
		char grade='A';
		System.out.println(grade);
		int igrade=grade;
		System.out.println(grade);
		System.out.println(igrade);

	}

}
