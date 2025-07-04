import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        /*
        Snack2
        L’utente inserisce due parole in successione.
        Il software stampa prima la parola più corta, poi la parola più lunga.
        */
        
        Scanner scan = new Scanner(System.in);
        System.out.print("inserire la prima parola ");

        String firstWord = scan.nextLine();
        //System.out.println("la prima parola inserita è " + firstWord);

        System.out.print("inserire la seconda parola ");

        String secondWord = scan.nextLine();
        //System.out.println("la seconda parola inserita è " + secondWord);

        if (firstWord.length() < secondWord.length()) {
            System.out.println("la parola " + firstWord + " è più corta di " + secondWord);
        } else if (secondWord.length() < firstWord.length()) {
            System.out.println("la parola " + secondWord + " è più corta di " + firstWord);
        } else {
            System.out.println("la parola " + firstWord + " è lunga uguale di " + secondWord);
        }
    }
}
