package transportServices;
import java.time.LocalTime;

import interfaces.TransportService;

public class BusServices implements TransportService {
	private String routes;
	private double fare;
	private LocalTime time;
	
	public BusServices(String routes,double fare,LocalTime time) {
		this.fare = fare;
		this.routes = routes;
		this.time = time;
	}
	

	@Override
	public String getServiceName() {
		
		return "Bus";
	}

	@Override
	public String getRoute() {
		// TODO Auto-generated method stub
		return routes;
	}

	@Override
	public double getFare() {
		// TODO Auto-generated method stub
		return fare;
	}

	@Override
	public LocalTime getDepartureTime() {
		// TODO Auto-generated method stub
		return time;
	}

}
