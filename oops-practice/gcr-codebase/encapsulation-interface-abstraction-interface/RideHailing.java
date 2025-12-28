package abstract_polymorphism;
interface Gps{
	abstract void UpdateLocationName(String LocationName);
	abstract String getUpdateCurrentLocation();
}
abstract class Vehicle implements Gps{
	private int vehicleId;
	private String driverName;
	 protected double ratePerKm;
	 
	 private String LocationName;
	 
	 protected void details() {
		 System.out.println("name of the driver: "+driverName+", vehicle id is: "+vehicleId);
	 }
	 
      Vehicle(int vehicleId,String driverName ,double ratePerKm){
    	    this.vehicleId=vehicleId;
    	    this.driverName=driverName;
    	    this.ratePerKm=ratePerKm;
      }
      
      public void UpdateLocationName(String LocationName) {
    	   this.LocationName=LocationName;
      }
      
      public String getUpdateCurrentLocation() {
    	    return LocationName;
      }
      
      public abstract double calculateFare(double km);
      
}
class Car extends Vehicle{

	Car(int vehicleId, String driverName,double ratePerKm) {
		super(vehicleId, driverName, ratePerKm);
		
	}
	
	public double calculateFare(double travelDistance) {
		return ratePerKm * travelDistance;
	}
	
	
}
class Bike extends Vehicle{
     
	
	Bike(int vehicleId, String driverName , double ratePerKm) {
		super(vehicleId, driverName, ratePerKm);
	
	}
	
	public double calculateFare(double travelDistance) {
		return ratePerKm * travelDistance;
	}
	
}
public class RideHailing {
	public static void main(String [] args) {
	Vehicle obj=new Car(12,"dileep", 5.9);
	Vehicle obj2=new Car(17,"siddu",8.7);
	
	System.out.println(obj.calculateFare(40.9));
	obj.details();

}
}
