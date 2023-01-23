package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.navigation.NavigateTo;

public class LoginDefinitions {

    @Given("{actor} is a {}")
    public void userNavigatesToHomePage(Actor actor, String customerType){
        actor.wasAbleTo(NavigateTo.theSauceHomePage());
    }

    @When("{actor} tries to login")
    public void userTriesToLogin(Actor actor){

    }

    @Then("{actor} should see the product list")
    public void userShouldSeeTheProductList(Actor actor){

    }
}
