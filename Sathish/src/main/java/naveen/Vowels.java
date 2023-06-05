package naveen;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "Sathish";
		
		S = S.toLowerCase();
		
		int vowels = 0;
		
//		int input = S.length();
		
		for(int i = 0 ;i<S.length();i++)
			
			
		{
			
			
			if(S.charAt(i)=='a' | S.charAt(i)=='e'| S.charAt(i)=='i'| S.charAt(i)=='o'| S.charAt(i)=='u')
			{
				vowels++;
			}
		}
System.out.println(vowels);
	}

}
