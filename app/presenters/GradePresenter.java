package presenters;

import models.Grade;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class GradePresenter extends Controller {

    public Result showGrades(){
        return ok(grades.render());
    }

    public Result showSelectedGrade(Grade[] grades){
        String[] gradesContent = new String[grades.length];
        int counter = 0;
        for (Grade grade : grades){
            gradesContent[counter] = grade.score +"";
            counter ++;
        }
        return ok(grades.render());
    }
}
