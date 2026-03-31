package com.futurelogistics;

public class BrickTransport extends GoodTransport {

	float brickSize;
	int brickQuantity;
	float brickPrice;

	public BrickTransport(String transportId, String transportDate, int transportRating,
	                      float brickSize, int brickQuantity, float brickPrice) {
		super(transportId, transportDate, transportRating);
		this.brickSize = brickSize;
		this.brickQuantity = brickQuantity;
		this.brickPrice = brickPrice;
	}

	public String vehicleSelection() {
		if (brickQuantity < 300) {
			return "Truck";
		} else if (brickQuantity >= 300 && brickQuantity < 500) {
			return "Lorry";
		} else {
			return "MonsterLorry";
		}
	}

	public float calculateTotalCharge() {

		float totalPrice = brickQuantity * brickPrice;
		float tax = totalPrice * 0.30f;

		// Vehicle price
		String vehicle = vehicleSelection();
		float vehiclePrice;

		if (vehicle.equals("Truck")) {
			vehiclePrice = 1000;
		} else if (vehicle.equals("Lorry")) {
			vehiclePrice = 1700;
		} else {
			vehiclePrice = 3000;
		}

		// Discount based on rating
		float discount = 0;
		int rating = super.transportRating;

		if (rating == 5) {
			discount = totalPrice * 0.20f;
		} else if (rating >= 3 && rating <= 4) {
			discount = totalPrice * 0.10f;
		}

		return (totalPrice + tax + vehiclePrice) - discount;
	}
}
