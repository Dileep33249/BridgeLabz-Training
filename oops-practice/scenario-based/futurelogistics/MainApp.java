package com.futurelogistics;


public class MainApp {

	public static void main(String[] args) {

		Utility utility = new Utility();

		String brickData =
				"BrickTransport,RTS123A,12-01-2026,4,10.5,450,50";

		String timberData =
				"TimberTransport,RTS456B,15-01-2026,5,20,2.5,Premium,1500";

		GoodTransport brickTransport = utility.createGoodsTransport(brickData);
		GoodTransport timberTransport = utility.createGoodsTransport(timberData);

		if (brickTransport != null) {
			System.out.println("Object Type : " + utility.findObjectType(brickTransport));
		 	System.out.println("Vehicle     : " + brickTransport.vehicleSelection());
			System.out.println("Total Charge: " + brickTransport.calculateTotalCharge());
			System.out.println();
		}

		if (timberTransport != null) {
			System.out.println("Object Type : " + utility.findObjectType(timberTransport));
			System.out.println("Vehicle     : " + timberTransport.vehicleSelection());
			System.out.println("Total Charge: " + timberTransport.calculateTotalCharge());
		}
	}
}
