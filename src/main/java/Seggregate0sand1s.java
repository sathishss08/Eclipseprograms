import java.util.LinkedList;

public class Seggregate0sand1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a[] = {0,1,0,1,0,1,0,1,0,0,0,-2,};
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
	for(int i=0;i<a.length;i++)
		
		
	{
			
		
			
			if(a[i]==0|a[i]==1)
				
			{
				
				list.addFirst(a[i]);
			}
			
			else {
				
			
			
				
				list.addLast(a[i]);;
			}
			
	}
		
System.out.println(list);
	}

}
