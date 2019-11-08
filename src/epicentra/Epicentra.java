package epicentra;

import java.util.Scanner;

public class Epicentra {
    int[] probki;
    int maxNaciec;
    Scanner scanner =new Scanner(System.in);
    void wczytajDaneZKonsoli(){

        wczytajLiczbenacieci();
        wczytajProbki();


    }
    void wczytajProbki(){
        System.out.println("Podaj probki: ");
        String linia= scanner.nextLine();
        String podzielone[] = linia.split(" ");
        probki= new int[podzielone.length];
        for (int i = 0; i < probki.length ; i++) {
            probki[i]= Integer.valueOf(podzielone[i]);
        }
    }
    void wczytajLiczbenacieci(){
        System.out.println("Podaj maksymalna liczbe naciec: ");
         maxNaciec= Integer.valueOf(scanner.nextLine());
    }
    void policzNaciecia(){
        int przedostatnie=0;
        int ostatnie=-1;
        int liczbaNaciec=0;
        for (int i=1; i<probki.length-1;i++){
           if (czyEpicentrum(i) && czyZachowanaOdleglosc(i,ostatnie,przedostatnie)){
               if (ostatnie!=-1){
                   przedostatnie=ostatnie;
               }
               ostatnie=i;
               liczbaNaciec++;
           }
        if (maxNaciec==liczbaNaciec) break;
        }
        System.out.println("Odpowiedz: " + liczbaNaciec);
    }

    private boolean czyZachowanaOdleglosc(int i,int ostatnie, int przedostanie) {
        if (ostatnie!=-1 && przedostanie!=0){
            return i-ostatnie >= ostatnie- przedostanie;
        }
        else return true;
    }

    private boolean czyEpicentrum(int i) {
        return probki[i]>probki[i-1] && probki[i]>probki[i+1];
    }

    public static void main(String[] args) {
        Epicentra epicentra= new Epicentra();
        epicentra.wczytajDaneZKonsoli();
        epicentra.policzNaciecia();
        epicentra.inneLiczenie();
        epicentra.scanner.close();
    }
    void inneLiczenie(){
        int ileNaciec=0;
        int skok=0;
        for (int i = znajdzPierwszeEpicentrum(); i <probki.length -1 ; i++) {
            if (czyEpicentrum(i)) {
                ileNaciec++;
                if (maxNaciec==ileNaciec) break;
                i= i+ skok;
            }
           else skok++;
        }
        System.out.println(ileNaciec);
    }
    int znajdzPierwszeEpicentrum(){
        int i = 1;
        while (!czyEpicentrum(i)) i++;
        return i;
    }
}
