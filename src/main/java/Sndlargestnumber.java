import java.util.Arrays;

public class Sndlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {2,3,6,8,7};
		
		
		int temp =0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				
				if(arr[i]<arr[j])
				{
					
					temp =arr[i];
					
					arr[i]=arr[j];
					
					arr[j]=temp;
				}
			}
		}
System.out.println(temp);
	}

}
