package smartcitytransportservicemanagementsystem;

import java.util.*;
import java.util.stream.Collectors;

public class SmartCityTransportAndServiceManagementSystem {
	public static void main(String[] args) {
		List<PassengerData> passengers = Arrays.asList(
				new PassengerData("Dileep Mishra", "Mathura"),
				new PassengerData("John Doe", "Agra"),
				new PassengerData("Jane Smith", "Varanasi"),
				new PassengerData("Alice Johnson", "Lucknow"));

		List<TransportService> allServices = new ArrayList<>();
		TaxiService taxiService1 = new TaxiService(5.3, "Mathura", "Delhi", 12);
		TaxiService taxiService2 = new TaxiService(7.8, "Hathras", "Mathura", 16);
		BusService busService1 = new BusService(11.8, "Varanasi", "Mathura", 23);
		BusService busService2 = new BusService(14.0, "Agra", "Varanasi", 18);
		MetroService metroService1 = new MetroService(8.5, "Delhi", "Agra", 10);
		AmbulanceService ambulance = new AmbulanceService(0.0, "Mathura", "Hospital", 5);

		allServices.add(taxiService1);
		allServices.add(taxiService2);
		allServices.add(busService1);
		allServices.add(busService2);
		allServices.add(metroService1);
		allServices.add(ambulance);

		FareCalculator fareCalculator = (pricePerKm, distance) ->
		{
			return pricePerKm * distance;
		};

		// Example: Calculate fare for a trip
		String from = "Mathura";
		String to = "Delhi";
		double distance = GeoUtils.calculateDistance(from, to);
		double fare = fareCalculator.calculateFare(taxiService1.farePerKm(), distance);
		System.out.println("Fare from " + from + " to " + to + ": " + fare);

		String passengerLocation = "Mathura";
		List<TransportService> availableServices = allServices.stream()
				.filter(s -> s.getSource().equals(passengerLocation))
				.collect(Collectors.toList());

		System.out.println("\nAvailable services from " + passengerLocation + ":");
		availableServices.forEach(TransportService::printServiceDetails);

		List<TransportService> sortedByFare = availableServices.stream()
				.sorted((s1, s2) -> Double.compare(s1.farePerKm(), s2.farePerKm()))
				.collect(Collectors.toList());

		System.out.println("\nServices sorted by lowest fare:");
		sortedByFare.forEach(TransportService::printServiceDetails);

		System.out.println("\nLive Dashboard - All Services:");
		allServices.forEach(TransportService::printServiceDetails);

		// Handle emergency services
		System.out.println("\nEmergency Services:");
		allServices.stream()
				.filter(s -> s instanceof EmergencyService)
				.forEach(s -> {
					s.printServiceDetails();
					if (s instanceof AmbulanceService) {
						((AmbulanceService) s).bypassTraffic();
					}
				});

	}
}
