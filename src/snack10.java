import java.util.Scanner;

public class snack10 {

    public static void main(String[] args) {
//     Alberello di Natale (piramide centrata)
// Stampa (con n = 5 righe):
//     *
//    ***
//   *****
//  *******
// *********
Scanner scan = new Scanner(System.in);
    
    System.out.print("Inserisci un numero");
        int numeroUtente = scan.nextInt();

        for (int i = 1; i <= numeroUtente; i++) {
            //come stampare un * per ogni colonna
        for (int spazio = 1; spazio <= numeroUtente - i; spazio++) {
                System.out.print(" ");
            }
        for (int j = 1; j <=(2*i-1); j++) {
                System.out.print("*");
            }
                 System.out.println();

}
}
}