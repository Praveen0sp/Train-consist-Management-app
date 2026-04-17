import java.util.*;

public class TrainConsistApp {
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(capacities));
        bubbleSort(capacities);
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(capacities));
    }
}
