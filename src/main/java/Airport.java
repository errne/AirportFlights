import java.util.ArrayList;

public class Airport {
    private String airportCode;
    private ArrayList<Hangar>hangars;

    public Airport(String code){
        this.airportCode = code;
        this.hangars = new ArrayList<>();
    }

    public String getAirportCode() {
        return this.airportCode;
    }

    public int getHangarCount(){
        return this.hangars.size();
    }

    public void addHangar(Hangar newHangar) {
        this.hangars.add(newHangar);
    }

    public Flight createFlight(Hangar hangar, Destination destination, int numberOfPassengers){
        int index = hangars.indexOf(hangar);
        Plane plane = hangars.get(index).getPlaneBySize(numberOfPassengers);
        String flightNumber = generateFlightNumber(plane.getAirline());
        Flight newFlight = new Flight(plane, flightNumber, destination);
        hangar.removePlane(plane);
        return newFlight;
    }

    public String generateFlightNumber(String airline){
        String firstChars = airline.substring(0,3).toUpperCase();
        return firstChars + "2886";
    }
}
