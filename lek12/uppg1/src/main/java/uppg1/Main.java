package uppg1;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Type personListType = new TypeToken<ArrayList<Person>>() {
        }.getType();

        String medlemmarString = "";
        String f_hjalpenString = "";
        String avstangdaString = "";
        String besokandeString = "";

        // Läs in alla filer
        try {
            medlemmarString = Files.readString(Paths.get("medlemmar.json"));
            f_hjalpenString = Files.readString(Paths.get("f_hjälpen.json"));
            avstangdaString = Files.readString(Paths.get("avstängda.json"));
            besokandeString = Files.readString(Paths.get("besökande.json"));
        } catch (Exception e) {
            IO.println("Fel vid inlässning av filen/erna" + e);
        }

        ArrayList<Person> medlemmar = gson.fromJson(medlemmarString, personListType);
        ArrayList<Person> f_hjalpen = gson.fromJson(f_hjalpenString, personListType);
        ArrayList<Person> avstangda = gson.fromJson(avstangdaString, personListType);
        ArrayList<Person> besokande = gson.fromJson(besokandeString, personListType);

        // HITTA MEDLEMMAR SOM HAR F_HJÄLPEN UTBILDNING
        HashSet<Person> medlemmarHashSet = new HashSet<>(medlemmar);
        HashSet<Person> f_hjälpenHashSet = new HashSet<>(f_hjalpen);

        medlemmarHashSet.retainAll(f_hjälpenHashSet);
        for (Person person : medlemmarHashSet) {

        }
    }
}