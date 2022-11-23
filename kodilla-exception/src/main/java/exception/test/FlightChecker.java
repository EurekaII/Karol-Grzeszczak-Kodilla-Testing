package exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightChecker {
    private Map<String, Boolean> flights = new HashMap<>();

    public void findFlight(Flight flight) throws RouteNotFoundException {
        flights.put("Warsaw", true);
        flights.put("Barcelona", true);
        flights.put("Madrid", true);
        flights.put("London", true);
        flights.put("Berlin", true);
        flights.put("Paris", true);

        if(!flights.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Flight not found: " + flight.getArrivalAirport());
        } else {
            flights.get(flight.getArrivalAirport());
            System.out.println("Flight was available");
        }

    }

}
