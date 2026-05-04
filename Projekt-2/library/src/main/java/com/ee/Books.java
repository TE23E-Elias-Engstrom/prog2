package com.ee;

// Klass Books, ärver av Publications, representerar en bok.

public class Books extends Publications {
    public String author;
    public String genre;
    public int pages;

    public Books(String id, String title, boolean isAvalible, String auther, String genre, int pages, String author) {
        super(id, title, isAvalible);
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    @Override
    public void printInfo() {
        IO.println("---------------Books------------");
        IO.println("ID         : " + id);
        IO.println("Titel      : " + title);
        IO.println("Författare : " + author);
        IO.println("Genre      : " + genre);
        IO.println("Sidor      : " + pages);
        IO.println("Tillgänglig: " + (isAvailable ? "Ja" : "Nej"));
        IO.println("---------------------------");
    }
}
