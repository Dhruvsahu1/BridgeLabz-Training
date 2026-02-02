package SmartCityTransport;

import SmartCityTransport.core.*;
import SmartCityTransport.models.*;
import SmartCityTransport.services.*;

import java.util.*;
import java.util.stream.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

/**
 * Main System Class demonstrating all Java 8 Features.
 * 
 * Features Demonstrated:
 * 1. Lambda Expressions - Filtering and sorting transport schedules
 * 2. Method References - Quick printing and logging
 * 3. Default Methods in Interfaces - TransportService
 * 4. Static Methods in Interfaces - GeoUtils
 * 5. Stream APIs - Grouping and aggregating data
 * 6. ForEach() Method - Display live schedules
 * 7. Collectors - groupingBy, partitioningBy, summarizingDouble
 * 8. Implementing Interfaces - BusService, MetroService, TaxiService
 * 9. Functional Interfaces - FareCalculator
 * 10. Marker Interfaces - EmergencyService
 */
public class TransportManagementSystem {
    
    private List<TransportService> transportServices;
    private List<Passenger> passengers;
    
    public TransportManagementSystem() {
        this.transportServices = new ArrayList<>();
        this.passengers = new ArrayList<>();
        initializeServices();
        initializePassengers();
    }
    
    private void initializeServices() {
        transportServices.add(new BusService("BUS001", "City Express", "Downtown - Airport", 2.50, 50, true));
        transportServices.add(new BusService("BUS002", "Suburban Connect", "North - South", 3.00, 45, true));
        transportServices.add(new MetroService("MET001", "Blue Line", "Central - Airport", 4.00, 200, true));
        transportServices.add(new MetroService("MET002", "Red Line", "East - West", 4.50, 200, true));
        transportServices.add(new TaxiService("TAX001", "Premium Taxi", "City Wide", 5.00, 4, true));
        transportServices.add(new TaxiService("TAX002", "Economy Taxi", "City Wide", 3.50, 3, true));
    }
    
    private void initializePassengers() {
        passengers.add(new Passenger("P001", "John Doe", "Downtown - Airport", 2.50, "Bus", true));
        passengers.add(new Passenger("P002", "Jane Smith", "Central - Airport", 4.00, "Metro", true));
        passengers.add(new Passenger("P003", "Bob Wilson", "North - South", 3.00, "Bus", false));
        passengers.add(new Passenger("P004", "Alice Brown", "City Wide", 5.00, "Taxi", true));
        passengers.add(new Passenger("P005", "Charlie Davis", "East - West", 4.50, "Metro", true));
        passengers.add(new Passenger("P006", "Eva Martinez", "Downtown - Airport", 2.50, "Bus", false));
        passengers.add(new Passenger("P007", "Frank Lee", "City Wide", 3.50, "Taxi", false));
        passengers.add(new Passenger("P008", "Grace Kim", "Central - Airport", 4.00, "Metro", true));
    }
    
    // ======== 1. LAMBDA EXPRESSIONS - Filtering and Sorting ========
    public void demonstrateLambdaExpressions() {
        System.out.println("\n=== 1. LAMBDA EXPRESSIONS - Filtering and Sorting ===\n");
        
        // Filter services by fare (lambda expression)
        List<TransportService> affordableServices = transportServices.stream()
            .filter(service -> service.getFare() <= 3.50)
            .collect(Collectors.toList());
        
        System.out.println("Affordable Services (Fare <= $3.50):");
        affordableServices.forEach(service -> System.out.println("  - " + service.getServiceName() + ": $" + service.getFare()));
        
        // Sort by fare (lambda expression)
        List<TransportService> sortedByFare = transportServices.stream()
            .sorted((s1, s2) -> Double.compare(s1.getFare(), s2.getFare()))
            .collect(Collectors.toList());
        
        System.out.println("\nServices sorted by fare (ascending):");
        sortedByFare.forEach(service -> System.out.println("  - " + service.getServiceName() + ": $" + service.getFare()));
        
        // Filter by capacity (lambda expression)
        List<TransportService> highCapacity = transportServices.stream()
            .filter(service -> service.getCapacity() > 100)
            .collect(Collectors.toList());
        
        System.out.println("\nHigh Capacity Services (>100 passengers):");
        highCapacity.forEach(service -> System.out.println("  - " + service.getServiceName() + ": " + service.getCapacity() + " capacity"));
    }
    
    // ======== 2. METHOD REFERENCES - Quick Printing and Logging ========
    public void demonstrateMethodReferences() {
        System.out.println("\n=== 2. METHOD REFERENCES ===\n");
        
        // Method reference for printing
        System.out.println("All Transport Services (Method Reference):");
        transportServices.forEach(TransportService::printServiceDetails);
        
        // Method reference for logging (static method)
        transportServices.forEach(this::logServiceInfo);
    }
    
    private void logServiceInfo(TransportService service) {
        System.out.println("[LOG] Service " + service.getServiceId() + " - " + service.getServiceName() + " is " + (service.isAvailable() ? "available" : "unavailable"));
    }
    
