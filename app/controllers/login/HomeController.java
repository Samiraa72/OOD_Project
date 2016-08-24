package controllers.login;

import controllers.Helpers;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import play.mvc.Http.Cookie;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render(""));
    }

    public Result login() {
        DynamicForm form = Form.form().bindFromRequest();
        String username = form.get("username");
        String password = form.get("password");
        if (authenticate(username, password)) {
            return redirect("/student1");//.withCookies(new Cookie("user", username));
        }
        return ok(index.render(Helpers.validateUser(username, password)));
    }

    public boolean authenticate(String username, String password){
        String msg = Helpers.validateUser(username, password);
        if(msg.isEmpty()){
            return  true;
        }
        return false;
    }

}
