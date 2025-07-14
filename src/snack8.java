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
    
    int somma = 0;
        
      
      while (numeroUtente>0) {
        somma += numeroUtente % 10;
        numeroUtente /=10;
      }
      
      System.out.println("La somma delle cifre è: " + somma);
    
}
}