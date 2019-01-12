import java.util.ArrayList;

public class Plane {
    private ArrayList <Passenger>passengers;
    private String airline;
    private PlaneType type;

    public Plane(String airline, PlaneType type) {
        this.airline = airline;
        this.type = type;
        this.passengers = new ArrayList<>();
    }

    public String getAirline() {
        return airline;
    }

    public PlaneType getType() {
        return type;
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public int getCapacity() {
        return this.type.getCapacity();
    }
}
