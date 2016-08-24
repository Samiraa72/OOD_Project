package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Expr;
import models.Comment;
import models.Grade;
import models.Hw;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import java.util.List;

public class HwController extends Controller {


    public Result comments(){
        return ok(comments.render());
    }

    public List<Comment> getComments(Hw hw){
        return Ebean.createQuery(Comment.class).where(Expr.eq("eventId", hw.id)).findList();

    }
}
