package STRING;

public class starprogarm {
public static void main(String[] args) {
	int star=5; 
	int space=0;
	
	for(int i=1;i<=5;i++)  {
	  for(int j=0;j<=space;j++) {
	  System.out.print(" ");
	  }
	for(int k=1;k<=star;k++) {
		System.out.print("*");
		}
   System.out.println();
	space++;
	star--;
	}
}
	
	
	
	
	
}
