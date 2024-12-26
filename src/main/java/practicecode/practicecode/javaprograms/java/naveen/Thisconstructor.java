package naveen;

public class Thisconstructor {
	
	
	String name;
	
	String city;
	int age;
	
	String state;
	
	public Thisconstructor(String name,int age) {
		
		this.name= name;
		this.age = age;
		
		
		
	}
	
	
	public void test() {
		
		int a =10;
		int b= 20;
		int c =a+b;
		
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thisconstructor obj = new Thisconstructor("sathish", 28);
		
		System.out.println(obj.name+ " "+ obj.age );
		
		obj.test();
		
		
		

	}

}
