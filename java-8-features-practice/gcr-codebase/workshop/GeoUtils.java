package smartcitytransportservicemanagementsystem;

import java.util.*;

public interface GeoUtils {

	static double calculateDistance(String currentLocation, String destination) {
		HashMap<String, int[]> map = Location.getLocations();
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		for (String location : map.keySet()) {
			if (currentLocation.equals(location)) {
				int[] arr = map.get(currentLocation);
				x1 = arr[0];
				y1 = arr[1];
			}
			if (location.equals(destination)) {
				int[] temp = map.get(destination);
				x2 = temp[0];
				y2 = temp[1];
			}
		}

		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
}
