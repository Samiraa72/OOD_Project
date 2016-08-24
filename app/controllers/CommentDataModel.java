package controllers;

import com.avaje.ebean.Ebean;
import models.Comment;

public class CommentDataModel {

    public void add(Comment comment){
        Ebean.insert(comment);
    }
}
