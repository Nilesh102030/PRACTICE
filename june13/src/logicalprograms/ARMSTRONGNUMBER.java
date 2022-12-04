package logicalprograms;

import java.util.Scanner;
public class ARMSTRONGNUMBER {
public static void main(String[] args) {
	int n;
	int arm=0;
	int rem;
	int c;
    System.out.println("Enter The Number");
    Scanner x=new Scanner(System.in);
    n=x.nextInt();
    c=n;
    while(n>0)                // (153>0=TRUE),(15>0=TRUE),(1>0=TRUE) (0>0 =FALSE)
    {
	  rem=n%10;               // (153%10=15.3 SO REM IS 3) (15%10=1.5 SO REM=5) (1%10=1)
	  arm=(rem*rem*rem)+arm;  // [0=(3*3*3)+0=27],[27=5*5*5=125+27=152] [152=1*1*1+152=153]
      n=n/10;                 // (153/10=15.3 SO N=15)(15/10=1.5 SO N=1) (1/10=0.1 SO N=0)
	 }
     if (c==arm) {
    	System.out.println("ARMSTRONG NUMBER"); 
     }else {
         System.out.println("NOT ARMSTRONG NUMBER");
     }

}
}

