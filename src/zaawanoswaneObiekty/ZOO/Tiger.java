package zaawanoswaneObiekty.ZOO;

public class Tiger extends Animal {
    int clawLength;
    @Override
    void introduce() {
        System.out.printf("%d: I'm a tiger. My name is %s. I weight %.2f and my claw length is %d",getId(),name,weight,clawLength);
    }

    public Tiger(String name, float weight, int clawLength) {
        super(name, weight);
        this.clawLength = clawLength;
    }
}
