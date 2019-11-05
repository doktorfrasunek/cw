package blog;

import java.time.LocalDate;

abstract public class Entry {
    static int nextID;
    int id;
    LocalDate posteDated;
    User author;
    String content;

    public Entry( User author, String content) {
        this.id = nextID++;
        this.posteDated = LocalDate.now();
        this.author = author;
        this.content = content;
    }
}