    // ======== 3. DEFAULT METHODS IN INTERFACES ========
    public void demonstrateDefaultMethods() {
        System.out.println("\n=== 3. DEFAULT METHODS IN INTERFACES ===\n");
        
        System.out.println("Using inherited printServiceDetails() default method:");
        transportServices.get(0).printServiceDetails();
        
        System.out.println("Using isOperational() default method:");
        transportServices.forEach(service -> 
            System.out.println("  " + service.getServiceName() + ": " + (service.isOperational() ? "Operational" : "Down")));
    }
    
    // ======== 4. STATIC METHODS IN INTERFACES - GeoUtils ========
    public void demonstrateStaticMethods() {
        System.out.println("\n=== 4. STATIC METHODS IN INTERFACES (GeoUtils) ===\n");
        
        // Static method: calculateDistance
        double distance = GeoUtils.calculateDistance(40.7128, -74.0060, 34.0522, -118.2437);
        System.out.println("Distance from New York to Los Angeles: " + distance + " km");
        
        // Static method: isValidCoordinate
        System.out.println("Is (40.7128, -74.0060) valid? " + GeoUtils.isValidCoordinate(40.7128, -74.0060));
        System.out.println("Is (100.0, 200.0) valid? " + GeoUtils.isValidCoordinate(100.0, 200.0));
        
        // Static method: kmToMiles
        double miles = GeoUtils.kmToMiles(100);
        System.out.println("100 km = " + miles + " miles");
        
        // Static method: getEstimatedTravelTime
        int time = GeoUtils.getEstimatedTravelTime(distance, 60);
        System.out.println("Estimated travel time at 60 km/h: " + time + " minutes");
    }
    
    // ======== 5 & 6. STREAM APIs AND FOR EACH ========
    public void demonstrateStreamApiAndForEach() {
        System.out.println("\n=== 5 & 6. STREAM APIs AND FOR EACH ===\n");
        
        // Using ForEach to display live schedules
        System.out.println("Live Schedules Dashboard:");
        System.out.println("========================");
        transportServices.forEach(service -> {
            System.out.println("Service: " + service.getServiceName());
            System.out.println("  Route: " + service.getRoute());
            System.out.println("  " + service.getScheduleInfo());
            System.out.println("  Available: " + (service.isAvailable() ? "Yes" : "No"));
            System.out.println();
        });
        
        // Stream API for transformation
        List<String> serviceNames = transportServices.stream()
            .map(TransportService::getServiceName)
            .collect(Collectors.toList());
        
        System.out.println("Service Names (using Stream map): " + serviceNames);
        
        // Stream API for counting
        long availableCount = transportServices.stream()
            .filter(TransportService::isAvailable)
            .count();
        
        System.out.println("Number of Available Services: " + availableCount);
    }
    
    // ======== 7. COLLECTORS - groupingBy, partitioningBy, summarizingDouble ========
    public void demonstrateCollectors() {
        System.out.println("\n=== 7. COLLECTORS ===\n");
        
        // groupingBy() - Group passengers by route
        Map<String, List<Passenger>> passengersByRoute = passengers.stream()
            .collect(groupingBy(Passenger::getRoute));
        
        System.out.println("Passengers Grouped by Route:");
        passengersByRoute.forEach((route, passengerList) -> 
            System.out.println("  " + route + ": " + passengerList.size() + " passengers"));
        
        // partitioningBy() - Separate peak vs non-peak time trips
        Map<Boolean, List<Passenger>> peakNonPeak = passengers.stream()
            .collect(partitioningBy(Passenger::isPeakTime));
        
        System.out.println("\nPeak Time Passengers: " + peakNonPeak.get(true).size());
        System.out.println("Non-Peak Time Passengers: " + peakNonPeak.get(false).size());
        
        // summarizingDouble() - Total and average fares
        DoubleSummaryStatistics fareStats = passengers.stream()
            .collect(summarizingDouble(Passenger::getFarePaid));
        
        System.out.println("\nFare Statistics:");
        System.out.println("  Total Revenue: $" + fareStats.getSum());
        System.out.println("  Average Fare: $" + fareStats.getAverage());
        System.out.println("  Min Fare: $" + fareStats.getMin());
        System.out.println("  Max Fare: $" + fareStats.getMax());
        System.out.println("  Count: " + fareStats.getCount());
        
        // groupingBy() with counting
        Map<String, Long> passengerCountByTransport = passengers.stream()
            .collect(groupingBy(Passenger::getTransportType, counting()));
        
        System.out.println("\nPassenger Count by Transport Type:");
        passengerCountByTransport.forEach((type, count) -> 
            System.out.println("  " + type + ": " + count + " passengers"));
    }
    
