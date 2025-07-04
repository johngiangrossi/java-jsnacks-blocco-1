import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        /*
        Snack4
        In un array sono contenuti i nomi degli invitati alla festa del grande Gatsby, chiedi all’utente il suo nome e comunicagli se può partecipare o no alla festa.
        */

        String[] listsGuests = { "Anna", "Luca", "Alberto", "Giulia", "Andrea" };
        
        Scanner scan = new Scanner(System.in);
        System.out.print("inserire la prima parola ");

        String userName = scan.nextLine();
        //System.out.println("la prima parola inserita è " + userName);

        boolean isInvited = false;

        for (int i = 0; i < listsGuests.length; i++) {
            String guestName = listsGuests[i];

            if (guestName.equals(userName)) {
                isInvited = true;
            }
        }

        if (isInvited) {
            System.out.println("utente di nome " + userName + " può partecipare");
        } else {
            System.out.println("utente di nome " + userName + " non può partecipare");
        }
    }
}
