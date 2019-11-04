package zaawanoswaneObiekty.zadaniaProste;

import java.util.HashMap;
import java.util.Map;

public class MedicamentNote {
    private String name;
    private int amount;
    private int price;

    public MedicamentNote(String name, int amount, int price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Map<Integer,MedicamentNote> map= new HashMap<>();
        map.put(3, new MedicamentNote("lek1",1,5));
        map.put(5, new MedicamentNote("lek2",2,12));
        map.put(7, new MedicamentNote("lek3",1,12));
        map.put(12, new MedicamentNote("lek3",1,12));
        System.out.println("Medicaments more expensive than 10: ");
        int sum=0;
        for (Integer i:
            map.keySet()) {
            if (map.get(i).getPrice()>10){
                System.out.println(map.get(i).name + " costs " + map.get(i).getPrice() + " must take "+map.get(i).getAmount()+ " pils on " + i);
            }
            sum+= map.get(i).price*12*map.get(i).getAmount();
        }

        System.out.print("Remember to take pills on: ");
        for (Integer i:
             map.keySet()) {
            System.out.print( i + " ");
        }
        System.out.println();
        System.out.println("annual cost: " + sum);

    }
}
