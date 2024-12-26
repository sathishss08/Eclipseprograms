package naveen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removedupchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "ryansathisHJanani";
		
		
		S= S.toLowerCase();
		
		
	
	
	Set<Character> name = new LinkedHashSet<Character>();
	

for(int i=0;i<S.length();i++)
{
	
	char ch =S.charAt(i);
name.add(ch);
}
	

StringBuilder name1 = new StringBuilder();


for(char ch :name)
{
	name1.append(ch);
	
	
}


System.out.println(name1);
	}

}
