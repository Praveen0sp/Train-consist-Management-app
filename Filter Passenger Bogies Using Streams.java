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
import java.util.stream.Collectors;

public class TrainConsistUC8 {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury", 80));
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        System.out.println("Filtered Bogies (Capacity > 60):");
        filtered.forEach(System.out::println);
    }
}
