import java.util.Scanner;

public class App {
    //zad 1b
    public static void uzupelnij(int[] lista) {
        int wartosc = 40;
        for(int i = 0 ; i < lista.length; i++){
            lista[i] = wartosc--;
        }
    }    
     //zad 1c
     public static void wypisz(int[] lista) {
        for(int i = 0 ; i < lista.length; i++){
            System.out.println("wartosc " + (i+1) + " jest równa: " + lista[i]);
        }
    }    
    
    //zad 2b
    public static void podaj_wartosci(String[] lista) {
        Scanner scan = new Scanner(System.in);
        for(int i= 0; i <lista.length; i++){

            System.out.print("podaj "+ (i+1) +" wartosc: ");
            lista[i] = scan.nextLine();
        }
        scan.close();
    }    
    
    //zad 2c
    public static void wyswietla_od_konca(String[] lista) {
        for(int i= lista.length-1; i >=0; i--){
            System.out.println("wartosc nr "+ (i+1) +" = " + lista[i]);
        }
    }    
    
    //zad 3a
    public static void wypisz(String imie) {
        System.out.println(imie);
  
    }   
    
    //zad 3b
    public static void wypisz_dwa(String imie, String nazwisko) {
        System.out.println(imie+" "+ nazwisko);

    }    
    //zad 3c
    public static void wypisz_trzy(String imie, String nazwisko, int wiek) {
        System.out.println(imie+" "+ nazwisko + " " + wiek);

    }


    //zad 4a
    public static int suma(int a, int b) {
        return a+b;
    }    
    
    //zad 4b przymie dowolna ilosc zatem i 3...
    public static int suma_trzy(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) throws Exception {
        

       /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */
        //zad 1a
        int[] lista = new int[20];
        //zad 1d
        uzupelnij(lista);
        wypisz(lista);


        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        String[] lista_str = new String[6];
        podaj_wartosci(lista_str);
        wyswietla_od_konca(lista_str);

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        wypisz("Karol");
        wypisz_dwa("Karol", "Frankowski");
        wypisz_trzy("Karol", "Frankowski", 12);


        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

        //4c
        System.out.println("suma(2, 2) = " + suma(2, 2));
        System.out.println("suma_trzy(2, 2, 2) = " + suma_trzy(2,2,2));



    }
}
