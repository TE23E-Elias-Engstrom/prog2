void main(){
    boolean körProgram = true;
    while(körProgram){
        IO.println("\n--- Kalkylator ---");
        IO.println("1. Addition");
        IO.println("2. Subtraktion");
        IO.println("3. Multiplikation");
        IO.println("4. Division");
        IO.println("5. Avsluta");
        IO.println("Väljräknesätt");
        

        try {
            double val = IO.readln();

            if(val == 5){
                IO.println("Programmet har avslutats!")
                körProgram = false;
                continue;
            }

            IO.println("Ange det första talet.");
            double tal1 = IO.readln();

            IO.println("Ange det andra talet.")
            double tal2 = IO.readln();

            double resultat;

            switch(val) {
                case 1:
                    resultat = addition(tal1, tal2);
                    break;
                case 2:
                    resultat = subtraktion(tal1, tal2);
                    break;
                case 3:
                    resultat = multiplikation(tal1, tal2);
                    break;
                case 4:
                    resultat = division(tal1, tal2);
                    break;
                default:
                    IO.println("Ogiltigt val.");
                    continue;
            }

            IO.println("Resultat " + resultat);

        } catch (Exception e) {
            IO.println("Fel! Du måste skriva in ett tal. ")
        }
    }
}

double addition(double a, double b) {
    return a + b;
}

double subtraktion(double a, double b){
    return a - b;
}

double multiplikation(double a, double b){
    return a * b;
}

double division(double a, double b){
    if(b==0){
        IO.println("Division med 0 fungerar inte!")
        return 0;
    }
    return a / b;
}
      