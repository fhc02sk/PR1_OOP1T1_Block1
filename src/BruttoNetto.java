public class BruttoNetto {
    public static void main(String[] args) {
        
        float netPrice = 252;
        int tax = 20;   // Prozent
        int maxTax = 50; // EURO
        
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

        double grossPrice = netPrice + calculatedTax;

        System.out.println("grossPrice = " + grossPrice);
    }
}
