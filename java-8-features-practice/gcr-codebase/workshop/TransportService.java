package smartcitytransportservicemanagementsystem;

import java.util.Optional;

public interface TransportService {

  double farePerKm();
  String getSource();
  default void printServiceDetails() {
    System.out.println("fare per km:" + farePerKm()+ ", current location of service: "+getSource());
  }
  
}
