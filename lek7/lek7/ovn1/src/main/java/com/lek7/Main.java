
//GSON objekt som vi behöver
import com.google.gson.*;
// Importera Type för att hjälpa json att omvandla data
import java.lang.reflect.Type;
import kong.unirest.HttpResponse;
import kong.unirest.UnirestException;
// Importera Fil hantering
import java.nio.file.*;
import java.io.IOException;
// ArrayList för att lagra objekt
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String baseUrl = "http://10.151.168.5:32768/posts";
        Gson gson = new Gson(); // att översätta data
        IO.println("STARTAR JSON KLIENT");

        IO.println("\n --- 1. GET (Ett objekt) ---");

        HttpResponse<String> one_response;
        try {
            one_response = Unirest.get(baseUrl + "/2").asString();
        } catch (UnirestException e) {
            IO.println("Undantag uppkoppling:" + e.getLocalizedMessage());
            return;
        }

        int status = one_response.getStatus();
        IO.println("Statuskod: " + status);

        if (status != 200) {
            IO.println("Fel från server, statuskod: " + status);
            return;
        }

        String get_one_Body = one_response.getBody();

        ForumPost savedPost = gson.fromjson(get_one_Body, ForumPost.class);
        IO.println("Hämtade inlägg: " + savedPost);

    }
}