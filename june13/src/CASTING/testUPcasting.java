package CASTING;

public class testUPcasting {
  public static void main(String[] args) {
	              System.out.println("super class object");
                   	castingdemo1 x=new castingdemo1();
	                            x.demo();  
	                           x.display(); 
	                            x.show();
	  
	               System.out.println("sub class object"); 
	                 castingdemo2 y=new castingdemo2();
                               y.ball();
                              y.demo();
	                          y.display();
	                           y.show();
	
	               System.out.println("upcasting ");
	                 castingdemo1 z=new castingdemo2(); // ref varaible of superclass n object of subclass
	                            z.demo();
	                            z.display();
	                            z.show();
	                           // z.ball();we cant access self declared method of subclass
 }	                           // due to we have created refrence variable of superclass(castingdemo1 z)
}
