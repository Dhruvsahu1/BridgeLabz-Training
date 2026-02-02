package interfaces;

import java.time.LocalTime;

public interface TransportService{
	public default void printServiceDetails() {
		System.out.println("Welcome to transport services");
		System.out.println("Services name "+ getServiceName());
		System.out.println("Routes "+getRoute());
		System.out.println("fares "+getFare());
		System.out.println("Time "+getDepartureTime());
	}
	static void logService(String msg) {
		System.out.println("Log "+msg);
	}
	String getServiceName();
	String getRoute();
	double getFare();
	LocalTime getDepartureTime();
	
}


