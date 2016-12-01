package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

//Import models
import models.*;

public class HomeController extends Controller {

    public Result index(String name) {
        return ok(index.render("Welcome to the Home page", name));
    }

    public Result about() {
        return ok(about.render());
    }

    public Result products() {

        //Get the list of products
        List<Product> productsList = Product.findAll();

        //Render the list products view, passing parameters
        return ok(products.render(productsList));
    }

}


