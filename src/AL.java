import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Rahul");
		a.add("Shetty");
		a.add("Zaid");
		a.add("Mariay");
		//a.remove(3);
		//System.out.print(a.get(0));
		

		//Iterating Arraylist
		
		for (int i =0;i<a.size();i++) 
		{
			System.out.println(a.get(i));
			
		}
		
		for(String b:a)
		{
			System.out.println(b);

		}
		
		//Item present in list
		
		System.out.println(a.contains("Raj"));
		
		
		//Converting normal array to arraylist
		
		String[] name ={"Kiran","Vinod","Bittu"};
		
		List newAL = Arrays.asList(name);
		
		System.out.println(newAL.contains("Vinod"));
		
		//Declaring one method from other class 
		Methodsdemo o = new Methodsdemo();
		o.getData();
		
		
		
		

	}

}
