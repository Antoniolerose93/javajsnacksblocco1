import java.util.Scanner;

public class snack3 {
    //Il software deve chiedere per 10 volte all’utente di inserire
    //un numero.
    //Il programma stampa la somma di tutti i numeri inseriti.
public static void main(String[] args) throws Exception {
Scanner scan = new Scanner(System.in);

//inizializza la variabile somma a zero prima di iniziare a sommare i valori.
int somma = 0;


//Si parte da 1. Si va avanti finchè i è = o < 10
for (int i = 1 ; i<= 10; i++) {
    System.out.print("Inserisci il numero" + i +":");
    int numero = scan.nextInt();
//Aggiunge il numero inserito alla variabile somma, che deve essere stata
//inizializzata prima del ciclo
    somma += numero;

}
 System.out.println("La somma totale è: " + somma);
}

}
