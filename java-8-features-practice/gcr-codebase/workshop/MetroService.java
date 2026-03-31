package smartcitytransportservicemanagementsystem;
public class MetroService implements TransportService{
    double pricePerKm;
     String currentLocation;
     String destination;
     int departureTime;

    public void SetDepatureTime(int minutes){
        departureTime=minutes;
    }
   public  double farePerKm(){
        return pricePerKm;
    };

   public String currentLocation(){
        return currentLocation;
    }

    public String getSource(){
        return currentLocation;
    }
     
     MetroService(double pricePerKm, String currentLocation, String destination,int time){
    	 this.pricePerKm=pricePerKm;
    	 this.currentLocation=currentLocation;
    	 this.destination=destination;
         this.departureTime=time;
     }
}
