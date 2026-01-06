package com.review;
import java.util.*;
class Node{
	Course  data;
	Node next;
	
	Node(Course detail){
		this.data=detail;
		this.next=null;
	}
}
abstract class RegistrationService{
	abstract public void RegistrationDetails();
}

 class Person extends RegistrationService{
	String name;
	String classNo;
	int id;
	String admissionDate;
	
	Person(String name, int id,  String admissionDate){
		this.name=name;
		this.id=id;
		this.admissionDate=admissionDate;
	}
	@Override
	public void RegistrationDetails() {
		System.out.print("name: "+name+" ,classNo: "+classNo+", "+"id is: "+id+", registration data: "+date);
	}
	
}
 class Course {
	    String name;
	    int id;
	    double price;
	    int limit;

	    Course(String name, int id, double price, int limit) {
	        this.name = name;
	        this.id = id;
	        this.price = price;
	        this.limit = limit;
	    }
	}

 
 class Student extends Person {

	    private char grade;
	    private Node head;
	    private Node tail;

	    Student(String name, int id, String admissionDate) {
	        super(name, id, admissionDate);
	    }

	    public void setGrade(char grade) {
	        this.grade = grade;
	    }

	    public char getGrade() {
	        return grade;
	    }

	    public void enrollCourse(Course course) throws Exception {
	        if (course.limit == 0) {
	            throw new Exception("Course limit full: " + course.name);
	        }

	        Node newNode = new Node(course);
	        course.limit--;

	        if (head == null) {
	            head = tail = newNode;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }

	    public void listCourses() {
	        if (head == null) {
	            System.out.println("No courses enrolled");
	            return;
	        }

	        Node temp = head;
	        while (temp != null) {
	            System.out.println(temp.data.id + " - " + temp.data.name);
	            temp = temp.next;
	        }
	    }

	    public void dropCourse(int courseId) {
	        if (head == null) return;

	        if (head.data.id == courseId) {
	            head.data.limit++;
	            head = head.next;
	            return;
	        }

	        Node curr = head;
	        while (curr.next != null) {
	            if (curr.next.data.id == courseId) {
	                curr.next.data.limit++;
	                curr.next = curr.next.next;
	                return;
	            }
	            curr = curr.next;
	        }
	    }
	}

	public class StudentCourseRegistrationSystem {

	    public static void main(String[] args) {

	        Student s1 = new Student("Dileep", 101, "16-05-2016");
	        s1.setGrade('A');

	        Course c1 = new Course("Maths", 1, 200, 2);
	        Course c2 = new Course("Physics", 2, 300, 1);

	        try {
	            s1.enrollCourse(c1);
	            s1.enrollCourse(c2);
	            s1.enrollCourse(c2);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        s1.listCourses();

	        s1.dropCourse(1);
	        System.out.println("After drop:");
	        s1.listCourses();
	    }
	}

