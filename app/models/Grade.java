package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Grade extends Model {

    public Grade(Long id, int score, String time, long studentId, long courseId) {
        this.id = id;
        this.score = score;
        this.time = time;
        this.studentId = studentId;
        this.courseId = courseId;
    }

    @Id
    @Constraints.Min(10)
    public Long id;

    public String time;

    public long studentId;

    public int score;

    public long courseId;


    public static Finder<Long, Grade> find = new Finder<Long, Grade>(Grade.class);
}
