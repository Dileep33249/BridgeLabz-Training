package com.streamapi;
import java.util.*;
import java.util.Arrays;

class Doctor{
	boolean isAvailable;
	String speciality;
	
	Doctor(boolean isAvailable, String speciality){
		this.isAvailable=isAvailable;
		this.speciality=speciality;
	}
	
}
public class DoctorAvailibilty {
   
	
	public static void main(String [] args) {
	
		List<Doctor> doctorList = Arrays.asList(
		        new Doctor(true, "cardiologist"),
		        new Doctor(false, "paediatrician"),
		        new Doctor(true, "ortho"),
		        new Doctor(false, "eye doctor"),
		        new Doctor(true, "dermatologist")
		);

			doctorList.stream()
	          .filter(d -> d.isAvailable)
	          .forEach(d->System.out.println(d.isAvailable+" "+  d.speciality));

}
}
