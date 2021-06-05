package stringMethod;

public class SplitString {

	public static void main(String[] args) {
		String st="Azam Amir Reza";
		
		String[] sarr=st.split(" ");
		for (int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i]);
		}

	}

}
