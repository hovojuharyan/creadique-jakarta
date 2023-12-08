package just.fun.creadique.domain.data;

import just.fun.creadique.domain.entity.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestDataFactory {

    public static Critique aCritique(int id, String title, User owner) {
        return new Critique(id, title, "DESCRIPTION", owner,
                1.0, "IMAGES", "CONTENT", LocalDate.now(), LocalDate.now(),
                new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }

    public static Comment.CommentBuilder aComment(int id, User writer, Critique critique) {
        return Comment.builder()
                .id(id)
                .writer(writer)
                .critique(critique)
                .parent(null)
                .rating(1.0)
                .replyCount(0)
                .writtenAt(LocalDate.now());
    }

    public static User aUser(int id, String name) {
        return new User(id, name, "EMAIL", "PASSWORD", "INTRO_DESC",
                LocalDate.now(), UserStatus.PENDING, 1.0, 1, 1, 1,
                "IMAGE", LocalDate.of(2001, 1, 1));
    }

    public static Topic aTopic(int id, String title) {
        return new Topic(id, title, "DESCRIPTION", 1, "IMAGE",
                1, LocalDate.now());
    }

}
