import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

    /* ćwiczenie 3 switch case */

    /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
        i za pomocą switch case default ma określić czy:
        a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
        b) program który określi czy liczba jest podzielna przez 7
        */

    /* zad.1a*/


        Scanner scan = new Scanner(System.in);
        System.out.print("podaj liczbę: ");
        int liczba = scan.nextInt();
        scan.close();
        int reszta = liczba % 2;
        switch(reszta) {
            case 0:
                System.out.println("liczba jest parzysta!");
              break;
            case 1:
                System.out.println("liczba jest nieparzysta!");
              break;
            default:
            System.out.println("innej opcji nie widzę!");
          }

          
    /* zad.1b*/
        reszta = liczba % 7;
        switch(reszta) {
            case 0:
                System.out.println("liczba jest podzielna przez 7!");
              break;
            default:
                System.out.println("liczba jest niepodzielna przez 7!");
          }

    /* zad.2
        a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
        "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
        b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
        */

        /*zad.2a*/
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] tablica = {0, 0, 0, 0, 0, 0};
        /* toCharArray() - metoda zamienia String na tablicę char[] */
        for (char zmiennaChar : text.toCharArray()) {
            switch (zmiennaChar) {
                case 'o':
                    ++tablica[0];
                    break;
                case 'p':
                    ++tablica[1];
                    break;
                case 'x':
                    ++tablica[2];
                    break;
                case 'z':
                    ++tablica[3];
                    break;                
                case 'q':
                    ++tablica[4];
                    break;
                default:
                    ++tablica[5];
            }
        }
        String[] opcje = {"o", "p", "x", "z", "q"};
        
        for(int i =0; i < opcje.length; i++){
            System.out.println("literka \"" + opcje[i] + "\" wystąpiła " + tablica[i] + " razy");
        }

        
        /*zad.2b*/
            System.out.println("inne literki wystąpiły " + tablica[5] + " razy");
    }
}
