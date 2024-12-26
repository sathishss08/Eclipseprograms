package code.java.selenium;

import java.util.LinkedHashMap;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "abccc";
		
	int stringlen =0;
	
	String value = null;
	
	char ch[] = S.toCharArray();
	
	LinkedHashMap<Character,Integer> map= new LinkedHashMap<Character, Integer>();
	
	for(int i =0;i<ch.length;i++)
	{
		if(!map.containsKey(ch[i]))
		{
			
			map.put(ch[i], i);
		}
		else
		{
			i=map.get(ch[i]);
			
			map.clear();
		}
		
		
		

	if(map.size()>stringlen)
	{
		
		stringlen = map.size();
		
		value = map.keySet().toString();
	}
	}
	System.out.println(stringlen);
	System.out.println(value);
	}

}
