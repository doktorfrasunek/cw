package zaawanoswaneObiekty.ZOO;

public class Dog extends Animal implements Canine {
    @Override
    void introduce() {
        System.out.printf("%d: I'm a dog. My name is %s. I weight %.2f ",getId(),name,weight);
    }

    @Override
    public void bark() {
        System.out.println("bark bark bark");
    }
    void sitPretty(){
        System.out.println(name+ " sits pretty.");
    }

    public Dog(String name, float weight) {
        super(name, weight);
    }
}
