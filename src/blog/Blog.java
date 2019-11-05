package blog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<User> users = new ArrayList<>();
    List<Post> posts = new ArrayList<>();

    void publishPost(int userID, String content) {
        posts.add(new Post(
                users.get(userID), content));
    }

    void publishComment(int userID, int postId, String content) {
        posts.get(postId).
                comment(new Comment(users.get(userID), content));
    }
    void displayUserEntries(){

    }
}