    // ======== 9. FUNCTIONAL INTERFACES - FareCalculator ========
    public void demonstrateFunctionalInterfaces() {
        System.out.println("\n=== 9. FUNCTIONAL INTERFACES - FareCalculator ===\n");
        
        // Using lambda to implement FareCalculator
        FareCalculator standardFare = (distance, baseFare) -> baseFare + (distance * 0.50);
        FareCalculator premiumFare = (distance, baseFare) -> baseFare + (distance * 0.75);
        FareCalculator economyFare = (distance, baseFare) -> baseFare + (distance * 0.30);
        
        double distance = 10.5;
        System.out.println("Distance: " + distance + " km");
        
        System.out.println("Standard Fare Calculation: $" + standardFare.calculateFare(distance, 5.00));
        System.out.println("Premium Fare Calculation: $" + premiumFare.calculateFare(distance, 5.00));
        System.out.println("Economy Fare Calculation: $" + economyFare.calculateFare(distance, 5.00));
        
        // Using default method for surge pricing
        double surgeMultiplier = 1.5;
        System.out.println("\nWith " + (surgeMultiplier * 100 - 100) + "% surge pricing:");
        System.out.println("  Standard + Surge: $" + standardFare.applySurgeMultiplier(standardFare.calculateFare(distance, 5.00), surgeMultiplier));
        
        // Static method from functional interface
        System.out.println("\nMinimum Fare: $" + FareCalculator.getMinimumFare());
    }
    
    // ======== 10. MARKER INTERFACES - EmergencyService ========
    public void demonstrateMarkerInterfaces() {
        System.out.println("\n=== 10. MARKER INTERFACES - EmergencyService ===\n");
        
        // Check if service is an emergency service
        System.out.println("Emergency Services Detection:");
        for (TransportService service : transportServices) {
            boolean isEmergency = service instanceof EmergencyService;
            System.out.println("  " + service.getServiceName() + ": " + (isEmergency ? "Emergency Priority" : "Regular Service"));
        }
        
        // Demonstrate how emergency services would be prioritized
        System.out.println("\nIn emergency scenarios, services implementing EmergencyService interface");
        System.out.println("would be automatically prioritized in scheduling and routing.");
    }
    
    // ======== REAL-TIME USAGE FLOW DEMONSTRATION ========
    public void demonstrateRealTimeUsage() {
        System.out.println("\n\n========================================");
        System.out.println("REAL-TIME USAGE FLOW DEMONSTRATION");
        System.out.println("========================================\n");
        
        // 1. Passenger books a trip → Lambda filters and sorts available services
        System.out.println("1. PASSENGER BOOKS A TRIP");
        System.out.println("-------------------------");
        String preferredRoute = "Downtown - Airport";
        
        TransportService bestService = transportServices.stream()
            .filter(s -> s.getRoute().equals(preferredRoute))
            .min(comparingDouble(TransportService::getFare))
            .orElse(null);
        
        if (bestService != null) {
            System.out.println("Best service for " + preferredRoute + ": " + bestService.getServiceName());
            System.out.println("Fare: $" + bestService.getFare());
        }
        
        // 2. Dashboard updates live → ForEach displays current active services
        System.out.println("\n2. DASHBOARD LIVE UPDATE");
        System.out.println("------------------------");
        System.out.println("Active Services on Dashboard:");
        transportServices.stream()
            .filter(TransportService::isAvailable)
            .forEach(service -> System.out.println("  • " + service.getServiceName() + " (" + service.getRoute() + ") - $" + service.getFare()));
        
        // 3. Revenue reports generated → Collectors group and summarize data
        System.out.println("\n3. REVENUE REPORT GENERATION");
        System.out.println("----------------------------");
        DoubleSummaryStatistics revenue = passengers.stream()
            .collect(summarizingDouble(Passenger::getFarePaid));
        
        System.out.println("Total Daily Revenue: $" + revenue.getSum());
        System.out.println("Total Passengers: " + revenue.getCount());
        System.out.println("Average Fare: $" + String.format("%.2f", revenue.getAverage()));
        
        // 4. System expansion → Adding new service is easy
        System.out.println("\n4. SYSTEM EXPANSION (Example)");
        System.out.println("-----------------------------");
        System.out.println("To add a new FerryService, simply implement TransportService:");
        System.out.println("  public class FerryService implements TransportService { ... }");
        System.out.println("All default methods will be automatically available!");
        
        // 5. Emergency scenario → Marker interface detects and prioritizes
        System.out.println("\n5. EMERGENCY SCENARIO");
        System.out.println("--------------------");
        System.out.println("Emergency services (implementing EmergencyService) are flagged");
        System.out.println("and can bypass normal traffic rules and scheduling queues.");
    }
    
    public static void main(String[] args) {
        TransportManagementSystem system = new TransportManagementSystem();
        
        // Demonstrate all Java 8 Features
        system.demonstrateLambdaExpressions();
        system.demonstrateMethodReferences();
        system.demonstrateDefaultMethods();
        system.demonstrateStaticMethods();
        system.demonstrateStreamApiAndForEach();
        system.demonstrateCollectors();
        system.demonstrateFunctionalInterfaces();
        system.demonstrateMarkerInterfaces();
        
        // Demonstrate real-time usage flow
        system.demonstrateRealTimeUsage();
        
        System.out.println("\n\n========================================");
        System.out.println("SMART CITY TRANSPORT SYSTEM - COMPLETE");
        System.out.println("========================================");
    }
}
