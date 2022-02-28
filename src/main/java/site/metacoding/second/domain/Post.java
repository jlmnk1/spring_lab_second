package site.metacoding.second.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Post {
    public Post(int i, String string, String string2) {
    }

    private int id;
    private String title;
    private String content;
}
