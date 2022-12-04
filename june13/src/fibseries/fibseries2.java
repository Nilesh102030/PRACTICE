package fibseries;

public class fibseries2 {
public static void main(String[] args) {
	                                   int firstTerm=0 ;
	                                   int secondTerm=1;
                  
	                                   for(int i=1; i<=15; i++)  {
	                                      System.out.println(firstTerm);
	            	                      
	            	                   int nextTerm=firstTerm+secondTerm;   
                                           firstTerm=secondTerm;
	                                        secondTerm=nextTerm;

}           
}
}