package practiceprograms;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		
		int a []= {5,6,33,8,9};
		
		int temp =0;
		
		for(int i=0; i<=a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]<a[j])
				{
					
					temp=a[i];
					
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.println(a[1]);
	}

}
