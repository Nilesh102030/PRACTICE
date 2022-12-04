package STRING;

public class spacecount {
public static void main(String[] args) {
	String a="Velocity is the best"; // to count spaces in string
    int count=0;   
	for(int i=0;i<=a.length()-1;i++) {   
		char b=a.charAt(i);  // to check by index no for char b=v so v==' ' it will not count
	if(b==' ')
	count++; // it will store spaces count 
	}
	System.out.println(count);
	
	
}
}