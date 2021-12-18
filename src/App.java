public class App {
    public static void main(String[] args) throws Exception {
        
        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        for(int i =1; i > 0; i++){
            System.out.println("bez break iterowałbym w nieskończoność!");
            break;
        }

        int[] lista = {1,2,3,4,5,6,7,8,9};
        for(int wartosc : lista){
            int reszta = wartosc % 2;
            if(reszta == 1)
                continue;
            System.out.println("wartosc " + wartosc + " jest parzysta!");
        }

        for (int i=0; i < lista.length; i++){
            if (lista[i] == 5){
                System.out.println("znalazłem wartosc 5 pod indexem " + i + " -  opuszczam program!");
                return;
            }
            System.out.println("sprawdziłem index " + i + " który jest równy " + lista[i]);
        }   
        
        System.out.println("użytkownik ma brudne stopy - ale nie muszę sie martwić tym printem bo i tak go nie zobaczy!");
        System.out.println("no chyba ze w liscie nie bedzie 5... to bede miał przechlapane. ");

    }
}
