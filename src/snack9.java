public class snack9 {
    //Calcola la somma e la media dei primi 10 numeri.

public static void main(String[] args) {

    int [] numeri = {1,2,3,4,5,6,7,8,9,10};

    int somma = 0;
    int media = 0;

  for (int i = 0;  i < numeri.length; i++){
    somma += numeri[i];
    media = somma / 10;
  }

System.out.println("la somma è" + " " + somma);
System.out.println("la media è" + " " + media);
}

}