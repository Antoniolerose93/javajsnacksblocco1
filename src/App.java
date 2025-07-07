import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
   //l'utente inserisce due numeri in successione il software stampa il maggiore
    Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci due numeri");
        int numeroa = scan.nextInt();
        int numerob = scan.nextInt();
        

        if (numeroa > numerob){
            System.out.print(numeroa);
        }  else if (numerob > numeroa) {
            System.out.print(numerob);
        }

    }
}
