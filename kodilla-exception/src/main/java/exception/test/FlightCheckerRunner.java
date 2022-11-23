package exception.test;

public class FlightCheckerRunner {

    public static void main(String[] args) {
        Flight warsawToMadrid = new Flight("Warsaw", "Madrid");
        Flight warsawToNeapol = new Flight("Warsaw", "Neapol");
        Flight londonToBarcelona = new Flight("London", "Barcelona");
        FlightChecker flightChecker = new FlightChecker();

        try {
            flightChecker.findFlight(warsawToNeapol);
        } catch (RouteNotFoundException e) {
            System.out.println("Failed to find");
        }
    }
}
