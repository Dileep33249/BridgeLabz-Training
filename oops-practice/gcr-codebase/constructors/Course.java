package com.problems;

public class Course {
	 String courseName;
	 String duration;
	 int fee;
	 
	 static String instituteName;
	 
	 Course(String courseName,   String duration, int fee){
		this. courseName=courseName;
		 this.duration=duration;
		 this.fee=fee;
		 instituteName=null;
	 }
	 
	 void displayCourseDetails() {
		 System.out.println("course name is: "+courseName + " duration peroid is: " +duration+ " and instituteName is: "+ instituteName);
	 }
	 static void UpdateInstitiuteName(String Newname) {
		instituteName=Newname;
	 }
   public static void main(String [] args) {
	   Course obj1=new Course("Java fundamentals", "May to july",2500);
	   obj1.displayCourseDetails();
	   
	   UpdateInstitiuteName("Yamuna University");
	   obj1.displayCourseDetails();
   }
}
