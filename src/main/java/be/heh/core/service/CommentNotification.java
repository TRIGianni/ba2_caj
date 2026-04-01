package be.heh.core.service;
import be.heh.core.model.Comment;

public interface CommentNotification {
    void sendComment(Comment comment);
}
