package be.heh.core.service;

import be.heh.core.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    protected CommentRepository repo;
    protected CommentNotification notifProvider;

    public CommentService(CommentRepository repo, CommentNotification notifProvider) {
        this.repo = repo;
        this.notifProvider = notifProvider;
    }

    public void publishComment(Comment c) {
        this.notifProvider.sendComment(c);
        this.repo.storeComment(c);
    }
}
