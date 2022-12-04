package Array;

import java.util.Scanner;

public class DyanamicArray2 {
public static void main(String[] args) {
	int size,i;
    Scanner r=new Scanner(System.in);
	System.out.println("Enter The Size Of Array");
	size=r.nextInt(); //entered value will stored in size variable   
	int a[]=new int[size]; // in runtime size will be fixed 
	
	    for(i=0;i<size;i++) {  // for loop will repeat the no of size declared
	    	System.out.println("Enter Elements");
	      a[i]=r.nextInt(); // given elements will stored in a[i]
	                        }
		System.out.println("Printed Arrays Elements");
	
		for(i=0;i<size;i++)	{
        System.out.println(a[i]); // to print all declared elements

	                         }


}
}