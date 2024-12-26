package naveen;

import java.util.LinkedHashMap;

public class Substring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "ababcdab";
		int substringlen  = 0;
		
		String substring = null;
		
		
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		
		 char ch[] =S.toCharArray();
		
		for (int i=0;i<S.length();i++)
		{
			
			if(!map.containsKey(ch[i]))
			{
				
				map.put(ch[i], i);
			}
			else {
				
				i=map.get(ch[i]);
				map.clear();
				
				
			}}
			if(map.size()>substringlen)
			{
				
				substringlen =map.size();
				substring =map.keySet().toString();
			}
			System.out.println(substringlen);
			System.out.println(substring);
		}
		
		

	}

