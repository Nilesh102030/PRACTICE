package Encapsulation;

public class A {
   private int Rollno=21;	
   private String Name=("Nilesh");
   private char Batch='A';
   public int getRollno()
   { 
	   return Rollno;
   }
   public String getName()
   { 
	   return Name;
   }
   public char getbatch()
   {
          return Batch;
   }
   public void setRollno(int newRollno)
   {
	   
     System.out.println(newRollno);
   }
   public void  setName(String NewName)
   {
     System.out.println( NewName);
   }
   public void getbatch(char getBatch)
   {
      System.out.println(getBatch);
   }
}
