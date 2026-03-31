import java.util.*;

public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        System.out.println("Add-On Service Selection");

        // Reservation ID (from UC6)
        String reservationId = "Single-1";

        // Create services
        Service breakfast = new Service("Breakfast", 500);
        Service wifi = new Service("WiFi", 300);
        Service spa = new Service("Spa", 700);

        // Map: Reservation → List of Services
        Map<String, List<Service>> serviceMap = new HashMap<>();

        // Add services to list
        List<Service> selectedServices = new ArrayList<>();
        selectedServices.add(breakfast);
        selectedServices.add(spa);   // choose any services

        // Map them to reservation
        serviceMap.put(reservationId, selectedServices);

        // Calculate total cost
        double totalCost = 0;

        for (Service s : serviceMap.get(reservationId)) {
            totalCost += s.getCost();
        }

        // Output
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}