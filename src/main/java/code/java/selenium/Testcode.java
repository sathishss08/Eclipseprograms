package code.java.selenium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Testcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
    String S = "sathishkumar";
    
    char ch []= S.toCharArray();
    
    
    HashMap<Character,Integer> map = new LinkedHashMap<Character, Integer>();
    
    
    for(int i =0;i<ch.length;i++)
    {
    	
    	if(map.containsKey(ch[i]))
    	{
    		
    	
    	map.put(ch[i],map.get(ch[i])+1);
    	
    }
    	else
    	{
    		
    		map.put(ch[i],1);
    	}}
    
    	for(Map.Entry<Character, Integer> entry: map.entrySet())
    	{
    		
    		if(entry.getValue()==1)
{
    			
    			System.out.println(entry.getKey());
	
	break;
}
    	}
    

	}
    

	}

