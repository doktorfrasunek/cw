package rekurencja;

public class simpleExample {
    public static void wypisz(int i){
        if(i<0){
            return;
        }

        System.out.println(i--);
        wypisz(i);
    }
    public static void wypisz2(int i){
        if(i<0){
            return;
        }
        wypisz(i-1);
        System.out.println(i);

    }
    private static void wypisz3(int i){
        if(i>20){
            return;
        }
        System.out.println(i++);
        wypisz3(i);

    }
    public static void wypisz4(int i){
        if(i>100){
            return;
        }

        if(i%20==0){
            System.out.print("Liczba podzielna przez 5 i 4 : ");
        }
        else if(i%5==0){
            System.out.print("Liczba podzielana przez 5: ");
        }
        else if(i%4==0){
            System.out.print("Liczba podzielana przez 4: ");
        }

        System.out.println(i++);
        wypisz4(i);
    }

    public static void main(String[] args) {
       // wypisz(10);
        // wypisz2(10);
        //wypisz3(-20);
        wypisz4(0);
    }
}
