package net.onlinenotepad.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.Answer;
import task.ShippingTv;
import utils.MyWebDriverFactory;

import static ui.ItemDetails.ABOUT_THIS_ITEM_TITLE;

public class stepDefs {

      public static Actor UserWeb;

    @Managed(uniqueSession = true)
    public WebDriver hisBrowser;


    @Before
    public void prepareStage() {

        UserWeb = Actor.named("The user");
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that the user wants to log in to the Amazon site$")
    public void that_the_user_wants_to_log_in_to_the_Amazon_site() {
        UserWeb.can(BrowseTheWeb.with(MyWebDriverFactory.web().onPage()));
    }

   @When("^the user wants to buy a product$")
    public void the_user_wants_to_buy_a_product() {
        UserWeb.attemptsTo(ShippingTv.user());
    }

    @Then("^the user can see the next text (.*)$")
    public void the_user_can_see_the_next_text(String message) {
        UserWeb.should(GivenWhenThen.seeThat(Answer.message(
                ABOUT_THIS_ITEM_TITLE), Matchers.equalTo(message)));
   }
}
