package overrideadvanceTopic;

public class Emp {
	int id;
	String name;

	Emp(int id, String name) {
     this.id=id;
     this.name=name;
	}
	//after override
	public int hashcode() {
		return id;
	}
	public boolean equals(Object obj) {
		return this.hashcode()==obj.hashCode();
	}
	public String toString() {
		return name+ " "+id;
	}
	 
}
