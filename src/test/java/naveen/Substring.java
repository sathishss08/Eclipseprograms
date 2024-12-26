package naveen;

import java.util.LinkedHashMap;
import java.util.Map;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "abccaasdfhjklnm";
		
		int subsrtinglength = 0;
		String substring = null;
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		
char ch[] = name .toCharArray();

for (int i=0;i<ch.length;i++)
	
{
	if (!map.containsKey(ch[i]))
	{
		map.put(ch[i], i);
		
	}
	else
	{
		i=map.get(ch[i]);
		
		map.clear();
				
	}
	if(map.size()>subsrtinglength)
	{
		
		subsrtinglength=map.size();
		substring=map.keySet().toString();
		
	}}
	System.out.println(subsrtinglength);
	System.out.println(substring);
}

	


	}


