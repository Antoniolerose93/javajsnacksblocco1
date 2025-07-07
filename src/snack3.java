import java.util.Scanner;

public class snack3 {
    //Il software deve chiedere per 10 volte all’utente di inserire un numero.
    //Il programma stampa la somma di tutti i numeri inseriti.
public static void main(String[] args) throws Exception {
Scanner scan = new Scanner(System.in);

int somma = 0;

for (int i = 1 ; i<= 10; i++) {
    System.out.print("Inserisci il numero" + i +":");
    int numero = scan.nextInt();
    somma += numero;

}
 System.out.println("La somma totale è: " + somma);
}

}
