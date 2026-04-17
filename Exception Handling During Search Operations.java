class SearchUtil {
    public static boolean searchBogie(String[] bogieIds, String key) {

        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train for searching");
        }
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}
import java.util.*;

public class TrainConsistApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] bogieIds = {};
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();
        try {
            boolean found = SearchUtil.searchBogie(bogieIds, key);

            if (found) {
                System.out.println("Bogie ID FOUND ✅");
            } else {
                System.out.println("Bogie ID NOT FOUND ❌");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
