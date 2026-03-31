package com.futurelogistics;

public class TimberTransport extends GoodTransport {

	float timberLength;
	float timberRadius;
	String timberType;
	float timberPrice;

	public TimberTransport(String transportId, String transportDate, int transportRating,
	                       float timberLength, float timberRadius,
	                       String timberType, float timberPrice) {

		super(transportId, transportDate, transportRating);
		this.timberLength = timberLength;
		this.timberRadius = timberRadius;
		this.timberType = timberType;
		this.timberPrice = timberPrice;
	}

	public String vehicleSelection() {

		int area = (int) (2 * 3.147 * timberRadius * timberLength);

		if (area < 250) {
			return "Truck";
		} else if (area >= 250 && area <= 400) {
			return "Lorry";
		} else {
			return "MonsterLorry";
		}
	}

	public float calculateTotalCharge() {

		// Step 1: Volume
		float volume = (float) (3.147 * timberRadius * timberRadius * timberLength);

		// Step 2: Price
		float price;
		if (timberType.equalsIgnoreCase("Premium")) {
			price = volume * timberPrice * 0.25f;
		} else {
			price = volume * timberPrice * 0.15f;
		}

		// Step 3: Tax
		float tax = price * 0.30f;

		// Step 4: Vehicle price
		String vehicle = vehicleSelection();
		float vehiclePrice;

		if (vehicle.equals("Truck")) {
			vehiclePrice = 1000;
		} else if (vehicle.equals("Lorry")) {
			vehiclePrice = 1700;
		} else {
			vehiclePrice = 3000;
		}
		
		float discount = 0;
		int rating = getTransportRating();

		if (rating == 5) {
			discount = price * 0.20f;
		} else if (rating == 3 || rating == 4) {
			discount = price * 0.10f;
		}

		return (price + vehiclePrice + tax) - discount;
	}
}
