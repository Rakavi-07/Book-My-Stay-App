import java.util.Scanner;

public class UseCase19BinarySearch {

    public static void main(String[] args) {

        System.out.println("Binary Search for Bogie ID\n");

        // sorted bogie IDs (IMPORTANT)
        String[] bogieIds = {
                "A101", "B205", "C309", "D410", "E512"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = scanner.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                System.out.println("Bogie found at position: " + mid);
                found = true;
                break;
            } else if (result < 0) {
                high = mid - 1; // go left
            } else {
                low = mid + 1;  // go right
            }
        }

        if (!found) {
            System.out.println("Bogie ID not found.");
        }

        scanner.close();
    }
}