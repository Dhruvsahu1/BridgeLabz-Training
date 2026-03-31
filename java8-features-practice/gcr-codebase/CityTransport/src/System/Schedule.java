package System;
import java.time.LocalTime;

/**
 * Represents a transport schedule with departure and arrival times.
 */
public class Schedule {
    private String scheduleId;
    private String departureTime;
    private String arrivalTime;
    private String dayOfWeek;
    private boolean isPeakHour;
    
    public Schedule(String scheduleId, String departureTime, String arrivalTime, String dayOfWeek, boolean isPeakHour) {
        this.scheduleId = scheduleId;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.dayOfWeek = dayOfWeek;
        this.isPeakHour = isPeakHour;
    }
    
    public String getScheduleId() { return scheduleId; }
    public String getDepartureTime() { return departureTime; }
    public String getArrivalTime() { return arrivalTime; }
    public String getDayOfWeek() { return dayOfWeek; }
    public boolean isPeakHour() { return isPeakHour; }
    
    @Override
    public String toString() {
        return String.format("Schedule[%s: %s->%s (%s), Peak: %s]", 
            scheduleId, departureTime, arrivalTime, dayOfWeek, isPeakHour ? "Yes" : "No");
    }
}
