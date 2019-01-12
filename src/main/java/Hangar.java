import java.util.ArrayList;

public class Hangar {
    private String name;
    private int capacity;
    private ArrayList<Plane>planes;

    public Hangar(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.planes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPlaneCount(){
        return this.planes.size();
    }

    public void addPlane(Plane newPlane){
        if (!isFull()) {
            this.planes.add(newPlane);
        }
    }

    public Boolean isFull(){
        if (this.capacity <= getPlaneCount()){
            return true;
        }
            return false;
    }

    public void removePlane(Plane plane) {
        if (getPlaneCount() > 0){
            this.planes.remove(plane);
        }
    }

    public Plane getPlaneBySize(int requiredSize){
        Plane fitPlane = null;
        for (Plane plane : planes){
            if (plane.getCapacity() == requiredSize){
                fitPlane = plane;
                break;
            }
        }

        return fitPlane;
    }
}
