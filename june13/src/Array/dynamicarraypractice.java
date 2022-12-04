package Array;

import java.util.Scanner;

public class dynamicarraypractice {
      public static void main(String[] args) {
          int size,i;  // variable declaration
    	  Scanner x=new Scanner(System.in);// scanner class to take user input
	      System.out.println("Enter The Size Of Array");
    	  size= x.nextInt(); //given size of arrays will stored in size variable
	      int a[]=new int[size]; // declared array a[] to store multiple elements
	
	for(i=0;i<size;i++)  {  // for loop to travel no of given size of array
	System.out.println("Enter Element");
	 a[i]=x.nextInt(); // entered element stored in a[i]array
	}
	System.out.println("Printed All Declared Elements");
	for(i=0;i<size;i++) {    
	System.out.println(a[i]);  // printed all arrays elements
	}
}	
}