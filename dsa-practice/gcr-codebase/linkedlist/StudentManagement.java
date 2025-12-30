package data_strcutures;
import java.util.*;
class Student{
	String name;
	int rollNumber;
	byte age;
	char grade;
	
	Student(String name, int rollNumber , byte age, char grade){
		this.name=name;
		this.rollNumber=rollNumber;
		this.age=age;
		this.grade=grade;
	}
	public void printDetails() {
		System.out.println("Student name is :"+name
				+", RollNumber is: "+rollNumber+", age is: "+age
				+", and their grade is: "+grade);
	}
}

class Node{
	Student data;
	Node next;
	
	Node(Student data){
		this.data=data;
		this.next=null;
	}
}
public class StudentManagement {
	Node head;
	Node tail;
	
  private void addNode(Student data) {
	  Node newNode=new Node(data);
	  if(head==null && tail==null) {
		  head=newNode;
		  tail=newNode;
	  }
	  else {
		  tail.next=newNode;
		  tail=tail.next;
	  }
  }
  
  private void deleteNode(int rollNumber) {
	  if(head==null) {
		  return;
	  }
	  if(head.data.rollNumber==rollNumber) {
		  head=head.next;
		  if(head==null) {
			  tail=null;
		  }
  }else {
	  Node temp=head;
	  while(temp.next!=null && temp.next.data.rollNumber!=rollNumber) {
		  temp=temp.next;
	  }
	  temp.next=temp.next.next;
  }
  }
  
  private void traverse() {
	  Node temp=head;
	  while(temp!=null) {
		  temp.data.printDetails();
		  temp=temp.next;
	  }
  }
  public void search(int rollNumber) {
	  Node temp=head;
	  boolean flag=false;;
	  while(temp!=null) {
		  if(temp.data.rollNumber==rollNumber) {
			  temp.data.printDetails();
			  return;
		  }
		  temp=temp.next;
	  }

	  System.out.println("User nor found");
  }
  public void StudentUpdate(int rollNumber, char grade) {
	  Node temp=head;
	  while(temp!=null) {
		  if(temp.data.rollNumber==rollNumber) {
			  temp.data.grade=grade;
			  return;
		  }
		  temp=temp.next;
	  }
	
		  System.out.println("user nor found");
	  
  }
  public static void main(String [] args) {
	  
	  Student obj=new Student("dileep", 22151154 , (byte) 24, 'A');
	  StudentManagement students=new StudentManagement();
	  Student obj2=new Student("tanuja", 22779154 , (byte) 17, 'C');
	  students.addNode(obj);
	  students.addNode(obj2);
	  
	  students.traverse();
	   students.StudentUpdate(22151154, 'B');
	   students.traverse();
  }

}
