package interfacE;

public class staticinterfacemethod implements test{

	public void show () {
    System.out.println("show incomplete method completed");
	}
	public void book()  {
	System.out.println("book incomplete method completed");
	}

        public static void main(String[] args) {
        	staticinterfacemethod x=new staticinterfacemethod(); // object creation impltn class
	        x.book();
            x.show();
        test.Display();  // calling static method of interface with interface NAME(i.e.test)
        }



}
