public class BookingThread extends Thread {

    private ConcurrentBookingProcessor processor;
    private Reservation request;

    public BookingThread(ConcurrentBookingProcessor processor, Reservation request) {
        this.processor = processor;
        this.request = request;
    }

    @Override
    public void run() {
        processor.processBooking(request);
    }
}
