package com.ee;

import java.util.ArrayList;;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Books> books = new ArrayList<Books>();
        ArrayList<Magazines> magazines = new ArrayList<Magazines>();

        LibraryClient client = new LibraryClient();
        Scanner scanner = new Scanner(System.in);
        int val = 0;

        IO.print("=== Välkommen till Bibliotek System ===");

        while (val != 6) {
            IO.println("\n========= Meny =========");
            IO.println("1. Hämta böcker från server");
            IO.println("2. Hämta tidningar från server");
            IO.println("3. Skriv ut böcker eller tidningar");
            IO.println("4. Lägg till bok manuellt");
            IO.println("5. Lägg till tidningar manuellt");
            IO.println("6. Avsluta");
            IO.println("==========================");
            IO.println("Ditt val: ");

            val = scanner.nextInt();
            scanner.nextLine();

            if (val == 1) {
                IO.println("Hämtar böcker...");
                ArrayList<Books> hämtade = client.fetchBooks();
                books.addAll(hämtade);
                IO.println(hämtade.size() + "böcker hämtade och sparade.");
            } else if (val == 2) {
                IO.println("Hämtar tidningar...");
                ArrayList<Magazines> hämtade = client.fetchMagazines();
                magazines.addAll(hämtade);
                IO.println(hämtade.size() + "tidningar hämtade och sparade.");
            } else if (val == 3) {
                IO.println("Vad vill du skriva ut?");
                IO.println("1. Böcker");
                IO.println("2. Tidningar");
                IO.println("Val: ");
                int utVal = scanner.nextInt();
                scanner.nextLine();

                if (utVal == 1) {
                    if (books.isEmpty()) {
                        IO.println("Inga böcker sparade. Hämta dem först.");
                    } else {
                        IO.println("\n=== Böcker ===");
                        for (int i = 0; i < books.size(); i++) {
                            books.get(i).printInfo();
                        }
                    }
                } else if (utVal == 2) {
                    if (magazines.isEmpty()) {
                        IO.println("Inga tidningar sparade. Hämta dem först.");
                    } else {
                        IO.println("\n=== Tidningar ===");
                        for (int i = 0; i < magazines.size(); i++) {
                            magazines.get(i).printInfo();
                        }
                    }
                }
            } else if (val == 4) {

            }

        }
    }
}