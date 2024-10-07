package Practice;
class Overloading
{
	int sum(int x, int y) {
		return x+y;
	}
	
	int sum(int x, int y, int z) {
		return x+y+z;
	}
	
	void sum(int x) {
		System.out.println(x);
	}
	
	double sum(double x, double y) {
	    return x + y;
	}
	
}

public class MethodOverloading 
{
	public static void main(String args[]) {
	Overloading obj = new Overloading();
	System.out.println(obj.sum(2, 3));
	 System.out.println(obj.sum(2, 3, 4));
	 obj.sum(2);
	 System.out.println(obj.sum(2.87, 9.67));
	
	}

}
