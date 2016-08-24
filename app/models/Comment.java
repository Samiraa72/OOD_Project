package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment extends Model {

    public Comment(Long id, String content, long autherId, int rate, long eventId){
        this.id = id;
        this.autherId = autherId;
        this.content = content;
        this.rate = rate;
    }
    
    @Id
    @Constraints.Min(10)
    public Long id;

    public long autherId;

    public String content;

    public int rate;

    public long eventId;




    public static Finder<Long, Comment> find = new Finder<Long, Comment>(Comment.class);
}
