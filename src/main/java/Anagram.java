import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean name = checkanagram("sat", "tps");
		System.out.println(name);
		

	}
	
	public static Boolean checkanagram( String name1 ,String name2)
	
	{
		
		if(name1.length()!=name2.length())
			
		{
		
			return false;
		}
			else
			{
		char ch[]	=name1.toCharArray();
		
		char ch1[]=name2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		return Arrays.equals(ch, ch1);
				
			}
		
		
	}
		

}
