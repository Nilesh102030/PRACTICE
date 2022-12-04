package scanner;

import java.util.Scanner;

public class scannerr {
    public static void main(String[] args) {
       	Scanner demo=new Scanner(System.in); // to use scanner we created ref  object
		     System.out.println("enter the age");
	      int value=demo.nextInt();
	         System.out.println("your  age is "+ value);
	    
	         System.out.println( "enter your gender");
	      String value1=demo.next();
	         System.out.println("your gender is " + value1);
   
	          System.out.println("enter youe mobile no");  
	      long value2=demo.nextLong();
	         System.out.println("your mobile no is "+ value2);   
	          
	          demo.close();
    
    
    }
}
