public class App9 {
    public static void main(String[] args) {
        /*
        Snack10
        Alberello di Natale (piramide centrata)
        Stampa (con n = 5 righe):
            *
           ***
          *****
         *******
        *********
        */

        int lenghtTree = 5;
        
        
        
        for (int i = 0; i < lenghtTree; i++) {
            String star = "*";
            String empty = " ";

            // stampo spazi vuoti
            for (int j = 0; j < lenghtTree - i; j++) {
                System.out.print(empty);
            }
            
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print(star);
            }

            System.out.println();
        }
        


        



        /*
        for (int i = 0; i < lenghtTree; i++) {
            star += "*";
            System.out.println(star);
        }
       
       
        for (int a = 0; a < lenghtTree; a++) {
            String result = "";

            for (int r = 0; r < lenghtTree - a; r++) {
                result += "c";
            }

            System.out.println(result);
        }
         */


            
    }
}