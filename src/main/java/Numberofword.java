import java.util.LinkedHashMap;
import java.util.Map;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class Numberofword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s ="i love my country";
		
		char ch []=s.toCharArray();
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<ch.length;i++)
		{
			
		if(map.containsKey(ch[i]))
		{
			map.put(ch[i], map.get(ch[i])+1);
			
			
			
		}
		
		else
		{
			
			map.put(ch[i], 1);
		}
		
		}
StringBuffer ap = new StringBuffer();



for(Map.Entry<Character, Integer> entry:map.entrySet())
{
	ap.append(entry.getKey());
	ap.append(entry.getValue());
}

System.out.println(ap);
	}
	
	
	

}
