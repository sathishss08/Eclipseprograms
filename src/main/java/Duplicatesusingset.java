import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicatesusingset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S ="laptop";
		StringBuffer ss = new StringBuffer();
		
		char ch [] =S.toCharArray();

		Set<Character> name = new LinkedHashSet<Character>();
		
		for(int i =0;i<ch.length;i++)
		{
			
			if(!name.add(ch[i]))
			{
			ss.append(ch[i]);
			
			
				
			}
			
			
			
		}
		
		System.out.println(ss);
		
		System.out.println(name);
	}


}