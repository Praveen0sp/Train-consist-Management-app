import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {
        String[] bogieNames = {
            "Sleeper",
            "AC Chair",
            "First Class",
            "General",
            "Luxury"
        };
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));
        Arrays.sort(bogieNames);
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}
