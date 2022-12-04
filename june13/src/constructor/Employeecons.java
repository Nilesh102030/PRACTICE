package constructor;

public class Employeecons extends personcons {
   int eID;
           Employeecons() {
	              super();   // to call superclass constructor() without parameter
                          }

           Employeecons(String name,int eID) {
	                    super(name); //to call superclass constructor(string name) with parameter
                        this.eID=eID;   
                                      }
   public void dispaly() {
	   System.out.println("Ename:"+name+",eID:"+eID);
                                                       }
   public static void main(String[] args) {
	   Employeecons a=new Employeecons();
	   Employeecons b=new Employeecons("GAURAV",1); 
	   b.dispaly();
	   Employeecons c=new Employeecons("SAKET",2);
	   c.dispaly();
	   Employeecons d=new Employeecons("SWAPNALI",3);
	   d.dispaly();
   
   }
   
   
}