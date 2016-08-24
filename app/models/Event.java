package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Event extends Model {

    public Event(Long id, String subject, String content, String time, long autherId, long courseId) {
        this.id = id;
        this.subject = subject;
        this.content = content;
        this.time = time;
        this.autherId = autherId;
        this.courseId = courseId;
    }

    @Id
    @Constraints.Min(10)
    public Long id;

    public String subject;

    public String time;

    public String content;

    public long autherId;

    public long courseId;


    public static Finder<Long, Event> find = new Finder<Long, Event>(Event.class);
}
