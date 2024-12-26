package naveen;

import java.util.HashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str = "sathish";
		
	char ch[]	=Str.toCharArray();
	
	Map<Character, Integer> map= new HashMap<Character, Integer>();
	
	for (char c:ch)
	{
		
		if(map.containsKey(c))
		{
			
			map.put(c,map.get(c)+1);
		}
		else
		{
			
			map.put(c, 1);
		}}
		
		System.out.println(map);
	}
	
}
