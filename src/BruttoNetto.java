import java.sql.SQLOutput;

public class BruttoNetto {
    public static void main(String[] args) {

        float netPrice = 249;
        int tax;   // Prozent
        int maxTax = 50; // EURO

        int tax_class = 1;

        if (tax_class == 1){
            // sobald eine bedingung true, wird der rest übersprungen
            tax = 20;
        } else if (tax_class == 2) {
            tax = 16;
        } else if (tax_class == 3) {
            tax = 8;
        } else {
            tax = 0;
            System.out.println("Lieber User, diese Steuerklasse ist unbekannt");
        }

        switch (tax_class){
            case 1: // wenn tax_class == 1, dann mach diesen Fall
                tax = 20;
                break; // der Fall muss immer mit break abgeschlossen
            case 2:
                tax = 16;
                break;
            case 3:
                tax = 8;
                break;
            default: // sonst/else
                tax = 0;
                System.out.println("Lieber User, diese Steuerklasse ist unbekannt");
        }






        int schulnote = 4;
        int language = 1; /* 1 == Deutsch // 2 == Englisch)
        /* Sehr gut / Gut / Befriedigend / Genügend / Nicht Genügend */
        if (schulnote == 1 && language == 1) {
            System.out.println("Note: Sehr Gut");
        } else if (schulnote == 2 && language == 1) {
            System.out.println("Note: Gute");
        } else if (schulnote == 3 && language == 1) {
            System.out.println("Note: Befriedigend");
        } else if (schulnote == 4 && language == 1) {
            System.out.println("Note: Genügend");
        } else if (schulnote == 5 && language == 1) {
            System.out.println("Note: Nicht Genügend");
        } else if (schulnote == 1 && language == 2) {
            System.out.println("Note: A");
        } else if (schulnote == 2 && language == 2) {
            System.out.println("Note: B");
        } else if (schulnote == 3 && language == 2) {
            System.out.println("Note: C");
        } else if (schulnote == 4 && language == 2) {
            System.out.println("Note: D");
        } else if (schulnote == 5 && language == 2) {
            System.out.println("Note: F");
        }
        else {
            System.out.println("Falsche Note. Diesen Wert " + schulnote + " kennen wir nicht");
        }



        double calculatedTax = (netPrice * tax) / 100;
        // access memory and get netPrice (252)
        // put memory to cpu
        // access memory and get tax (20)
        // put memory to cpu
        // tell cpu, multiplicate last two values and move result to cpu
        // access memory and get 100
        // put 100 to cpu
        // tell cpu, divide last to values and move result to cpu
        // ask cpu to store result to memory


        System.out.println("calculatedTax = " + calculatedTax);

        // 200
        boolean maxTaxExceeded = calculatedTax >= maxTax;
        System.out.println("maxTaxExceeded = " + maxTaxExceeded);
        if (maxTaxExceeded == true) { // dann
            // entweder
            System.out.println("Der maximale Steuerbetrag wurde erreicht: " + calculatedTax + " >= " + maxTax);
        } else { // ELSE ist immer optional
            // oder
            System.out.println("Der maximale Stuerbetrag wurde nicht erreicht. Folgender Betrag ist noch verfügbar: "
                    + (maxTax - calculatedTax));
        }

        // Wenn die maximale Steuer nicht erreicht ist, dann "Juhu" ausgeben
        if (maxTaxExceeded == false){ // (false == false) => true
            System.out.println("Juhu");
        }

        if (!maxTaxExceeded){ // !false => true == true => true
            System.out.println("Juhu-2");
        }

        if (true){
            System.out.println("true");
        }

        if (false){
            System.out.println("false");
        }

        if (!false){
            System.out.println("not false");
        }
        
        boolean check = true;
        System.out.println("check = " + check);
        check = !check; // NOT 
        System.out.println("check = " + check);
        check = !check;
        System.out.println("check = " + check);
        System.out.println("expressions 5==5: " + ( 5 == 5));
        System.out.println("expressions 5==7: " + ( 5 == 7));
        System.out.println("expressions !5==7: " + !( 5 == 7));

        double grossPrice = netPrice + calculatedTax;

        System.out.println("grossPrice = " + grossPrice);
    }
}
