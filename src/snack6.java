import java.util.Scanner;
public class snack6 {
    
//Stampa il cubo dei primi N numeri,
//dove N è un numero indicato dall’utente.

    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    System.out.print("inserisci un numero");
    int numeroN = scan.nextInt();
    
    //i <= perchè il ciclo si ferma a numeroN.
    // per stampare anche il cubo di N
    for (int i = 1; i <= numeroN; i++){
        int cubo = i*i*i;
        System.out.println("Cubo di" + i + "=" + cubo);
    }


    }
}
