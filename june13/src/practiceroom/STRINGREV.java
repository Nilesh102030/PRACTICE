package practiceroom;

public class STRINGREV {
public static void main(String[] args) {
	String Name ="JAVA";
	String Rev="";
	
  for (int i=Name.length()-1;i>=0;i--)  {
	Rev=Rev+Name.charAt(i);}
	System.out.println(Rev);
	
	
}
	
}
