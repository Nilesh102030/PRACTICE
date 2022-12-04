package STRING;

public class specificharchange {
public static void main(String[] args) {
	 String s2 = "Halve";
	 int index=0;
	 char ch='V';
	
	System.out.println("original string="+s2);
    StringBuilder string =new StringBuilder(s2);// BY USING STRINGBUILDER METHOD WE CAN REPLACE CHAR BY INDEX NO
    string.setCharAt(index, ch);
    System.out.println("modified string="+ string);
	
	
}
}