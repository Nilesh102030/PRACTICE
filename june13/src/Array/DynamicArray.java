package Array;

import java.util.Scanner;

public class DynamicArray {
public static void main(String[] args) {
 System.out.println("static");
	int a[]=new int[12];
	    a[0]=10;
	    a[1]=20;
	    a[2]=30;
	for(int i=0;i<=11;i++) {
		System.out.println(a[i]);;
	}
	System.out.println("Dynamic");
	
	Scanner demo=new Scanner(System.in); 
    System.out.println("Enter Size Of Array");
	int c=demo.nextInt();
	
    int b[]=new int[c];
	int ele[]=new int[c];
	
	for(int i=0;i<c;i++)
	{  
		System.out.println("Enter Element");
	    ele[i]=demo.nextInt();
	}
	for(int i=0;i<c;i++) {
	    System.out.println(ele[i]);
	}
	
	
}
}
