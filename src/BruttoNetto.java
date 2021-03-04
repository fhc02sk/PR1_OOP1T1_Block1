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

        int schulnote = 4;
        /* Sehr gut / Gut / Befriedigend / Genügend / Nicht Genügend */


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
