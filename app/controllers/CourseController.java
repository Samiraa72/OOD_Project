package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Expr;
import models.Grade;
import models.Hw;
import models.User;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import java.util.List;

public class CourseController extends Controller {

    public Result hwPage(){
        return ok(hwpage.render());
    }

}
