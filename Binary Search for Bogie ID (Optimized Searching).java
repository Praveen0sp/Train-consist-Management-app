import java.util.*;

public class TrainConsistApp {
    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = key.compareTo(bogieIds[mid]);
            if (result == 0) {
                return true; 
            } else if (result < 0) {
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        String[] bogieIds = {
            "BG309", "BG101", "BG550", "BG205", "BG412"
        };
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();
        boolean found = binarySearch(bogieIds, key);
        if (found) {
            System.out.println("Bogie ID FOUND ✅");
        } else {
            System.out.println("Bogie ID NOT FOUND ❌");
        }

        sc.close();
    }
}
