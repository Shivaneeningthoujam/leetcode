package leetcode;

import java.util.HashMap;

/*We will be given tickets and we gotta find the serial of 
 * travelling the places in efficient way
 */
public class itinerary {
    public static String getStart(HashMap<String, String> tick) {
        // First make a reverse hash map.
        // Find a key in map1 which is not in the key set of reversed map
        HashMap<String, String> revMap = new HashMap<>();
        for (String key : tick.keySet()) {
            revMap.put(tick.get(key), key);
            // creating reverse
            // putting value as key and key as value
        }
        for (String key : tick.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa ", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while (tickets.containsKey(start)) {
            System.out.println(start + "-->");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}