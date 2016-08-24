package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CoursePage extends Model {

    public CoursePage(Long id, String term, String time, String name, int number, String professor){
        this.id = id;
        this.time = time;
        this.name = name;
        this.number = number;
        this.term = term;
        this.professor = professor;
    }
    
    @Id
    @Constraints.Min(10)
    public Long id;

    public String time;

    public  String term;

    public String name;

    public int number;

    public String professor;




    public static Finder<Long, CoursePage> find = new Finder<Long, CoursePage>(CoursePage.class);
}
