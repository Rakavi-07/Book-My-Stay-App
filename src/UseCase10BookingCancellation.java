import java.util.*;

public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("Booking Cancellation");

        // Inventory
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 5);
        inventory.put("Double", 3);
        inventory.put("Suite", 2);

        // Allocated rooms (from UC6 simulation)
        HashMap<String, Set<String>> allocatedRooms = new HashMap<>();
        allocatedRooms.put("Single", new HashSet<>());
        allocatedRooms.put("Double", new HashSet<>());
        allocatedRooms.put("Suite", new HashSet<>());

        // simulate allocated room
        allocatedRooms.get("Single").add("Single-1");

        // Stack for rollback (LIFO)
        Stack<String> rollbackStack = new Stack<>();

        // ---- Cancellation Logic ----
        String roomType = "Single";
        String roomId = "Single-1";

        // validate existence
        if (allocatedRooms.get(roomType).contains(roomId)) {

            // remove from allocated set
            allocatedRooms.get(roomType).remove(roomId);

            // push to rollback history
            rollbackStack.push(roomId);

            // restore inventory
            inventory.put(roomType, inventory.get(roomType) + 1);

            System.out.println("Booking cancelled successfully. Inventory restored for room type: " + roomType);

        } else {
            System.out.println("Cancellation failed: Reservation not found.");
        }

        // ---- Display rollback history ----
        System.out.println("\nRollback History (Most Recent First):");

        while (!rollbackStack.isEmpty()) {
            System.out.println("Released Reservation ID: " + rollbackStack.pop());
        }

        // ---- Show updated inventory ----
        System.out.println("\nUpdated Single Room Availability: " + inventory.get("Single"));
    }
}