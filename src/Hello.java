public class Hello {
    public static void main (String[] args) {
        System.out.println("Hello");

        boolean isCoder = true;
        if (isCoder == false) {
            System.out.println("Coder");
            System.out.println("Not a coder");
        }

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("Nice!!");
        }

        int secondScore = 80;
        if (secondScore < topScore && topScore < 100) {
            System.out.println("Good");
        }

    }

}
