package zaawanoswaneObiekty.zadaniaProste;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Animal {
    private String name;
    private String sound;
    private boolean isLoud;

    public Animal(String name, String sound, boolean isLoud) {
        this.name = name;
        this.sound = sound;
        this.isLoud = isLoud; }

    public boolean isLoud() {
        return isLoud;
    }

    void speak(int times){
        StringBuilder result= new StringBuilder();
        result.append(name);
        result.append(" :");
        String sound = isLoud ?
                this.sound.toUpperCase():
                this.sound.toLowerCase();
        for (int i = 0; i < times; i++) {
           result.append(" ");
            result.append(sound);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<Animal> animals= new ArrayList<>();
        animals.add(new Animal("Dog", "Woff", true));
        animals.add(new Animal("Sheep", "Bee", true));
        animals.add(new Animal("Cat", "Meow", false));
        animals.add(new Animal("Cow","Muu",true));
        animals.add(new Animal("Frog","Croak",false));
        Random random = new Random();
        System.out.println("Loud Animals:");
        for (Animal ani :
                animals) {
            if (ani.isLoud){
                ani.speak(random.nextInt(5)+1);
            }
        }
        System.out.println("Silent Animals:");
        for (Animal ani :
                animals) {
            if (!ani.isLoud){
                ani.speak(random.nextInt(5)+1);
            }
        }
    }
}
