import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UseCase12DataPersistenceRecovery {

    private static final String FILE_NAME = "inventory.dat";

    public static void main(String[] args) {

        System.out.println("System Recovery");

        Map<String, Integer> inventory = loadInventory();

        System.out.println("\nCurrent Inventory:");
        for (String key : inventory.keySet()) {
            System.out.println(key + ": " + inventory.get(key));
        }

        saveInventory(inventory);
    }

    // -------- LOAD (Deserialization) --------
    private static Map<String, Integer> loadInventory() {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            return (Map<String, Integer>) ois.readObject();

        } catch (Exception e) {

            System.out.println("No valid inventory data found. Starting fresh.");

            // default inventory
            Map<String, Integer> inventory = new HashMap<>();
            inventory.put("Single", 5);
            inventory.put("Double", 3);
            inventory.put("Suite", 2);

            return inventory;
        }
    }

    // -------- SAVE (Serialization) --------
    private static void saveInventory(Map<String, Integer> inventory) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(inventory);
            System.out.println("Inventory saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving inventory.");
        }
    }
}