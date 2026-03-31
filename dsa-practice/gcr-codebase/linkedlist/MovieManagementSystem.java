package data_strcutures;

class Movie{
	String title;
	int releaseYear;
	String directorName;
	double rating;
	
	Movie(String title , int releaseYear , String directorName , double rating){
		this.title = title;
		this.releaseYear = releaseYear;
		this.directorName = directorName;
		this.rating = rating;
	}
	
	public void printDetails() {
		System.out.println("Name of the movie is: "+title +
				", releaseYear is: "+releaseYear+", directorName is: "+directorName+", and rating is: "+rating);
	
	}
}
class NodeData{
	Movie data;
	NodeData next;
	NodeData prev;
	
	NodeData(Movie data){
		this.data=data;
		this.next=this.prev=null;
	}
}
public class MovieManagementSystem {
	
	NodeData head;
	NodeData tail;
	
	public void addAtLast(Movie data){
		NodeData newNode=new NodeData(data);
		
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
		  newNode.prev=tail;
			tail=newNode;
			
		}
	}
		public void traverse() {
			NodeData temp=head;
			while(temp!=null) {
				temp.data.printDetails();
				temp=temp.next;
			}
		}
		
		public void traverseBack() {
			NodeData temp=tail;
			while(temp!=null) {
				temp.data.printDetails();
				temp=temp.prev;
			}
		}
		
		public void addAtStart(Movie data) {
			NodeData newNode=new NodeData(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
			
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		}
		public void UpdateRating(String title, double rating) {
			NodeData temp=head;
			
			while(temp!=null) {
				if(temp.data.title.equals(title)) {
					temp.data.rating=rating;
					return;
				}
				
				temp=temp.next;
			}
			System.out.print("Error 404, Movie not found...");
		}
		public void removeTitle(String title) {
			NodeData temp=head;
			while(temp!=null) {
				if(temp.data.title.equals(title)) {
					temp.prev.next=temp.next;
					temp.next.prev=temp.prev;
					return;
				}
				temp=temp.next;
			}
			
			System.out.print("Title Not Found......");
		}
		public void searchMovie(String directorName , double rating) {
			NodeData temp = head;
			
			while(temp!=null) {
				if(temp.data.directorName.equals(directorName) || temp.data.rating==rating) {
					temp.data.printDetails();
					return;
				}
			}
			
			System.out.print("Movie Not found.......");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieManagementSystem obj=new MovieManagementSystem();
		Movie first=new Movie("na ham mile", 1897, "dileep", 8.9);
		Movie sec=new Movie("kungfu" ,2007 , "surajbhai" , 7.9);
		Movie third=new Movie("break" , 2015, "tanuja", 6.3);
		
//		obj.addAtLast(first);
//		obj.addAtLast(sec);
//		obj.addAtLast(third);
		
		obj.addAtStart(sec);
		obj.addAtStart(first);
		obj.addAtStart(third);
		obj.traverse();
		
		obj.removeTitle("na ham mile");
		obj.traverse();
		

	}

}
