package practiceprograms;

import java.util.HashMap;

public class Occurance11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S ="sathish";
		
		char ch[] = S.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		for (Character c :ch)
		{
			
			if(map.containsKey(c))
			{
				
				map.put(c, map.get(c)+1);
			}
				else
				{
					
					map.put(c, 1);
				}}
			System.out.println(map);
				}}
				

