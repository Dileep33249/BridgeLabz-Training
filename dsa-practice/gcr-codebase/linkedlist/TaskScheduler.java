package data_strcutures;
import java.util.*;
public class TaskScheduler {
   int taskId;
   String taskName;
   int taskPriority;
   String dueDate;
   
   TaskScheduler(int taskId , String taskName, int taskPriority , String dueDate){
	   this.taskId=taskId;
	   this.taskName=taskName;
	   this.taskPriority=taskPriority;
	   this.dueDate=dueDate;
   }
   
   TaskScheduler(){
	   
   }
   
   private void details() {
	   System.out.println("Task id is: "+taskId+
			   "taskName is: "+taskName+", taskPriority is: "+taskPriority+", dueDate is: "+dueDate);
			   
   }
   
   Node head;
   Node tail;
   
   class Node{
	   TaskScheduler data;
	   Node next;
	   Node prev;
	   
	   Node(TaskScheduler data){
		   this.data=data;
	   }
   }
   
   private void addAtFirst(TaskScheduler data) {
	   Node newNode =new Node(data);
	   if(head==null) {
		   head=tail=newNode;
		   head.prev=tail;
		   tail.next=head;
	   }
	   else {
		   newNode.next=head;
		   newNode.prev=head.prev;
		   head.prev=newNode;
		   tail.next=newNode;
		   head=newNode;
	   }
   }
   
   private void traverse() {
	   if(head==null) {
		   System.out.print("list is empty");
		   return;
	   }
	   Node temp=head;
	   
	   do {
		   temp.data.details();
		   temp=temp.next;
		   
	   }while(temp!=head);
   }
   
   private void deleteANode(int id) {
	   Node temp=head;
	   
	   do {
		   if(head.data.taskId==id) {
			   tail.next=head.next;
			   head.next.prev=tail;
			   head=head.next;
		   }else {
			   if(temp.data.taskId==id) {
				   temp.prev.next=temp.next;
			   }
		   }
		   temp=temp.next;
	   }while(temp!=head);
   }
   
   private void search(int priority) {
	   Node temp=head;
	   
	   do {
		   if(temp.data.taskPriority==priority) {
			   temp.data.details();
			   return;
		   }
		   temp=temp.next;
		   
	   }while(temp!=head);
   }
   public static void main(String [] args) {
	   
	   TaskScheduler mainObject=new TaskScheduler();
	   
	   TaskScheduler obj1=new TaskScheduler(123, "shaadi" , 2,"26-07-29");
	   TaskScheduler obj2=new TaskScheduler(124, "running" , 3,"26-07-29");
	   TaskScheduler obj3=new TaskScheduler(125, "coffee making" , 4,"26-07-29");
	   TaskScheduler obj4=new TaskScheduler(126, "office work" , 5,"26-07-29");
	   TaskScheduler obj5=new TaskScheduler(127, "sleep" , 1,"26-07-29");
	   
	   mainObject.addAtFirst(obj1);	   
	   mainObject.addAtFirst(obj2);
	   mainObject.addAtFirst(obj3);
	   mainObject.addAtFirst(obj4);
	   mainObject.addAtFirst(obj5);
	   
	   mainObject.traverse();
	   mainObject.deleteANode(123);
	   System.out.println("--------------------");
	   
	   mainObject.search(1);
	   mainObject.traverse();

	   
   }
   
}
