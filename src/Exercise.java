public class Exercise {
    public static void main(String[] args) {
        double value1 = 20.00;
        double value2 = 80.00;
        double total = (value1 + value2) * 100.00d;
        System.out.println(total);

        double division = total / 40.00d;
        double modulus = total % 40.00d;
        System.out.println(division);
        System.out.println(modulus);

        boolean result1 = division == 0.0 ? true : false;
        boolean result2 = modulus == 0.0 ? true : false;
        System.out.println(result1);
        System.out.println(result2);

        if (result1 != true) {
            System.out.println("Got some remainder");
        }

// Result of lecturer

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValueTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("My Values Total = " + myValueTotal);
        double theRemainder = myValueTotal % 40.00d;
        System.out.println("The Remainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("Is No Remainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got Some Remainder");
        }
    }
}
