import java.util.LinkedHashMap;
import java.util.Map;

public class Substring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "abccc";
		
		
		int sizelength = 0;
		
		String Stringvalue = null;
		
		
		
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
	
		for(int i=0;i<S.length();i++)
		{
			
			
		char ch=	S.charAt(i);
		
		if(!map.containsKey(ch))
		{
			map.put(ch, i);
		}
			
			else
			{
				
				i=map.get(ch);
				
				map.clear();
			}
			
		
		if(map.size()>sizelength)
		{
			
			sizelength =map.size();
		Stringvalue =map.keySet().toString();
		
		
		}}
		
		System.out.println(sizelength);
		
		System.out.println(Stringvalue);
	}

}
