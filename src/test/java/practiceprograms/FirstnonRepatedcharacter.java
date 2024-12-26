package practiceprograms;

import java.util.HashMap;
import java.util.Map;

public class FirstnonRepatedcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aacbbd";
		
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(int i =0;i<s.length();i++)
		{
			
		char ch=	s.charAt(i);
		
		if(map.containsKey(ch))
		{
			
			map.put(ch, map.get(ch)+1);
		}
		else {
			map.put(ch, 1);
		}
		}
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			if(entry.getValue()==2)
			{
				System.out.println(entry.getKey());
				break;
				
			}
			
		}
		
		
		}
		
		

	}


