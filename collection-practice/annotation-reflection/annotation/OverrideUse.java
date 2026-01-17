package annotation;
class Animal{
	public void makeSound() {
		System.out.print("sound of animal parent class");
		}
}

class Dog extends Animal{
  @Override
  public void makeSound() {
	  System.out.print("sound of the dog");
  }
}
public class OverrideUse {
       
	public static void main(String [] args) {
		
		Animal ref=new Dog();
		ref.makeSound();
	}
}
