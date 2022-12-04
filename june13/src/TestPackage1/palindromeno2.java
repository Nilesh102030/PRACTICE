package TestPackage1;

public class palindromeno2 {
    public static void main(String[] args) {
		
	  int no=131;
      int temp=no;
      int rev=0,rem;
 
    while (temp!=0)         { // 131!=0=true
           rem=temp%10;      // 1st loop rem=1;2ndloop rem=3;3rd loop rem=1
           rev=rev*10+rem;   // 1st loop rev=1;2nd loop rev=3;3rd loop rev=1
           temp=temp/10;     // 1st loop temp=13;2ndloop temp=1;3rd loop temp=0  condition false
                            }
	    if (no==rev) { 
            System.out.println("no is palindrome");
	                                                 }
	
	    else {
	    	System.out.println("no is not palindrome");
	    }
	}	
}
