package java18Hours;

class Process11 extends Thread
{
    public void run() {
		int i;
		for( i =1;i<=10;i++) 
		{
			System.out.println("Process1: "+ i);
		}
	}
}

class Process22 extends Thread
{
	public void run() {
		int i;
		for( i =1;i<=10;i++) 
		{
			System.out.println("Process2: "+ i);
		}
	}
	
	
}

public class MultiThreading2
{
	 public static void main(String args[]) 
	 {
		 Process11 p11 = new Process11();
		 Process22 p22 = new Process22();
		 p11.start();
		 p22.start();
		 
	 }

}

