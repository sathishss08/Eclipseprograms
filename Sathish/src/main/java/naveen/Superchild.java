package naveen;

public class Superchild extends Superconstructor {
	
	
	public Superchild(int i) {
		
		super(i);
	}

	
	
	
	public Superchild() {
		
		
		super(20,"sathish");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Superchild obj = new Superchild(30);


Superchild obj1 = new Superchild();
	}

}
