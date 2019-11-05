package blog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Post extends Entry {
    List<Comment> comments= new ArrayList<>();
    public Post( User author, String content) {
        super( author, content);
    }

   void comment(Comment comment){
        comments.add(comment);
   }
}
