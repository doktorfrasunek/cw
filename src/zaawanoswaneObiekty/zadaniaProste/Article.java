package zaawanoswaneObiekty.zadaniaProste;

import java.util.ArrayList;
import java.util.List;

public class Article {
    private String name;
    private int price;
    private double marza;

    public Article(String name, int price, double marza) {
        this.name = name;
        this.price = price;
        this.marza = marza;
    }

    public double getPrice() {
        return price + price*marza;
    }

    public static void main(String[] args) {
        List<Article> shopingList = new ArrayList<>();
        shopingList.add(new Article("prod1",100,0.5));
        shopingList.add(new Article("prod2",200,0.25));
        shopingList.add(new Article("prod3",200,0.50));
        float[] discount= new float[]{0f,0.1f,0.15f,0.25f};
        for (int i = 0; i < discount.length; i++) {
            double sum=0;
            for (Article art:
                 shopingList) {
                sum+= art.getPrice() * (1-discount[i]);
            }
            System.out.println("Articles' price after: " + discount[i]+" : " + String.format("%.02f", sum));
        }

    }
}
