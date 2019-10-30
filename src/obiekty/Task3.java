package obiekty;

import java.time.LocalDate;

 class Zapytanie {

     String pytajacy;
     String email;
     String opis;
     LocalDate data;
    boolean czyStarszaNiz2Tygodnie(){
        return data.isBefore(LocalDate.now().minusDays(14L));
    }
     public Zapytanie(String pytajacy, String email, String opis, LocalDate data) {
         this.pytajacy = pytajacy;
         this.email = email;
         this.opis = opis;
         this.data = data;
     }
 }
public class Task3{

    public static void main(String[] args) {
        Zapytanie zapytanie1= new Zapytanie(
                "Jerzyk",
                "jerzyk@wal.pl",
                "Czemu wróbelek utyka?",
                LocalDate.parse("2019-10-23")
        );
        Zapytanie zapytanie2= new Zapytanie(
                "Jerzyk",
                "jerzyk@wal.pl",
                "Czemu wróbelek utyka?",
                LocalDate.parse("2019-10-10")
        );
        System.out.println(zapytanie1.czyStarszaNiz2Tygodnie());
        System.out.println(zapytanie2.czyStarszaNiz2Tygodnie());
    }

}
