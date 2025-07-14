    import java.util.Scanner;
public class snack8 {
    //Chiedi un numero di 4 cifre all'utente
    //Calcola la somma di tutte le cifre che lo compongono

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
    //chiedo all'utente di inserire il numero
        System.out.print("inserisci un numero intero composto da 4 cifre");
    //creo un array vuoto che potrà contenere 4 numeri
    int numeroUtente = scan.nextInt();
    int [] cifre = new int [4];
    int somma = 0;
        
      
        //riempo l'array
        for(int i = 0; i < cifre.length; i-- ){
        cifre[i] = numeroUtente;        
    }
        for(int i = 0; i < cifre.length; i++) {
        somma += cifre[i];
        System.out.println("La somma totale è: " + somma);
        }
    
}
}