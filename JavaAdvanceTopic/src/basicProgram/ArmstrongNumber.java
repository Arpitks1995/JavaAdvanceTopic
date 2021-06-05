package basicProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
	int no=370;
	int t1=no;
	int leng=0;
	while(t1!=0) {
		leng=leng+1;
		t1=t1/10;
	}
	
	int t2=no;
	int arm=0;
	int rem;
	while(t2!=0) {
		int mult=1;
		rem=t2%10;
		for (int i = 1; i <=leng; i++) {
			mult=mult*rem;
			
		}
		arm=arm+mult;
		t2=t2/10;
		
	}
	if(no==arm) {
		System.out.println(no+ " is a Armstrong Number");
	}else {
		System.out.println(no+ " is not a Armstrong Number");
	}

	}

}
