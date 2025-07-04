public class App8 {
    public static void main(String[] args) {
        /*
        Snack9
        Calcola la somma e la media dei primi 10 numeri.
        */

        int average = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            average = sum / 10;
        }
        System.out.println("la somma dei numeri da 1 a 10 è " + sum + " e la media è " + average);
    }
}
