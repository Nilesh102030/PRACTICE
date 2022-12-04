package TestPackage1;

import java.util.Scanner;


public class Armstrongno {
	public static void main(String[] args) {
		int number,originalNumber,result=0,remainder;
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter Number");
		number=obj.nextInt();
		 originalNumber = number;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;  //3
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	            }
            if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    
	
	
}	
}
