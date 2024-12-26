package practiceprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Substring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		susbt("abccc");
		
		

	}
	
	public static void susbt(String str ) {
		
		int susbstringlenth =0;
		String substringname = null;
	char ch []	= str.toCharArray();
HashMap<Character, Integer> name = new LinkedHashMap<Character, Integer>();

for (int i = 0; i < ch.length; i++)
{
	
	if (!name.containsKey(ch[i]))
	{
		name.put(ch[i],i);
		
	}
	else
	{
		
		i=name.get(ch[i]);
		name.clear();
		
		
	}
	
	if(name.size()>susbstringlenth)
	{
		
		susbstringlenth= name.size();
		substringname= name.keySet().toString();
		
		
	}}
	System.out.println(susbstringlenth);
	System.out.println(substringname);
}

	
}
