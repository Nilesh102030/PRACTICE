package Encapsulation;

public class Dog {

	 public String colour;
	 private String name;	                        
	 private String breed;
	 private int age;
	
	
	public String getColour() { // if wedmethod by private keyword then we cantaccess it in subclass
		return colour;
	}

	public void setColour(String colour) {  
		this.colour = colour; 
	}


   public String getName() {
		return name;   
	}

	public void setName(String name) {
		this.name = name;   // we giving value to the name from the main method and stored it in string variable
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	 public void wagtail() {
	       System.out.println("Dog wag their tails");
	                        }
	  
	  public void barking() {
	       System.out.println("Dog barks");
	                        }
	  
	  public void eating() {
	       System.out.println("Dog eats");
	                        }

	  
	  
	  
	  
	  
	  
	  
	  
}
