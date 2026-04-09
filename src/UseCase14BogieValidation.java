public class UseCase14BogieValidation {

    public static void main(String[] args) {

        System.out.println("Bogie Capacity Validation\n");

        try {
            // valid bogie
            PassengerBogie b1 = new PassengerBogie(50);
            System.out.println("Bogie created with capacity: " + b1.getCapacity());

            // invalid bogie
            PassengerBogie b2 = new PassengerBogie(0);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}