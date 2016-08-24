package presenters;

import models.Comment;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class CommentPresenter extends Controller{

    public Result showComments(Comment[] comments){
        String[] commentsContent = new String[comments.length];
        int counter = 0;
        for (Comment comment : comments){
            commentsContent[counter] = comment.content;
            counter ++;
        }
        return ok(comments.render());
    }

    public Result add(Comment comment){
        String content = comment.content;
        return ok(comments.render(content));
    }

}
