package stringClass;

public class StringImmutable {

	public static void main(String[] args) {
		String s1=new String("Azam");
		System.out.println(s1);
		
		String s2=s1.concat("Amir");
		System.out.println(s1);
		System.out.println(s2);

	}

}
