import java.util.Scanner;

public class snack4 {
    //In un array sono contenuti i nomi degli invitati alla festa del grande Gatsby, 
    //chiedi all’utente il suo nome e comunicagli se può partecipare o no alla festa.

public static void main(String[] args) {

    String[] invitati = {"Giorgio", "Luca", "Mario", "Sara", "Ilaria"};
        Scanner scan = new Scanner(System.in);
        System.out.print("Come ti chiami? ");
        String nomePersona = scan.nextLine().trim(); // Rimuove spazi

        for (int i = 0; i < invitati.length; i++) {
            if (invitati[i].equalsIgnoreCase(nomePersona)) { // Confronto senza distinzione tra maiuscole/minuscole
                System.out.println("Benvenuto alla festa");
               return;
            }
        }

        System.out.println("Mi dispiace, non sei sulla lista");
       
    }
}