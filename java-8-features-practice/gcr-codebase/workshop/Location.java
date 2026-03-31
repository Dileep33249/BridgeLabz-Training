package smartcitytransportservicemanagementsystem;

import java.util.*;

class Location {

    static HashMap<String, int[]> getLocations() {
        HashMap<String, int[]> map = new HashMap<>();
        map.put("Mathura", new int[]{74, 28});
        map.put("Agra", new int[]{10, 96});
        map.put("Lucknow", new int[]{16, 23});
        map.put("Ajamgarh", new int[]{13, 19});
        map.put("Varanasi", new int[]{12, 72});
        map.put("Kanpur", new int[]{57, 17});
        map.put("Bangalore", new int[]{47, 52});
        map.put("Delhi", new int[]{77, 28});
        return map;
    }
}

