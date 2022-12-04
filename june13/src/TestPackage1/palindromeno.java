package TestPackage1;

public class palindromeno {

	public static void main(String[] args) {
		int number=121;
		int temp=number;
		int rev=0,rem;
		
		while ( temp!=0) {  // condition is (121!=0).true condn it will go in while loop
	          rem=temp%10; // 121%10 =1 we use modules(%) due to rem is fractional;rem=1;
		      rev=(rev*10)+rem; // rev=0;0*10+1;rev=1 in 2nd loop 1*10=rem
		     temp=temp/10;//21/10=12 temp=12- again 12!=0 -again while loo[ travel still temp=0
		}
    if( number==rev)  {
         System.out.println("given no is palindrome number");
	}
    else {
         System.out.println("given no is not palindrome mumber");
    }
    }
}