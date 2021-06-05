package basicProgram;
import java.util.Scanner;
public class StringReverseScanner {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Name");
		String nm=sc.nextLine();
		String rev=" ";
		for(int i=nm.length()-1;i>=0;i--) {
			rev=rev+nm.charAt(i);
		}
		System.out.println(rev);
	

	}

}
