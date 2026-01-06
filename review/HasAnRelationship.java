package com.review;

public class HasAnRelationship {

	public static void main(String[] args) {
		  Car obj =new Car();
	        obj.carDetails();
	}
}

class Engine{
    static String name="v8Engine";
    String model="superTurbo";
    float milage=23.87f;
}

class Car extends Engine{
    int modelYear=1997;
    String name="mustang";
    Engine engine=new Engine();
    String engineType=Engine.name;
    
    
    public void carDetails(){
        System.out.println("modelYear: "+modelYear+", engineType: "+engineType);
    }
}
