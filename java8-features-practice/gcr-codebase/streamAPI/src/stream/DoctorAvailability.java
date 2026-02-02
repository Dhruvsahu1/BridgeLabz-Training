package stream;
import java.util.*;
class Doctor{
	String name;
	String speciality;
	boolean avaialability;
	Doctor(String name,String speciality,boolean avaialability){
		this.name = name;
		this.speciality = speciality;
		this.avaialability = avaialability;
	}
	public String getSpeciality() {
		return speciality;
	}
}
public class DoctorAvailability {
	public static void main(String[] args) {
		
		List<Doctor> doctor = Arrays.asList(
			new Doctor("Dr. A","Cardiology",true),
			new Doctor("Dr. B","Neurology",false),
			new Doctor("Dr. C","Orthopeedic",false),
			new Doctor("Dr. D","Dermatology",true),
			new Doctor("Dr. E","All Rounder",true)
		);
		doctor.stream().filter(d->d.avaialability).sorted(Comparator.comparing(Doctor::getSpeciality).reversed())
		.forEach(d->System.out.println("Name "+d.name+" "+d.speciality+" "));
	}

}
