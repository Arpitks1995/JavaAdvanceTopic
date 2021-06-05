package basicProgram;

public class PalindromeString {

	public static void main(String[] args) {
	String nm="madam";
	String temp=nm;
	String rev="";
	for(int i=temp.length()-1;i>=0;i--) {
		rev=rev+temp.charAt(i);
		}
	if(nm.equals(rev)) {
		System.out.println(nm+ " is Palindrome String");
	}
	else {
		System.out.println(nm+ "is not a palindrome String ");
	}

	}

}
