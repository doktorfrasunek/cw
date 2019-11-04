package zaawanoswaneObiekty.ZOO;

public class Bear extends Animal {
    int furLength;

    public Bear(String name, float weight, int furLength) {
        super(name, weight);
        this.furLength = furLength;
    }

    @Override
    void introduce() {
        System.out.printf("%d: I'm a bear. My name is %s. I weight %.2f and my fur length is %d",getId(), name,weight,furLength);
    }
}
