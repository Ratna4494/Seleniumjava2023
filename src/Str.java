
public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String ia an object
		//1.String Literal
		
		//String a = "Rahul setty Acedamy";
		String b = "Hello";
		
		
		//2.new memory allocate operator using new keyword
		
		String s =new String("Setty");
		String s1 =new String("Setty");
		
		String m = "Rahul setty Acedamy";
		String[] ss = m.split("setty");
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		System.out.println(ss[1].trim());//to trim the spacing before acedamy


	}// <scope>test</scope>

}
