package practiceprograms;

public class Firstletterofgivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated me
		
		
		
		
		firstletter("sathish janani");
		
		

	}

	public static Object firstletter(String name) {
		// TODO Auto-generated method stub
		
		
		String str[]=name.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			String s =str[i];
		char letter =	s.charAt(0);
		
		
		
		System.out.println(letter);
		
		
		
		}
		
		return str;
		
	}

}
