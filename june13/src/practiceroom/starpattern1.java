package practiceroom;

public class starpattern1 {
public static void main (String []args) {

	
	int space=5;
	int star=0;
	for(int i=1;i<=5;i++)  {
	for(int j=0;j<=space;j++);
    System.out.print(" ");
	}
	for(int k=0;k<=star;k++) {
    System.out.println("*");
	star++;	
	space--;	

	}
}}