package practiceprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Wordoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "my name is sathish sathish";
		
//		String [] spl =S.split(" ");
		
		Map<String,Integer> map = new LinkedHashMap<String, Integer>();
		
		for(String name :S.split(" "))
		{
			if(map.containsKey(name))
			{
				
				map.put(name,map.get(name)+1);
			}
			else
			{
				map.put(name, 1);
				
			}
			
			
			
		}
System.out.println(map);
	}

}
