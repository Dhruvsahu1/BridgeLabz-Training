package SmartCityTransport.services;

import SmartCityTransport.core.TransportService;
import SmartCityTransport.models.Schedule;

import java.util.List;
import java.util.Arrays;

/**
 * Metro Service implementation.
 * Demonstrates Implementing Interfaces (Java 8 Feature #8)
 */
public class MetroService implements TransportService {
    private String serviceId;
    private String serviceName;
    private String route;
    private double fare;
    private int capacity;
    private boolean available;
    private List<Schedule> schedules;
    
    public MetroService(String serviceId, String serviceName, String route, double fare, int capacity, boolean available) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.route = route;
        this.fare = fare;
        this.capacity = capacity;
        this.available = available;
        this.schedules = Arrays.asList(
            new Schedule(serviceId + "-S1", "05:30", "23:30", "Daily", true),
            new Schedule(serviceId + "-S2", "06:00", "00:00", "Weekend", false)
        );
    }
    
    @Override
    public String getServiceId() { return serviceId; }
    
    @Override
    public String getServiceName() { return serviceName; }
    
    @Override
    public String getRoute() { return route; }
    
    @Override
    public double getFare() { return fare; }
    
    @Override
    public int getCapacity() { return capacity; }
    
    @Override
    public boolean isAvailable() { return available; }
    
    @Override
    public String getScheduleInfo() {
        return "Metro operates every 10 minutes during peak hours";
    }
    
    public List<Schedule> getSchedules() { return schedules; }
    
    // Override default method to provide metro-specific details
    @Override
    public void printServiceDetails() {
        System.out.println("=== METRO SERVICE ===");
        TransportService.super.printServiceDetails();
        System.out.println("Type: Rapid Transit");
        System.out.println("Frequency: Every 10 minutes (peak), 15 minutes (off-peak)");
        System.out.println("===================");
    }
}
