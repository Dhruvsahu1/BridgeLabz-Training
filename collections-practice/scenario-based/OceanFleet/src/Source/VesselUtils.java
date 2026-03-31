package Source;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VesselUtils {
	private List<Vessel> vesselList = new ArrayList<Vessel>();

	public List<Vessel> getVesselList() {
		return vesselList;
	}

	public void setVesselList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}
	public void addVeselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	public Vessel getVesselById(String id) {
		for(Vessel vesl:vesselList) {
			if(vesl.vesselId.equals(id)) {
				return vesl;
			}
		}
		return null;
	}
	public List<Vessel> getHighPerformanceVessel(){
		double maxSpeed = vesselList.stream().mapToDouble(Vessel::getAverageSpeed).max().orElse(0);
		return vesselList.stream().sorted(Comparator.comparing(Vessel::getAverageSpeed)).filter(v->v.getAverageSpeed()==maxSpeed)
				.collect(Collectors.toList());
		
	}
}
