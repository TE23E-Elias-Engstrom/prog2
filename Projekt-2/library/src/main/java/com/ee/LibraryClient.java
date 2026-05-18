package com.ee;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

import java.util.ArrayList;

// En klass som hämtar informationen från servern och skapar java-objekt av json datan.

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
            String innehallJson = response.getBody();

            // TypeToken säger till Gson vilken typ den vill ha i vårt fall ArrayList<Books>
            // som en mall för json till gson.
            Type booksTyp = new TypeToken<ArrayList<Books>>() {
            }.getType();
            books = gson.fromJson(innehallJson, booksTyp);

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
            String innehallJson = response.getBody();

            // TypeToken gör samma som på books fast med Magazines.
            Type magazineTyp = new TypeToken<ArrayList<Magazines>>() {
            }.getType();
            magazines = gson.fromJson(innehallJson, magazineTyp);
        } catch (Exception e) {
            IO.println("Fel vid hämtning av böcker " + e.getLocalizedMessage());
        }

        return magazines;
    }

}
