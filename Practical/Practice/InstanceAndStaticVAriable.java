package Practice;
class Demo
{
	
	public static int var ;
	
	public static void demo() 
	{
		System.out.println("It's a Static method");
	}
	
	
	static 
	{	var = 8;
		System.out.println("It is Static Block");
	}	
}


public class InstanceAndStaticVAriable {
	public static void main(String args[]) 
	{
		System.out.println(Demo.var);
		Demo.demo();		
	}
}
