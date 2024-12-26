package code.java.selenium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String S = "apple";
		
		
			
			Set<Character> list = new HashSet<Character>(Arrays.asList('a','e','i','o','u'));
			
			
char start = S.charAt(0);
			
char end= S.charAt(S.length()-1);
	if(list.contains(start)&&list.contains(end))
			{
		
		
		S	=S.substring(1, S.length()-1);
		}
			

		
		
			System.out.println(S);		
		
	}

}