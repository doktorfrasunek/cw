package kartkowka;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Post {
    private String title;
    private String author;
    private List<Tag> tagList = new ArrayList<>();

    Post(String title, String author) {
        this.title = title;
        this.author = author;

    }

    void addTag(Tag tag) {
        if (!tagList.contains(tag))
            tagList.add(0, tag);
        tagList.sort(Comparator.comparing(Tag::getTitle, String::compareTo));
        tagList.sort(Comparator.comparing(Tag::getTitle));
        tagList.sort(Comparator.naturalOrder());
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", tagList=" + tagList +
                '}';
    }

    public static void main(String[] args) {
        Post post = new Post("Programowanie jest super", "michalos");
        post.addTag(new Tag("programowanie"));
        post.addTag(new Tag("java"));
        post.addTag(new Tag("programowanie"));
        System.out.println(post);
    }
}

class Tag implements Comparable {
    private String title;

    Tag(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return title.equals(tag.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Tag{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}