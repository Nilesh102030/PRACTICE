package starpatterns;

public class starpattern3 {
public static void main(String[] args) {
	 int star=5;
	    for (int i=1;i<=9;i++)  {
	         for (int k=1; k<=star;k++) {
	              System.out.print("*");
	              }
	         
	      System.out.println();   
	
	 
		if (i<=4)
			star--;
		else 
			star++;
		}	        
	    }	    
        }
