import java.util.LinkedHashMap;
import java.util.Map;

public class Stringconcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "aaabbbacfwww";
		
	LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	
	char[] ch =S.toCharArray();
	
	for(int i=0;i<ch.length;i++)
	{
		
		if(map.containsKey(ch[i]))
		{
			
			map.put(ch[i],map.get(ch[i])+1);
		}
		else
		{
			map.put(ch[i], 1);
	}
	}
	StringBuffer sb = new StringBuffer();

	for(Map.Entry<Character,Integer> entry:map.entrySet())
	{
	
	sb.append(entry.getKey());
	
	sb.append(entry.getValue());
	
	}
	
	System.out.println(sb.toString());

}}