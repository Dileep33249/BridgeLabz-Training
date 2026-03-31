package com.futurelogistics;
import java.util.*;
public class Utility {

	public boolean validateTransportId(String transportId) {

		if (transportId == null || !transportId.matches("RTS[0-9]{3}[A-Z]")) {
			System.out.println("Transport Id " + transportId + " is invalid");
			return false;
		}
		return true;
	}

	public GoodTransport createGoodsTransport(String data) {

		String[] values = data.split(",");

		String transportType = values[0];
		String transportId = values[1];
		String transportDate = values[2];
		int transportRating = Integer.parseInt(values[3]);

		if (!validateTransportId(transportId)) {
			return null;
		}

		if (transportType.equalsIgnoreCase("BrickTransport")) {

			float brickSize = Float.parseFloat(values[4]);
			int brickQuantity = Integer.parseInt(values[5]);
			float brickPrice = Float.parseFloat(values[6]);

			return new BrickTransport(
					transportId,
					transportDate,
					transportRating,
					brickSize,
					brickQuantity,
					brickPrice
			);
		}
		
		if (transportType.equalsIgnoreCase("TimberTransport")) {

			float timberLength = Float.parseFloat(values[4]);
			float timberRadius = Float.parseFloat(values[5]);
			String timberType = values[6];
			float timberPrice = Float.parseFloat(values[7]);

			return new TimberTransport(
					transportId,
					transportDate,
					transportRating,
					timberLength,
					timberRadius,
					timberType,
					timberPrice
			);
		}

		return null;
	}
	
	public String findObjectType(GoodTransport goodsTransport) {

		if (goodsTransport instanceof TimberTransport) {
			return "TimberTransport";
		}

		if (goodsTransport instanceof BrickTransport) {
			return "BrickTransport";
		}

		return "UnknownTransport";
	}
}
