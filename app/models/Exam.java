package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exam extends Model {

    public Exam(Long id, String subject, String time, String file, String duration, long courseId) {
        this.id = id;
        this.subject = subject;
        this.time = time;
        this.file = file;
        this.duration = duration;
        this.courseId = courseId;
    }

    @Id
    @Constraints.Min(10)
    public Long id;

    public String subject;

    public String time;

    public String file;

    public String duration;

    public long courseId;


    public static Finder<Long, Exam> find = new Finder<Long, Exam>(Exam.class);
}
