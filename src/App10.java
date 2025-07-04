public class App10 {
  public static void main(String[] args) {
    /*
    Snack11
    Piramide vuota con bordi di asterischi
    Con n = 5:
          *
        *   *
      *      *
    *         *
      *********
    */


    int lenghtTree = 10;
    
    
    for (int i = 0; i < lenghtTree; i++) {
      String star = "*";
      String empty = " ";

      // stampo spazi vuoti
      for (int j = 0; j < lenghtTree - i; j++) {
        System.out.print(empty);
      }

      System.out.print(star);

      
      for (int k = 1; k < (2 * i + 1); k++) {
        System.out.print(empty);
      }

      if (i >= 1) {
        System.out.print(star);
      }

      
      System.out.println();
      
      if (i >= lenghtTree - 1) {
        for (int t = 0; t < (lenghtTree * 2 + 1); t++) {
          System.out.print(star);
        }
      }
    }
  }
}
