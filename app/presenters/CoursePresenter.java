package presenters;


import controllers.GradeEnum;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class CoursePresenter extends Controller{

    public Result showCourse(){
        return ok(coursepage.render());
    }

    public Result getComments(){
        return ok(comments.render());
    }

    public Result showGrades(){
        return ok(grades.render());
    }

    public GradeEnum selectGradeItem(){
        return GradeEnum.HW;
    }

}
