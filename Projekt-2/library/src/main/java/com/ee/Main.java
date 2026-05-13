package com.ee;

import java.util.ArrayList;
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
            IO.print("Ditt val: ");

            val = scanner.nextInt();
            scanner.nextLine();

            if (val == 1) {
                IO.println("Hämtar böcker...");
                ArrayList<Books> hämtade = client.fetchBooks();
                books.addAll(hämtade);
                IO.println(hämtade.size() + " böcker hämtade och sparade.");
            } else if (val == 2) {
                IO.println("Hämtar tidningar...");
                ArrayList<Magazines> hämtade = client.fetchMagazines();
                magazines.addAll(hämtade);
                IO.println(hämtade.size() + " tidningar hämtade och sparade.");
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
                IO.println("\n--- Lägg till ny bok ---");

                String id = String.valueOf(books.size() + 1);

                IO.print("Titel: ");
                String title = scanner.nextLine();

                IO.print("Författare: ");
                String author = scanner.nextLine();

                IO.print("Genre: ");
                String genre = scanner.nextLine();

                IO.print("Antal sidor: ");
                int pages = scanner.nextInt();
                scanner.nextLine();

                books.add(new Books(id, title, true, author, genre, pages, author));
                IO.println("Boken \"" + title + "\" har lagts till.");
            } else if (val == 5) {
                IO.println("\n --- Lägg till ny tidning ---");

                String id = String.valueOf(magazines.size() + 1);

                System.out.print("Titel: ");
                String title = scanner.nextLine();

                System.out.print("Nummer (issueNumber): ");
                int issueNumber = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Kategori: ");
                String category = scanner.nextLine();

                System.out.print("Utgivningsår: ");
                int publishedYear = scanner.nextInt();
                scanner.nextLine();

                magazines.add(new Magazines(id, title, false, issueNumber, category, publishedYear));
                IO.println("Tidningen \"" + title + "\" har lagts till.");
            } else if (val == 6) {
                IO.println("Avslutar Bibliotekssystemet. Hej då!");
            } else {
                IO.println("Ogiltigt val, försök igen.");
            }

        }
        scanner.close();
    }
}