package naveen;

public class Firstletterofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "sathish kumar";
		
		String str [] = S.split(" ");
		
		
		for (int i =0;i<str.length;i++)
		{
			
			String name = str[i];
			
			char ch = name.charAt(0);
			
			System.out.println(ch);
		}

	}

}
