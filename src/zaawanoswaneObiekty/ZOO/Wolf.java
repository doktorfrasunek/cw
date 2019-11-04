package zaawanoswaneObiekty.ZOO;

public class Wolf extends Animal implements Canine {
    int fangLength;

    public Wolf(String name, float weight, int fangLength) {
        super(name, weight);
        this.fangLength = fangLength;
    }

    @Override
    void introduce() {
        System.out.printf("%d: I'm a tiger. My name is %s. I weight %.2f and my fang length is %d",getId(),name,weight,fangLength);
    }

    @Override
    public void bark() {
        System.out.println("BARK, BARK, BARK");
    }
}
