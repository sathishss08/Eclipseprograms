package naveen;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input ="Sathishkumar";
		
		
		int vowels=0;
		
		input = input.toLowerCase();
		
		int length = input.length();
		
		for(int i= 0; i <length;i++)
		{
			if(input.charAt(i)=='a'|input.charAt(i)=='e'|input.charAt(i)=='i'|input.charAt(i)=='o')
			{
		vowels++;
		
		}
		
		}
	
	System.out.println(vowels);
}}