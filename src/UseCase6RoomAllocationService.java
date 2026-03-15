import java.util.*;

public class UseCase6RoomAllocationService {

    public static void main(String[] args) {

        System.out.println("Room Allocation Processing");

        // Booking request queue (FIFO)
        Queue<Reservation> bookingQueue = new LinkedList<>();

        bookingQueue.add(new Reservation("Abhi", "Single"));
        bookingQueue.add(new Reservation("Subha", "Single"));
        bookingQueue.add(new Reservation("Vanmathi", "Suite"));

        // Inventory (reuse UC3 concept)
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 5);
        inventory.put("Double", 3);
        inventory.put("Suite", 2);

        // Track allocated rooms (prevents duplicates)
        HashMap<String, Set<String>> allocatedRooms = new HashMap<>();

        allocatedRooms.put("Single", new HashSet<>());
        allocatedRooms.put("Double", new HashSet<>());
        allocatedRooms.put("Suite", new HashSet<>());

        // Process queue
        while (!bookingQueue.isEmpty()) {

            Reservation request = bookingQueue.poll();
            String roomType = request.getRoomType();
            String guest = request.getGuestName();

            int available = inventory.get(roomType);

            if (available > 0) {

                int roomNumber = allocatedRooms.get(roomType).size() + 1;
                String roomId = roomType + "-" + roomNumber;

                // store allocated room
                allocatedRooms.get(roomType).add(roomId);

                // update inventory
                inventory.put(roomType, available - 1);

                System.out.println(
                        "Booking confirmed for Guest: "
                                + guest
                                + ", Room ID: "
                                + roomId
                );
            }
        }
    }
}