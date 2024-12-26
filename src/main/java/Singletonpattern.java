
public class Singletonpattern {
	
	
	private Singletonpattern()
	{
		
		
	}
	
	private static  Singletonpattern instance;
	{
		int a = 10+20;
		
		System.out.println(a);
	}
	
	
	public static Singletonpattern getInstance()
	
	
	{
		
		if(instance ==null)
		{
			
			instance = new Singletonpattern();
		}
		
		return instance;
		
	}

}
