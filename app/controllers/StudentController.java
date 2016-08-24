package controllers;

import models.CoursePage;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import java.util.ArrayList;
import java.util.List;


public class StudentController extends Controller {

    public Result student1() {
        return ok(student1.render());
    }

    public Result coursePage(){
        return ok(coursepage.render());
    }

    public List<CoursePage> getCourses(long studentId){
        return new ArrayList<>();
    }

}
