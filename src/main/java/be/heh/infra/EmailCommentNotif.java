package be.heh.infra;

import be.heh.core.model.Comment;
import be.heh.core.service.CommentNotification;
import org.springframework.stereotype.Component;

@Component
class EmailCommentNotif implements CommentNotification {
    @Override
    public void sendComment(Comment comment) {
        System.out.printf(
                "mail to gianni.tricarico at heh.be : %s texte: %s%n",
                comment.getAuthor(),
                comment.getText()
        );
    }
}
