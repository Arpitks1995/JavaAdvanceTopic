package stringClass;

public final class Demo {
	
	final int id;
	Demo(int id){
		this.id=id;
	}
	
	Demo add(int id) {
		return new Demo(this.id+id);
	}

}
