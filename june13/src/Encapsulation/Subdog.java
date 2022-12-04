package Encapsulation;

public class Subdog extends Dog{
  public static void main(String[] args) {
	Dog x=new Dog();
  //	System.out.println(x.setAge(0));   // age is private thats why error
      	x.setAge(15);
        System.out.println(x.getAge());
        x.setBreed("vodafone");
        System.out.println(x.getBreed());
      
  
  
  
  }
}
