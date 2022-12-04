package interfacE;

public  class c  implements a,b {  // multiple inheritance achieved by using interface & implem'n

	public void display()  {  // super class a
	System.out.println("display");
}
    public void show()  {  // superclass b
	  System.out.println("show");
    }	
	  public static void main(String[] args) {
		c x=new c();
		x.display();
		x.show(); 
		  
	}
    
    
    
}	