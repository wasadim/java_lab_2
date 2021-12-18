import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class App {

    //1a
    public static void podaj_wartosci(ArrayList<String> lista, Scanner scan) {
      
        for(int i= 0; i <5; i++){
            System.out.print("podaj nazwę zwierzaka: ");
            lista.add(scan.nextLine());
        }
        // scan.close();
    }    

     //zad 1b
     public static void wypisz(ArrayList<String> lista) {
        for(String zwierz: lista){
            System.out.println(zwierz);
        }
    }    
    public static void main(String[] args) throws Exception {
        

              /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
          //1a
          Scanner scan = new Scanner(System.in);
          ArrayList<String> zwierzaki = new ArrayList<String>();
          podaj_wartosci(zwierzaki, scan);
          wypisz(zwierzaki);
          int size = zwierzaki.size();
          do{
              zwierzaki.remove(zwierzaki.size()-1);
          }while(zwierzaki.size()+2 != size);
          zwierzaki.add("słoń");
          zwierzaki.add("słoń");
          zwierzaki.add("słoń");
          wypisz(zwierzaki);
          System.out.println("wielkość listy to: " + zwierzaki.size());
          Collections.sort(zwierzaki, Collections.reverseOrder());
          wypisz(zwierzaki);

         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        Set<Integer> zbior = new TreeSet<>();
        // Scanner scaner = new Scanner(System.in);
        for(int i= 0; i < 10; i++){
            System.out.print("podaj wartosc całkowitą: ");
            int wartosc = scan.nextInt(); 
            zbior.add(wartosc);
        }
        scan.close();
        System.out.println(zbior);
        for(int val: zbior){
            System.out.println(val);
        }

    }
}
