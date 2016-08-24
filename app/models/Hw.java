package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hw extends Model {

    public Hw(Long id, String subject, String deadline, String submitTime, String file, long courseId) {
        this.id = id;
        this.subject = subject;
        this.deadline = deadline;
        this.submitTime = submitTime;
        this.file = file;
        this.courseId = courseId;
    }

    @Id
    @Constraints.Min(10)
    public Long id;

    public String subject;

    public String deadline;

    public String submitTime;

    public String file;

    public long courseId;


    public static Finder<Long, Hw> find = new Finder<Long, Hw>(Hw.class);
}
