import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        /*
        Snack3
        Il software deve chiedere per 10 volte all’utente di inserire un numero.
        Il programma stampa la somma di tutti i numeri inseriti.
        */

        Scanner scan = new Scanner(System.in);

        int finalNumber = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("inserire un numero intero ");

            int userNumber = scan.nextInt();
            //System.out.println("il numero è " + userNumber);
            finalNumber += userNumber;
        }

        System.out.println("la somma dei numeri inseriti dall'utente è " + finalNumber);

        
    }
}
