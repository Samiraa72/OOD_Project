package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Expr;
import models.Comment;

import java.util.List;

public class Event {

    public List<Comment> getComments(models.Hw hw) {
        return Ebean.createQuery(Comment.class).where(Expr.eq("eventId", hw.id)).findList();

    }
}
