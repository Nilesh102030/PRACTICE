package Array;

public class Stringtypearray {
public static void main(String[] args) {
	String x[]=new String[5]; // Array Declaration 
	       x[0]="gaurav";	
	       x[1]="saket";
	       x[2]="vikas";
	       x[3]="nilesh";
	       x[4]="suvarna";
	  //   x[5]="swapnali";  ArraysIndexOutOfBoundException if we take more arrays than declare
	
	System.out.println(x[0]);
	System.out.println("to print all arrays");
	
	//      for (int i=0; i<x.length; i++)                // calling from start
       //  System.out.println("Element at index " + i
                   //         + " : " + x[i]);

         for (int i = 4; i > 0; i--)                   // calling from reverse
             System.out.println("Element at index " + i
                                + " : " + x[i]);
	
	     System.out.println(x[0]); // to call by index no
	
}
}