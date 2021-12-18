import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */




         /* ćw.2 pętle for */
        /* nr indexu 57660 */
        int digits = 6; // dzielenie przez zero raczej sie nie uda 
            for (int i = 100; i >= 0; i--){
                int reszta = i % digits;
                if (reszta == 0){ 
                    System.out.println("liczba "+ i +" podzielna przez "+ digits);
                }
            }


        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */


        Scanner scan = new Scanner(System.in);
        int[] lista = new int[5];
        for (int i=0; i  <5; i++){

            System.out.print("podaj " + (i+1) + " liczbę: ");
            lista[i] = scan.nextInt();
        }
        scan.close();
        int enumerate = 1;
        for (int wartosc : lista) 
        { 
            System.out.println("element nr: " + enumerate + " to: " + wartosc);
            enumerate++;
        }
    }
}
