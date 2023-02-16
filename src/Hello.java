public class Hello {
    public static void main (String[] args) {
        System.out.println("Hello");

        boolean isCoder = true;
        if (isCoder == false) {
            System.out.println("Coder");
            System.out.println("Not a coder");
        }

        int topScore = 60;
        if (topScore <= 100) {
            System.out.println("Nice!!");
        }

        int secondScore = 50;
        if ((secondScore < topScore) && (topScore < 100)) {
            System.out.println("Good");
        }

        if ((topScore > 70) || (secondScore >= 60)) {
            System.out.println("You got 2nd");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("Success");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("Error");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (!isDomestic) {
            System.out.println("Domestic");
        }

        String s = (isDomestic) ? "Domestic" : "Not Domestic";

        System.out.println(s);

    }

}
