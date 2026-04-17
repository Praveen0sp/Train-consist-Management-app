class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}
class PassengerBogie {
    private String id;
    private String type;
    private int capacity;
    public PassengerBogie(String id, String type, int capacity) 
            throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException(
                "Capacity must be greater than zero"
            );
        }

        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "[" + id + " - " + type + " - " + capacity + "]";
    }
}
import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            bogies.add(new PassengerBogie("P1", "Sleeper", 72));
            bogies.add(new PassengerBogie("P2", "AC Chair", 60));
            bogies.add(new PassengerBogie("P3", "First Class", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}
