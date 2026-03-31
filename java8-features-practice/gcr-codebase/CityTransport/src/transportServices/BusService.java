package transportServices;
import java.time.LocalTime;

import interfaces.TransportService;

package SmartCityTransport.services;

import SmartCityTransport.core.TransportService;
import SmartCityTransport.models.Schedule;

import java.util.List;
import java.util.Arrays;


public class BusService implements TransportService {
    private String serviceId;
    private String serviceName;
    private String route;
    private double fare;
    private int capacity;
    private boolean available;
    private List<Schedule> schedules;
    
    public BusService(String serviceId, String serviceName, String route, double fare, int capacity, boolean available) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.route = route;
        this.fare = fare;
        this.capacity = capacity;
        this.available = available;
        this.schedules = Arrays.asList(
            new Schedule(serviceId + "-S1", "06:00", "07:30", "Weekday", true),
            new Schedule(serviceId + "-S2", "09:00", "10:30", "Weekday", false),
            new Schedule(serviceId + "-S3", "17:00", "18:30", "Weekday", true)
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
        return "Bus schedules: " + schedules.size() + " trips per day";
    }
    
    public List<Schedule> getSchedules() { return schedules; }
    
    // Override default method to provide bus-specific details
    @Override
    public void printServiceDetails() {
        System.out.println("=== BUS SERVICE ===");
        TransportService.super.printServiceDetails();
        System.out.println("Type: City Bus");
        System.out.println("Total Schedules: " + schedules.size());
        System.out.println("===================");
    }
}
