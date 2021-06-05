package overrideadvanceTopic;

public class EmpTest {

	public static void main(String[] args) {
		Emp e1=new Emp(123,"Arpit");
		Emp e2=new Emp(124,"Naveen");
		System.out.println(e1.hashcode());
		System.out.println(e2.hashcode());
		System.out.println(e1.equals(e2));
		System.out.println(e1);
		System.out.println(e2);
	}

}
