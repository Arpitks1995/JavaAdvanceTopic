package stringClass;

public class StringLiteralAndNew {

	public static void main(String[] args) {
	//By Literal Keyword
	String s1="Azam";
	String s2="Azam";
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	
	//By new Keyword
	String s3=new String("Azam");
	String s4=new String("Azam");
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
	

	}

}
