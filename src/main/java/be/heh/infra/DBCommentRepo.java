package be.heh.infra;

import be.heh.core.model.Comment;
import be.heh.core.service.CommentRepository;
import org.springframework.stereotype.Component;

@Component
class DBCommentRepo implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.printf(
                "INSERT INTO comments (author, text) VALUES (%s, %s)%n",
                comment.getAuthor(),
                comment.getText()
        );
    }
}
