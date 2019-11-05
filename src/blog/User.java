package blog;

public class User {
    static int nextID;
    int id;
    String firstName;
    String lastName;
    String nickName;

    public User( String firstName, String lastName, String nickName) {
        this.id = nextID++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
    }
}
