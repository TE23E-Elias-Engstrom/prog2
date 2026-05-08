package com.ee;

import com.google.gson.Gson;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

import java.util.ArrayList;
import java.util.Arrays;

public class LibraryClient {

    // URL till json servern
    private String basURL = "http://10.151.168.5:3133/";

    private Gson gson = new Gson();

    // Hämtar böcker från /books och låter Gson omvandla JSON direkt till
    // Book-objektet
    public ArrayList<Books> fetchBooks() {
        ArrayList<Books> books = new ArrayList<Books>();

        try {
            HttpResponse<String> response = Unirest.get(basURL + "/books").asString();
            String json = response.getBody();

            // Gson omvandlar hela JSON array direkt till en array av Book-objekt
            Books[] booksArray = gson.fromJson(json, Books[].class);
            books.addAll(Arrays.asList(booksArray));
        } catch (Exception e) {
            IO.println("Fel vid hämtning av böcker " + e.getLocalizedMessage());
        }

        return books;
    }

    // Hämtar böcker från /magazines och låter Gson omvandla JSON direkt till
    // Magazines-objektet
    public ArrayList<Magazines> fetchMagazines() {
        ArrayList<Magazines> magazines = new ArrayList<Magazines>();

        try {
            HttpResponse<String> response = Unirest.get(basURL + "/magazines").asString();
            String json = response.getBody();

            // Gson omvandlar hela JSON array direkt till en array av Magazines-objekt
            Magazines[] magazinesArray = gson.fromJson(json, Magazines[].class);
            magazines.addAll(Arrays.asList(magazinesArray));
        } catch (Exception e) {
            IO.println("Fel vid hämtning av böcker " + e.getLocalizedMessage());
        }

        return magazines;
    }

}
