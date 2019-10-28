package Kolekcje;

import java.util.Arrays;
import java.util.List;

public class Task6and7 {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList(
                new String[]{"czerwony",
                        "zielony",
                        "biały",
                        "żółty"});
        for (String color :
                colors) {
            System.out.println(color);
        }
        System.out.println(findIndexOfColor("zielony", colors));
        System.out.println(findIndexOfColor("fioletowy", colors));
    }
        static int findIndexOfColor (String color, List<String> colors){
        int index=-1;
        for (int i = 0; i <colors.size() ; i++) {
                if (colors.get(i).equals(color)){
                    index=i;
                    break;
                }
            }
        return  index;
        }




}
