package SmartCityTransport.services;

import SmartCityTransport.core.TransportService;
import SmartCityTransport.models.Schedule;

import java.util.List;
import java.util.Arrays;

/**
 * Taxi Service implementation.
 * Demonstrates Implementing Interfaces (Java 8 Feature #8)
 */
public class TaxiService implements TransportService {
    private String serviceId;
    private String serviceName;
    private String route;
    private double baseFare;
    private int capacity;
    private boolean available;
    private List<Schedule> schedules;
    
    public TaxiService(String serviceId, String serviceName, String route, double baseFare, int capacity, boolean available) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.route = route;
        this.baseFare = baseFare;
        this.capacity = capacity;
        this.available = available;
        this.schedules = Arrays.asList(
            new Schedule(serviceId + "-S1", "00:00", "23:59", "Daily", true)
        );
    }
    
    @Override
    public String getServiceId() { return serviceId; }
    
    @Override
    public String getServiceName() { return serviceName; }
    
    @Override
    public String getRoute() { return route; }
    
    @Override
    public double getFare() { return baseFare; }
    
    @Override
    public int getCapacity() { return capacity; }
    
    @Override
    public boolean isAvailable() { return available; }
    
    @Override
    public String getScheduleInfo() {
        return "Taxi available 24/7 on-demand";
    }
    
    public List<Schedule> getSchedules() { return schedules; }
    
    // Override default method to provide taxi-specific details
    @Override
    public void printServiceDetails() {
        System.out.println("=== TAXI SERVICE ===");
        TransportService.super.printServiceDetails();
        System.out.println("Type: On-demand Taxi");
        System.out.println("Base Fare: $" + baseFare);
        System.out.println("===================");
    }
}
