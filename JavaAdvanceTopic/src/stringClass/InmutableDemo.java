package stringClass;

public class InmutableDemo {
	public static void main(String[] args) {
		
		Demo d1=new Demo(123);
		System.out.println(d1.id);
		
		Demo d2=d1.add(1);
		System.out.println(d1.id);
		System.out.println(d2.id);
		
	}
	
	
	

}
