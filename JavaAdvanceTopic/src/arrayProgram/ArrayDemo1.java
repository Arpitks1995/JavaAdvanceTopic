package arrayProgram;

public class ArrayDemo1 {

	public static void main(String[] args) {
	int[] arr=new int[3];
	arr[0]=12;
	arr[1]=24;
	arr[2]=36;
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(i+1+" array is "+arr[i]);
	}

	}

}
