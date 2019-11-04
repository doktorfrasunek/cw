package zaawanoswaneObiekty.zadaniaProste;

import java.util.*;
import java.util.stream.Collectors;

public class Flower {
    private String name;
    private int height;
    private boolean isBloomed;

    public Flower(String name) {
        this.name = name;
        this.height = 0;

    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    void grow(int distance){
        if (!isBloomed){
            height+= 6-distance;
            if(height>=30){
                isBloomed=true;
                height=30;
            }
        }
    }

    public boolean isBloomed() {
        return isBloomed;
    }

    public static void main(String[] args) {
        Map<Integer,Flower> map= new HashMap<>();
        map.put(2,new Flower("Tulip"));
        map.put(3,new Flower("Tulip"));
        map.put(4,new Flower("Violet"));
        map.put(5,new Flower("Rose"));

        for (Integer i:
                map.keySet()
             ) {
            Flower flower= map.get(i);
            System.out.println(flower.getName()+ " is " + i + " away from and its height is " + flower.getHeight()
            + " -----> " + flower.isBloomed);
        }

        for (int i = 0; i < 9; i++) {
            for (Map.Entry<Integer,Flower> entry:
            map.entrySet()) {
                entry.getValue().grow(entry.getKey());
            }}

            System.out.println("After 10 days: ");
            List<Map.Entry<Integer,Flower>> list  = map.entrySet()
                    .stream()
                    .sorted(Comparator.comparingInt((Map.Entry<Integer, Flower> e) -> e.getValue().getHeight()).reversed())
                    .collect(Collectors.toList());


            for (Map.Entry<Integer,Flower> entry:list) {
                Flower flower= entry.getValue();
                Integer i = entry.getKey();
                System.out.println(flower.getName()+ " is " + i + " away from and its height is " + flower.getHeight()
                        + " -----> " + flower.isBloomed);

            }
        }
    }

