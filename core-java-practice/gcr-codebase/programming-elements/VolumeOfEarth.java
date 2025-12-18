
public class VolumeOfEarth {
	public static void main(String args[]) {
		int radius = 6378;
		double volumeEarthKilometer = (4/3)*3.14*radius*radius*radius;
		double volumeEarthMiles = volumeEarthKilometer*0.621371; // 1 kilometers = 0.621371
		System.out.println("The volume of Earth is in cubic kilometers is "+volumeEarthKilometer+" and the volume in cubic miles is "+volumeEarthMiles);
	}
}
