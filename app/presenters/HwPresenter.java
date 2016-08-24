package presenters;


import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class HwPresenter extends Controller{

    public Result closeUploadBox(){
        return ok(closeuploadbox.render());
    }
}
