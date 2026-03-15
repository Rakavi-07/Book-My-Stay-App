public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("Hotel Room Inventory Status\n");

        // Room objects
        Room single = new SingleRoom();
        Room dbl = new DoubleRoom();
        Room suite = new SuiteRoom();

        // inventory object
        RoomInventory inventory = new RoomInventory();

        System.out.println("Single Room:");
        single.displayDetails();
        System.out.println("Available Rooms: " + inventory.getAvailability("Single Room"));
        System.out.println();

        System.out.println("Double Room:");
        dbl.displayDetails();
        System.out.println("Available Rooms: " + inventory.getAvailability("Double Room"));
        System.out.println();

        System.out.println("Suite Room:");
        suite.displayDetails();
        System.out.println("Available Rooms: " + inventory.getAvailability("Suite Room"));
    }
}