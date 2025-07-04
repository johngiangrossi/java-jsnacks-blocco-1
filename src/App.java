
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Snack1
        L’utente inserisce due numeri in successione.
        Il software stampa il maggiore.
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("inserire il primo numero intero ");

        int firstNumber = scan.nextInt();
        //System.out.println("il primo numero inserito è " + firstNumber);

        System.out.print("inserire il secondo numero intero ");

        int secondNumber = scan.nextInt();
        //System.out.println("il secondo numero inserito è " + secondNumber);

        if (firstNumber > secondNumber) {
            System.out.println("il numero " + firstNumber + " è maggiore");
        } else if (secondNumber > firstNumber) {
            System.out.println("il numero " + secondNumber + " è maggiore");
        }
    }
}
