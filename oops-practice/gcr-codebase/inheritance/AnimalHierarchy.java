package com.inhertence;
class Animal{
	String name;
	int age;
	
	Animal(String name , int age){
		this.name=name;
		this.age=age;
	}
	
	void makeSound() {
		System.out.println("Sound of the animal");
	}
}
class Bird extends Animal{
	Bird(String name, int age){
		super(name,age);
	}
	void makeSound() {
		System.out.println("Sound of the bird");
	}
}
class Dog extends Animal{
	Dog(String name, int age){
		super(name,age);
	}
	void makeSound() {
		System.out.println("Sound of the Dog");
	}
	
}
class Cat extends Animal{
	Cat(String name, int age){
		super(name,age);
	}
	void makeSound() {
		System.out.println("Sound of the Cat");
	}
	
}

public class AnimalHierarchy {
    public static void main(String [] args) {
    	
    	Animal obj1=new Dog("hi guys we are here" , 25);
    	Animal obj2=new Bird("udu me",8);
    	Animal obj3=new Cat("chal nikal" ,9);
    	
    	obj1.makeSound();
    	obj2.makeSound();
    	obj3.makeSound();
    }
}
