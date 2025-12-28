package com.inhertence;
import java.util.*;
class Book{
	String title;
	int publicationYear;
	
	Book(String title , int publicationYear){
		this.title=title;
		this.publicationYear=publicationYear;
	}
	void InfoDetails() {
        System.out.println(
            "Book name is: " + title +
            ", publication year is: " + publicationYear
        );
}
}
class Author extends Book{
	String authorName;
	String bio;
	
	Author(String name, String BookName, int publicationYear, String bio ){
		super(BookName, publicationYear);
		this.authorName=name;
		this.bio=bio;
	}
	@Override
	public void InfoDetails() {
		System.out.println(
				"Book name is: "+title+
				", authorName is: " +authorName+
				", publication Year is: "+publicationYear
				);
	}
	
}
public class LibraryManagementSystem {
	public static void main(String [] args) {
   Book obj=new Author("Dileep" , "LongThinkings", 2006, "well renowed author about sctific thinking");
   
   obj.InfoDetails();
}
}


