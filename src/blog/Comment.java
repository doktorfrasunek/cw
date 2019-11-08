package blog;

import java.time.LocalDate;

public class Comment extends Entry{

    public Comment(  User author, String content) {
        super( author, content);
    }
}
