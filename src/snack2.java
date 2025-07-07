import java.util.Scanner;
public class snack2 {
    //L’utente inserisce due parole in successione.
//Il software stampa prima la parola più corta, poi la parola più lunga.
public static void main(String[] args) throws Exception {
Scanner scan = new Scanner(System.in);
    System.out.println("inserisci due parole");
    String parolaa = scan.nextLine();
    String parolab = scan.nextLine();

    if (parolaa.length()> parolab.length()){
        System.out.println(parolaa); 
    }  else if (parolab.length() > parolaa.length()) {
            System.out.print(parolab);
        }

}
}