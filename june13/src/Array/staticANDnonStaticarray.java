package Array;

public class staticANDnonStaticarray {
  public static int a[]= {10,20,30,40,50}; //static array with access specifier
	
  //  int d[]= {100,200,300,400,500};  // non static array outside main method not allowed
	
	public static void main(String[] args) {
		int d[]= {100,200,300,400,500};  // non static array
		int c[]= {12,13,14,15};	{         // non static array needs to declare in main method
	    System.out.println(c[1]);
		}
	for(int i=0;i<a.length;i++)  {
		System.out.println(a[i]);
		}
		
	for(int i=0;i<d.length;i++)  {
		System.out.println(d[i]);
		
		}
System.out.println(a.length);
	
	}	
}
