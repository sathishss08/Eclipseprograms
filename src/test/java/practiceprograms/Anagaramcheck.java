package practiceprograms;

import java.util.Arrays;

public class Anagaramcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str1 = "tomato";
		
		String Str2 = "Matoto";
		
		if(Str1.length()!= Str2.length())
		{
			boolean name = false;
			System.out.println("this is not an anagaram:"+name);
		}
		
		else
		{
			
			char ch1[] = Str1.toLowerCase().toCharArray();
			
			char ch2[] = Str2.toLowerCase().toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean name1= Arrays.equals(ch1, ch2);
			
			System.out.println(name1);
		}

	}

}
