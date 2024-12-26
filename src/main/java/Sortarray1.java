
public class Sortarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] a = {2,8,9,4,6,1};
		
		int temp=0;
	
		for(int i=0;i<a.length;i++)
			
			{
			
			for(int j=0;j<a.length-i-1;j++)
			{
				
				if(a[j]<a[j+1])
				{
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}	
					
				}
			}
		System.out.println(a[1]);                                                                                                                                            

	}
		

}
