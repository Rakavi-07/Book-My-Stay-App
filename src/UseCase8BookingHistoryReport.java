import java.util.*;

public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {

        System.out.println("Booking History and Reporting\n");

        System.out.println("Booking History Report");

        // Booking history (List → preserves order)
        List<Reservation> bookingHistory = new ArrayList<>();

        // Add confirmed bookings (simulate UC6 output)
        bookingHistory.add(new Reservation("Abhi", "Single"));
        bookingHistory.add(new Reservation("Subha", "Double"));
        bookingHistory.add(new Reservation("Vanmathi", "Suite"));

        // Generate report
        for (Reservation r : bookingHistory) {
            System.out.println("Guest: " 
                    + r.getGuestName() 
                    + ", Room Type: " 
                    + r.getRoomType());
        }
    }
}