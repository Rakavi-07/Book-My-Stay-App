import java.util.*;

public class ConcurrentBookingProcessor {

    private Map<String, Integer> inventory;
    private Map<String, Set<String>> allocatedRooms;

    public ConcurrentBookingProcessor() {
        inventory = new HashMap<>();
        inventory.put("Single", 5);
        inventory.put("Double", 3);
        inventory.put("Suite", 2);

        allocatedRooms = new HashMap<>();
        allocatedRooms.put("Single", new HashSet<>());
        allocatedRooms.put("Double", new HashSet<>());
        allocatedRooms.put("Suite", new HashSet<>());
    }

    public synchronized void processBooking(Reservation request) {

        String type = request.getRoomType();
        String guest = request.getGuestName();

        int available = inventory.get(type);

        if (available > 0) {

            int num = allocatedRooms.get(type).size() + 1;
            String roomId = type + "-" + num;

            allocatedRooms.get(type).add(roomId);
            inventory.put(type, available - 1);

            System.out.println("Booking confirmed for Guest: "
                    + guest + ", Room ID: " + roomId);
        }
    }

    public void printInventory() {
        System.out.println("\nRemaining Inventory:");
        for (String t : inventory.keySet()) {
            System.out.println(t + ": " + inventory.get(t));
        }
    }
}