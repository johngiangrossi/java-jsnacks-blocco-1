import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        /*
        Snack6
        Stampa il cubo dei primi N numeri,
        dove N è un numero indicato dall’utente.
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("inserire un numero ");

        int userNumber = scan.nextInt();
        //System.out.println("il primo numero inserito è " + userNumber);

        for (int i = 0; i < userNumber; i++) {
            int cubeNumber = (int) Math.pow(i, 3);
            System.out.println("il cubo del numero " + i + " è " + cubeNumber);
        }
    }
}
