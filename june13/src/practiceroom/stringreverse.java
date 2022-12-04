package practiceroom;

public class stringreverse {
   public static void main(String[] args)  {
	
	    String name= "nilesh";
	    String rev="";
	   
	   for(int i=name.length()-1;i>=0;i--) {
	   rev=rev+name.charAt(i);}
	   System.out.println(rev);
	   
	
	   String word="hembade";
	   String reverse="";
	
	   for (int i=word.length()-1;i>=0;i--) {
	   reverse=reverse+word.charAt(i);}
	   System.out.println(reverse);
    	
	
	
   }}
