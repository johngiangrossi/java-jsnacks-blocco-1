import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        /*
        Snack5
        Chiedi per 6 volte all’utente di inserire un numero,
        se è dispari mostrare questa informazione a video
        */

        Scanner scan = new Scanner(System.in);

        int finalNumber = 0;

        int count = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("inserire un numero intero ");

            int userNumber = scan.nextInt();
            //System.out.println("il numero è " + userNumber);
            if (userNumber % 2 != 0) {
                System.out.println("il numero " + userNumber + " è dispari");
                count++;
            }
        }

        System.out.println("utente a inserito " + count + " numeri dispari");

    }
}
