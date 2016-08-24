package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Expr;
import presenters.GradePresenter;
import models.Comment;
import models.Grade;

import java.util.List;

public class Hw {

    private GradePresenter gradePresenter;

    public List<Comment> getComments(models.Hw hw) {
        return Ebean.createQuery(Comment.class).where(Expr.eq("eventId", hw.id)).findList();

    }

    public List<Grade> getGrades() {
        return Ebean.createQuery(Grade.class).findList();
    }
}
