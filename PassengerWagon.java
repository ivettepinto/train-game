import java.util.ArrayList;

public class PassengerWagon extends Wagon {
    private ArrayList<Passenger> passengers;

    public PassengerWagon(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String getWagonType() {
        return "passenger";
    }

    
    
}
