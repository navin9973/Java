package Pattern;

public class Rightangletaiangle {
	
  public static void main(String arg[])
  {
	  int n=17;
//	  for(int i=1;i<=n;i++)
//	  {
//		  for(int j=1;j<=n;j++)
//		  {
//			  if(j<=i)
//			  {
//				  System.out.print("*");
//			  }
//			  else 
//			  {
//				  System.out.print(" ");
//			  }
//		  }
//		  System.out.println();
//	  }
//	  for(int i=1;i<=n;i++)
//	  {
//		  for(int j=1;j<=n;j++)
//		  {
//			  if(j<=(n+1)-i)
//			  {
//				  System.out.print("*");
//			  }
//			  else 
//			  {
//				  System.out.print(" ");
//			  }
//		  }
//		  System.out.println();
//	  }
	  
//	  
//	  for(int i=1;i<=n;i++)
//	  {
//		  for(int j=1;j<=n;j++)
//		  {
//			  if(j<=n-i)
//			  {
//				  System.out.print(" ");
//			  }
//			  else 
//			  {
//				  System.out.print("*");
//			  }
//		  }
//		  System.out.println();
//	  }
	  
//	  for(int i=1;i<=n;i++)
//	  {
//		  for(int j=1;j<=n;j++)
//		  {
//			  if(j<=i-1)
//			  {
//				  System.out.print(" ");
//			  }
//			  else 
//			  {
//				  System.out.print("*");
//			  }
//		  }
//		  System.out.println();
//	  }
//	 

	  
	  
	  for(int i=1;i<=(n+1)/2;i++)
	  {
		  for(int j=1;j<=(n+1)/2;j++)
		  {
			  if(j<=(((n+1)/2)+1)-i)
			  {
				  System.out.print("*");
			  }
			  else 
			  {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
	  for(int i=2;i<=(n+1)/2;i++)
	  {
		  for(int j=1;j<=(n+1)/2;j++)
		  {
			  if(j<=i)
			  {
				  System.out.print("*");
			  }
			  else 
			  {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
	  
	  
  }

}
