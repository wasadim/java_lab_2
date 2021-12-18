public class App {
    public static void main(String[] args) throws Exception {
        
        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        /* cw.1 pętle while */
        /* nr indexu 57660 */

        int i = 1000;
        int digits = 60;
        do{
            int reszta = i % digits;
            if (reszta == 0){
                
             System.out.println("liczba "+ i +" podzielna przez "+ digits);
            }
            i--;
        }while(i != 0);

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        /*zad 2a*/


        int[] lista_int = { 1, 2, 3, 4, 5};
        int idx_int = 0;
        while(true){
            try{
                System.out.println(lista_int[idx_int]);  
            }
            catch(Exception e){ 
            break; 
            }
            idx_int++;
        }

        /*zad 2b*/
        double[] lista_double = { 1.1, 2.2, 3.3, 4.4, 5.5};
        int idx_double = 0;
        while(idx_double < lista_double.length){
            System.out.println(lista_double[idx_double]);  
            idx_double++;
        }   
        
        /*zad 2c*/
        String[] lista_string = { "a","b","c","d","e"};
        int idx_string = 0;
        while(idx_string <= 4){
            System.out.println(lista_string[idx_string]);  
            idx_string++;
        }
        

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        while(true){
            System.out.println("ten tekst zostanie wyswietlony raz");
            break;
        }
        boolean nieprawda = false;
        while(nieprawda){
            System.out.println("ten tekst nie zostanie wyswietlony");
            /*kompilator nie pozwala na while(false) - stąd workaround */
            break;
        };

        while(true){
            System.out.println("a ten tekst zawiesi terminal. do czasu kliknięcia ctrl+c");
        }
    }
}
