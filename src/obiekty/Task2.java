package obiekty;




class Mem {
    String name;

    String url;
    String opis;
    boolean jestUlubiony;

    public void setUrl(String url) {
        String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        if (url.matches(regex)) this.url = url;


    }

    public Mem(String name, String url, String opis, boolean jestUlubiony) {
        this.name = name;
        setUrl(url);
        this.opis = opis;
        this.jestUlubiony = jestUlubiony;
    }
}
public class Task2{
    public static void main(String[] args) {
        Mem mem = new Mem("meme","ftp://meme.pl","meme of dank variety", true);
        System.out.println(mem.url);
    }

}