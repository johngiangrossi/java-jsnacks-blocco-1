public class App6 {
    public static void main(String[] args) {
        /*
        Snack7
        Stampa le potenze di 2 fino a 1000.
        */

        for (int i = 0; i < 1000; i++) {
            int powerNumber = (int) Math.pow(i, 2);
            System.out.println("il cubo del numero " + i + " è " + powerNumber);
        }
    }
}
