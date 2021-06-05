package advanceTopic;

public class EmpTest {

	public static void main(String[] args) {
		Emp e1=new Emp(123,"Arpit");
		Emp e2=new Emp(123,"Arpit");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.equals(e2));
		System.out.println(e1);
		System.out.println(e2);

	}

}
