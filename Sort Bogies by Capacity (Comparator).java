class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " → " + capacity;
    }
}
import java.util.*;

public class TrainConsistUC7 {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.sort(Comparator.comparingInt(b -> b.capacity));
        System.out.println("Bogies Sorted by Capacity:");

        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}
