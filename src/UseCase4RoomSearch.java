public class UseCase4RoomSearch {

    public static void main(String[] args) {

        System.out.println("Room Search\n");

        // room objects
        Room single = new SingleRoom();
        Room dbl = new DoubleRoom();
        Room suite = new SuiteRoom();

        // inventory object
        RoomInventory inventory = new RoomInventory();

        // Single room search
        int singleAvailable = inventory.getAvailability("Single Room");
        if (singleAvailable > 0) {
            System.out.println("Single Room:");
            single.displayDetails();
            System.out.println("Available: " + singleAvailable);
            System.out.println();
        }

        // Double room search
        int doubleAvailable = inventory.getAvailability("Double Room");
        if (doubleAvailable > 0) {
            System.out.println("Double Room:");
            dbl.displayDetails();
            System.out.println("Available: " + doubleAvailable);
            System.out.println();
        }

        // Suite room search
        int suiteAvailable = inventory.getAvailability("Suite Room");
        if (suiteAvailable > 0) {
            System.out.println("Suite Room:");
            suite.displayDetails();
            System.out.println("Available: " + suiteAvailable);
        }
    }
}