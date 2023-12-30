
public class Multiple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,4,5,6,7,8,9,10,122};
		
		for(int i =0;i<a.length;i++)
		{
			if(a[i] % 2 == 0)
			{
				System.out.println(a[i]);
				break;
			}
			else
			{
				System.out.println(a[i]+"ïs not a multiple of 2");

			}
		}

	}

}
