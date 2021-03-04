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
        a = 11
        b = 3
        a = 9
        b = 5
        float
         */

        /*
        * a + b = 4 + 5 = 9
        * a - b = 4 - 5 = -1
        * a * b ...
        * a / b ...
        * a % b ...
        *  */
        int c1 = a + b;
        int c2 = a - b;
        int c3 = a * b;
        System.out.println("a + b = " + a + " + " + b + " = " + c1);
        System.out.println("a - b = " + a + " - " + b + " = " + c2);
        System.out.println("a * b = " + a + " * " + b + " = " + c3);
        System.out.println("a * b = " + a + " / " + b + " = " + (a / b));
        System.out.println("a * b = " + a + " % " + b + " = " + (a % b));

        a = 11;
        b = 3;
        c = a + b;
        System.out.println("a + b = " + a + " + " + b + " = " + c);
        c = a - b;
        System.out.println("a - b = " + a + " - " + b + " = " + c);
        c = a * b;
        System.out.println("a * b = " + a + " * " + b + " = " + c);
        System.out.println("a * b = " + a + " / " + b + " = " + (a / b));
        System.out.println("a * b = " + a + " % " + b + " = " + (a % b));

        // float x, y, result2; => kein modulo %
        double x = 5, y = 3;
        System.out.println("x + y = " + x + " + " + y + " = " + (x + y));
        System.out.println("x - y = " + x + " - " + y + " = " + (x - y));
        System.out.println("x * y = " + x + " * " + y + " = " + (x * y));
        System.out.println("x / y = " + x + " / " + y + " = " + (x / y));
        //  1.6666666
        //  1.6666666666666667
    }

}
