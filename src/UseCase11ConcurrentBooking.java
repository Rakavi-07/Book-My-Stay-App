public class UseCase11ConcurrentBooking {

    public static void main(String[] args) {

        System.out.println("Concurrent Booking Simulation");

        ConcurrentBookingProcessor processor = new ConcurrentBookingProcessor();

        // create requests
        Reservation r1 = new Reservation("Abhi", "Single");
        Reservation r2 = new Reservation("Vanmathi", "Double");
        Reservation r3 = new Reservation("Kural", "Suite");
        Reservation r4 = new Reservation("Subha", "Single");

        // create threads
        BookingThread t1 = new BookingThread(processor, r1);
        BookingThread t2 = new BookingThread(processor, r2);
        BookingThread t3 = new BookingThread(processor, r3);
        BookingThread t4 = new BookingThread(processor, r4);

        // start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // wait for completion
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        processor.printInventory();
    }
}