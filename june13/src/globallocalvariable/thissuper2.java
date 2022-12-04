package globallocalvariable;

public class thissuper2 extends thissuper{
          //  int =100;  global variable of superclass(SUPER.A)
         int a=50;  // global variable from same class(THIS.A)
      
         public void demo () {
         int a=100; // local variable (A)
         System.out.println(a);
         System.out.println(this.a);
          System.out.println(super.a);
        
       }
         public static void main(String[] args) {
			System.out.println("MAIN METHOD STARTED");
		
			thissuper2 x=new thissuper2();
         x.demo();
			
       
         
         }
         
         
         
       }


