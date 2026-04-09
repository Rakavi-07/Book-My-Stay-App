import java.util.*;

public class UseCase20EmptySearchValidation {

    public static void main(String[] args) {

        System.out.println("Empty Train Search Validation\n");

        // Empty bogie list
        List<String> bogieList = new ArrayList<>();

        try {
            searchBogie(bogieList, "B101");

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }

    public static void searchBogie(List<String> bogies, String key) {

        // 🔥 Fail-fast validation
        if (bogies.isEmpty()) {
            throw new IllegalStateException("No bogies available in the train.");
        }

        // Normal search (won’t execute if empty)
        for (String id : bogies) {
            if (id.equals(key)) {
                System.out.println("Bogie found: " + key);
                return;
            }
        }

        System.out.println("Bogie not found.");
    }
}