package CASTING;

public class EXPLICITCASTING {  // explicit is higher to lower casting
   public static void main(String[] args) {
	double a=143.89;        // double size is 8 byte lower datatype
	System.out.println(a);
	   
	int b=(int)a;           // int size is 4 byte lower datatype  // -128 to +127
	System.out.println(b);
	   
	byte c=(byte)b;   
    System.out.println(c);   // Byte size is 1 byte lower datatype
   }
	                         // int range is -128 to +127 so 143-127=16 loss of data is 16
  

}
