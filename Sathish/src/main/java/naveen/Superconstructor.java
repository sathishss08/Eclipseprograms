package naveen;

public class Superconstructor {

	public Superconstructor() {
		
		System.out.println("default constructr");
		
	}
	
	public Superconstructor(int i , String name) {
		
		System.out.println("the value is"+ i +"name is  " + name);
	}
	
	
	public Superconstructor(int i) {
		
		System.out.println("the value is"+ i );
	}
}
