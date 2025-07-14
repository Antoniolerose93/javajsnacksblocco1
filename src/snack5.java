import java.util.Scanner;
public class snack5 {
    
//Chiedi per 6 volte all’utente di inserire un numero,
//se è dispari mostrare questa informazione a video

public static void main(String[] args) {
       
    Scanner scan = new Scanner(System.in);
        
    
    //creo un array vuoto che potrà contenere 6 numeri
    int [] numeriUtente = new int [6];
    
    //chiedo all'utente di inserire 6 numeri
    System.out.print("inserisci sei numeri");

    //con un ciclo for riempio l'array con i sei numeri dell'utente
    for(int i = 0; i < numeriUtente.length; i++ ){
        numeriUtente[i] = scan.nextInt();
    }

    //con un altro ciclo for controllo se i numeri dell'utente sono dispari
    for(int i = 0; i < numeriUtente.length; i++ ){
        if (numeriUtente[i] % 2 != 0) {
            System.out.println(numeriUtente[i] + " "+ "è dispari");
        }
    }

}
}
