package Array;

import java.util.Arrays;

public class inttypearray {
public static void main(String[] args) {
	int a [] = {30,50,40,70,60}; // declaration of arrays	// static =size is fixed
	System.out.println("ARRAY ALL INFORMATION");
    for (int i=0; i<a.length; i++)                // calling from start
    System.out.println("Element at index " + i
                        + " : " + a[i]);

	Arrays.sort(a);
	System.out.println("Arrays in ASCENDING OREDER");

	for (int i=0; i<a.length; i++)                // calling from start
	    System.out.println("Element at index " + i
	                        + " : " + a[i]);

	System.out.println("ARRAYS IN DESCENDING ORDER");
	for (int i=a.length-1;i>=0;i--)  {         // calling from END
	    System.out.println("Element at index " + i
	                        + " : " + a[i]);
	
}
}}