package zaawanoswaneObiekty.ZOO;

import java.util.ArrayList;
import java.util.List;

abstract public class Animal {
    private static int nextID=1;
    private int id;
    String name;
    float weight;
    abstract void introduce();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Animal(String name, float weight) {
        this.id = nextID++;
        this.name = name;
        this.weight = weight;
    }

    public static void main(String[] args) {
        List<Animal> animals= new ArrayList<>();
        List<Animal> howlers= new ArrayList<>();
        animals.add(new Bear("Yogi",200,40));
        animals.add(new Tiger("Jataka",125,50));
        Dog scooby=  new Dog("Scooby",30);
        Wolf howler=  new Wolf("Howler",70,40);
        animals.add(howler);
        animals.add(scooby);
        howlers.add(howler);
        howlers.add(scooby);
        howlers.add(animals.get(0));

        for (Animal animal:
             animals) {
            animal.introduce();
            System.out.println();
        }
        for (Animal canine:howlers){
            System.out.printf("My name is %s and i'm barking ", canine.getName());
            if (canine instanceof Canine) {
                ((Canine) canine).bark();
            }
            if (canine instanceof Dog){
                ((Dog) canine).sitPretty();
            }
        }
    }
}
