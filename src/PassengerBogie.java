public class PassengerBogie {

    private int capacity;

    // constructor with validation
    public PassengerBogie(int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Invalid bogie capacity. Must be greater than 0.");
        }

        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}