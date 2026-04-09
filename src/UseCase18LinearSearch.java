import java.util.Scanner;

public class UseCase18LinearSearch {

    public static void main(String[] args) {

        System.out.println("Linear Search for Bogie ID\n");

        // sample bogie IDs (unsorted)
        String[] bogieIds = {
                "B102", "A205", "C309", "D410", "E512"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = scanner.nextLine();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(key)) {
                found = true;
                System.out.println("Bogie found at position: " + i);
                break; // early termination
            }
        }

        if (!found) {
            System.out.println("Bogie ID not found.");
        }

        scanner.close();
    }
}