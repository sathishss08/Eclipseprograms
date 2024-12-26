import java.util.Arrays;

public class MergeTwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,1,6};
		
		int b[]= {0,3,9,7};
		
		
		int c[]  = new int[a.length+b.length];
		
	for(int i =0;i<a.length;i++)
	{
		
		c[i]=a[i];
		
	}
	for(int i=0;i<b.length;i++)
	{
		
		c[i+a.length]=b[i];
	}
		
	
	System.out.println(Arrays.toString(Arrays.stream(c).sorted().toArray()));

	}

}
