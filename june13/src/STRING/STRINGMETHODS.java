package STRING;
public class STRINGMETHODS {
 public static void main(String[] args) {
	 String s1 = "velocity";
	 String s2 = "GELOCITY";
	 String s3 = "CITY";
	 String s4 = "velo";
	   System.out.println(s1.charAt(0));//TO PRINT CHAR AT ANY INDEX NO(0 TO 7),0=v;
	   System.out.println(s2.replace('G', 'V')); // TO REPLACE ANY CHARACHTER
       System.out.println(s2.replace("GELOCITY", "Testing"));
       System.out.println(s2.replace(s2, s3));
       System.out.println(s2.replaceFirst("G", "V"));
       System.out.println(s2.replaceAll( "GELO", "VELO"));//WE CAN CHANGE ALL CHAR
	   System.out.println(s2.isEmpty()); //false it is not empty
	   System.out.println(s2.isBlank());  // not blank
	   System.out.println(s4.concat(s3)); // from last we can add any CONCAT any string veloCITY
	   System.out.println(s2.substring(4,8)); // we can print char by index no to any index no from counting star
	   System.out.println(s2.endsWith(s3)); // to check ending char of any 2 string =true or false
	   System.out.println(s1.startsWith(s4));  // to check any two string starting char are same or not
       System.out.println(s1.indexOf("v"));// to print char by index no =v-0
       System.out.println(s1.lastIndexOf("y")); // to print last index no of char // velycity=last y index no print
       System.out.println(s1.contains(s4));  // to check same char string s1=starsports s2=star =true
       System.out.println(s1.length());  // to print all count char of a string
       System.out.println(s2.equals(s1)); // to compare 2 string having same char or not =false
       String d=String.join(s1,s2,s3);  // to combine different strings
       System.out.println(d);
 }
}          