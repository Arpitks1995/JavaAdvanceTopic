package arrayProgram;
import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Value");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println(i+1+ " Value of Array");
			arr[i]=sc.nextInt();
			
		}
		System.out.println("###################Array Element are#####################");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}

	}

}
