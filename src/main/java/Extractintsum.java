
public class Extractintsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "Sathish123";
		
		

		StringBuilder extractedDigits = new StringBuilder();
	
	char ch []=S.toCharArray();	
	
	
	for(int i=0 ;i<ch.length;i++)
	{
		
		if(Character.isDigit(ch[i]))
		{
	
			extractedDigits.append(ch[i]);
			
			
		}
	}
	System.out.println(extractedDigits);
		
}}

