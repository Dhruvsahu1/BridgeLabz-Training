package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Source.Vessel;
import Source.VesselUtils;

public class main {
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		VesselUtils vl = new VesselUtils();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vessel's ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i =0;i<n;i++) {
			String s = sc.nextLine();
			li.add(s);
		}
		for (String string : li) {
			String arr[] = string.split(":");
			String vesselId = arr[0];
			String vesselName = arr[1];
			double averageSpeed = Double.valueOf(arr[2]);
			String vesselType = arr[3];
			vl.addVeselPerformance(new Vessel(vesselId, vesselName, averageSpeed, vesselType));
		}
		System.out.println("Enter the vessel id to find it");
		String vesselId = sc.nextLine();
		Vessel vessel = vl.getVesselById(vesselId);
		if(vessel==null) {
			System.out.println("Vessel id "+vesselId+" not found");
		}
		else {
			System.out.println(vessel);
		}
		System.out.println("High Performance vessels are ");
		List<Vessel> list = vl.getHighPerformanceVessel();
		for(Vessel vsl:list) {
			System.out.println(vsl);
		}
		vl.getHighPerformanceVessel();
	}
}
