public class ReservationValidator {

    public void validate(String guestName, String roomType, RoomInventory inventory)
            throws InvalidBookingException {

        // check name
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty.");
        }

        // normalize input (VERY IMPORTANT FIX)
        roomType = roomType.toLowerCase();

        if (!roomType.equals("single") &&
            !roomType.equals("double") &&
            !roomType.equals("suite")) {

            throw new InvalidBookingException("Invalid room type selected.");
        }

        // check availability
        String formattedType =
                roomType.substring(0,1).toUpperCase() + roomType.substring(1);

        if (inventory.getAvailability(formattedType) <= 0) {
            throw new InvalidBookingException("No rooms available.");
        }
    }
}