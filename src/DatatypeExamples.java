public class DatatypeExamples {

    public static void main(String[] args) {

        System.out.println("Einige Beispiele zu Datentypen:");

        int length; // deklaration
        int width; // deklaration
        int result; // deklaration

        length = 5; // initialisierung
        width = 7; // initialisierung

        result = length * width; // initialisierung, auf rechten Seite: read/read

        System.out.println("Die Fläche von " + length + " und " +
                width + " lautet: " + result + "cm²");

        int a, b, c;
        a = 7;
        b = 5;
        c = 3;

        result = a / b;
        System.out.println("result = " + result);
        result = a = b * 3;
        System.out.println("a = " + a);
        System.out.println("result = " + result);
        
        a = 4;
        System.out.println("a = " + a);

        /*
        * a + b = 4 + 5 = 9
        * a - b = 4 - 5 = -1
        * a * b ...
        * a / b ...
        * a % b ...
        *  */
    }
}
