package smartcitytransportservicemanagementsystem;

public class PassengerData {
   String name;
   String destination;
   PassengerData(String name, String location) {
       this.name = name;
       this.destination = location;
   }

    public Object getCurrentLocation() {
       return destination;
    }
}
