package com.problems;

class Bookiee {
    public int isbn;
    protected String title;
    private String author;

    Bookiee(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String name) {
        author = name;
    }

    public void getAuthor() {
        System.out.println("Author name is: " + author);
    }
}

public class Ebook extends Bookiee {

    Ebook(int isbn, String title, String author) {
        super(isbn, title, author);
    }

    public static void main(String[] args) {
        Ebook ebook = new Ebook(101, "Java Basics", "James Gosling");
        ebook.getAuthor();
    }
}
