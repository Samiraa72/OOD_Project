package controllers;

import java.util.List;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Expr;
import models.User;

public class Helpers {
    public static String validateUser(String username, String password) {
       try {
            if (username == null || username.length() == 0 || password == null || password.length() == 0)
                return "نام کاربری و رمز عبرو ضروری هستند";

            List<User> matchedUsers = Ebean.createQuery(User.class).where(
                    Expr.and(Expr.eq("username", username),
                            Expr.eq("password", password)
                    )
            ).findList();
            if (matchedUsers != null && matchedUsers.size() == 0)
                return "نام کاربری یا رمز عبور اشتباه است";

            return "";
       } catch (Exception e) {
            return "خطا در اتصال به پایگاه داده";
       }
    }

}
