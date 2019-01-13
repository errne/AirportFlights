import java.util.ArrayList;

public class Flight {
    private Plane plane;
    private String flightNumber;
    private Destination destination;
    private ArrayList<Passenger>bookings;

    public Flight(Plane plane, String flightNumber, Destination destination) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.bookings = new ArrayList<>();
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

    public void addPassenger(Passenger passenger){
        if (!isFullyBooked()){
            bookings.add(passenger);
        }
    }

    public Boolean isFullyBooked(){
        if (this.plane.getCapacity() <= this.bookings.size()){
            return true;
        }
        return false;
    }

    public int getBookingCount() {
        return this.bookings.size();
    }
}
