public class Flight {
    private Plane plane;
    private String flightNumber;
    private Destination destination;

    public Flight(Plane plane, String flightNumber, Destination destination) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Destination getDestination() {
        return destination;
    }

    public String getAirportCode(){
        return destination.getAirportCode();
    }
}
