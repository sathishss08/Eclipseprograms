package naveen;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Lengthofthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "ryanrudh";
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		
	char ch[]= S.toCharArray();
	
	
	for (char c :ch)
	{
		
		if(map.containsKey(c))
		{
			
			map.put(c,map.get(c)+1);
		}
		else
		{
			
			map.put(c,1);
		}}
		
		StringBuffer sb = new StringBuffer();
		
		for(Entry<Character,Integer> entry:map.entrySet())
		{
			
			sb.append(entry.getKey());
			
			sb.append(entry.getValue());
		}
		
		System.out.println(sb.toString());
	}
	}
	


