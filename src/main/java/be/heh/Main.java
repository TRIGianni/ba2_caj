package be.heh;

import be.heh.core.model.Comment;
import be.heh.core.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(
                ProjectConfig.class);

        var comment = new Comment("Bonjour", "Monde");

        var cs = context.getBean(CommentService.class);
        cs.publishComment(comment);
    }
}
