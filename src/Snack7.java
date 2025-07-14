public class Snack7 {
    public static void main(String[] args) {
        //Stampa le potenze di 2 fino a 1000
      int valore = 1; // si parte da valore = 1 perché 2 alla 0 fa 1
      int potenza = 0; //serve per indicare a quale esponente sto arrivando, 2alla0, 2alla1 ecc.

    //finchè valore è < o = a 1000  
    // while (valore <=1000) {
    //     System.out.println("2^" + potenza + " = " + valore);
    //     //aumenta di 1 l'esponente
    //     potenza ++;
    //     //calcola 2 elevato alla nuova potenza
    //     valore = (int)Math.pow(2,potenza); //calcola 2 elevato alla potenza


//Alternativa
        while (valore <= 1000) {
            System.out.println("2^" + potenza + " = " + valore);
            valore *= 2;   // ogni volta moltiplichi per 2, è come valore = valore *2
            potenza++;
        }
    }

    }

