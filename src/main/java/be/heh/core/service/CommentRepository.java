package be.heh.core.service;

import be.heh.core.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
