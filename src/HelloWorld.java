
// Kommentar
/*
    1. Klassenname muss Dateiname entsprechen
    2. Ändern => Refactor (SHIFT + F6)
 */
public class HelloWorld {

    // 3. psvm+ENTER generiert uns die main-Methode
    public static void main(String[] args) {
        // Startpunkt, für unsere Programme

        System.out.println("Hello World on day 4321");
        // Liebes "System"
        // wir wollen etwas "out" ausgaben
        // print
        // ln (neue Zeile)
        // übergeben mit "..." einen Text
        // Abkürzung "sout"+ENTER = System.out.println();

        System.out.println("Ausgabe mit Zeilenumbruch");

        System.out.print("Hello ");
        System.out.print("World ");
        System.out.print("without "); // STRG+D => Duplicate Line
        System.out.print("line break"); // STRG+D => Duplicate Line

        System.out.println();
        System.out.println("Letzte Zeile");
    }

}
