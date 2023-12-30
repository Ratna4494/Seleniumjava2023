
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,4,5,6,7,8,9,10,122};
		
		//multiples of 2 from array 2,4,6,8,10,122
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
				System.out.println(arr[i]);
		}

	}

}

/*//More Descriptive
for(int i =0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.println(arr[i]);
			}
			else
			{
			 	System.out.println(arr[i]+"Is not multiple of 2");

			}	
		}

 */
 
