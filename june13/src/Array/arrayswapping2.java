package Array;

public class arrayswapping2 {
public static void main(String[] args) {
	int a [] = {30,40,50,60,70,80};
	
	for(int i=0;i<a.length;i++)  {
	System.out.println(a[i]+",");
	}
	
	for(int i=0;i<(a.length/2);i++)  {  // a=6 so 6/2=3(i=0,1,2,3) so 3 time for loop will travel 
		int z;
		z=a[i];
	    a[i]=a[(a.length-1)-i];  // a[0]=a[(6-1=5)-0] 5-0=5 so value of 5 will assign to 0 =80 a[0]=a[5]
	    a[(a.length-1)-i]=z;     // value of a is stored in z
	}
	System.out.println("====SWAPPING====");
	//System.out.println(a[0]);
	for(int i=0;i<a.length;i++)  {
		System.out.println(a[i]+",");
		}
}
}
