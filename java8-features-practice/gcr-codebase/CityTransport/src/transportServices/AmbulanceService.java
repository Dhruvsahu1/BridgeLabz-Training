package transportServices;

import java.time.LocalTime;

import interfaces.EmergencyService;
import interfaces.TransportService;

public class AmbulanceService implements TransportService,EmergencyService {
	private String routes;
	private double fare;
	private LocalTime time;
	
	public AmbulanceService(String routes,double fare,LocalTime time) {
		this.fare = fare;
		this.routes = routes;
		this.time = time;
	}
	@Override
	public String getServiceName() {
		// TODO Auto-generated method stub
		return "Ambulance";
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
