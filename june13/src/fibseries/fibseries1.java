package fibseries;

public class fibseries1 {
    public static void main(String[] args) {
		int n=15, a=0,b=1;
		System.out.println(a);
	    System.out.println(b);
		for(int i=2;i<n;i++)
		{   
	    int c;
	    c=a+b;               // 1st loop (c=(a)0+(b)1=(c)=1 value of c is printed in 3rd line); 
		System.out.println(c);
			
	    a=b; // a=0 + b=1 so a=1  
	   b=c; // b=1 + c=1 so b=2 ;
	                                 //1stloop( c=a+b, c=0+1=1 value of c is printed in 3rd line)
			                         //2ndloop( c=a+b, c=1+1=2 value of c is printed in 4th line)
	                                 //3rdloop( c=a+b, c=1+2=3 value of c is printed in 5th line)
	                                 //4thloop( c=a+b, c=2+3=5 value of c is printed in 4th line)  
		
    
		}	
    }	
}
