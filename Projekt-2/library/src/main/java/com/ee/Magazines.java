package com.ee;

// Magazine klass som ärver av Publications som representerar en tidning.

public class Magazines extends Publications {
    public int issueNumber;
    public String catagory;
    public int publishedYear;

    public Magazines(String id, String title, boolean isAvailable, int issueNumber, String catagory,
            int publishedYear) {
        super(id, title, isAvailable);
        this.issueNumber = issueNumber;
        this.catagory = catagory;
        this.publishedYear = publishedYear;
    }

    @Override
    public void printInfo() {
        IO.println("--------- Magazines ---------");
        IO.println("ID           : " + id);
        IO.println("Title        : " + title);
        IO.println("Nummer       : " + issueNumber);
        IO.println("Kategori     : " + catagory);
        IO.println("Utgivningsår : " + publishedYear);
        IO.println("Tillgänglig  : " + (isAvailable ? "Ja" : "Nej"));
        IO.println("-----------------------------");
    }
}
