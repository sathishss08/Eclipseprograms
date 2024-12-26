package practiceprograms;

public class OverRide {
	
	
	
	
	public  void start(int a, String name)
	{
		
	System.out.println(a + " "+ name);	
	}
	
	public static void start(int a1, String name1,int a)
	{
		
	System.out.println(a1 + " "+ name1+"" + a);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRide obj1 = new OverRide();
		
		obj1.start(10, "janani");
		
		OverRide.start(10, "sathish", 20);
		
		

	}

}
