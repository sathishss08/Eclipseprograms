package practiceprograms;

import java.util.HashMap;
import java.util.Set;

public class Occurance {
	
	
	
	
	public static void getname(String name)
	
	{
	
//		
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		
//		char  c []= name.toCharArray();
//		for (char ch : c)
//		{
//		
//		if(map.containsKey(ch))
//		{
//			
//			map.put(ch, map.get(ch)+1);
//		}
//		else {
//			 
//		
//			map.put(ch, 1);
//		}}
//		System.out.println(map);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		getname("sathish");
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char c [] =name.toCharArray();
		
		for (char ch : c)
		{
			
			
			if (map.containsKey(ch))
			{
				
				map.put(ch, map.get(ch)+1);
			}
			else 
			{
				
				map.put(ch, 1);
			}
			
			
		}
		System.out.println(map);
		
		

	}
	public static void main(String[] args) {
		
getname("janani");
}}
