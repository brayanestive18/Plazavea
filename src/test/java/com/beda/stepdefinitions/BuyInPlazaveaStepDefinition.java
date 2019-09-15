package com.beda.stepdefinitions;

import com.beda.questions.TheResult;
import com.beda.tasks.AddTheProduct;
import com.beda.tasks.OpenTheBrowser;
import com.beda.tasks.SearchInPlazavea;
import com.beda.userinterfaces.PlazaveaHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class BuyInPlazaveaStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver webDriver;

    private Actor brayan = Actor.named("Brayan");
    private PlazaveaHomePage plazaveaHomePage;

    @Before
    public void setup() {
        brayan.can(BrowseTheWeb.with(webDriver));
    }

    @Given("^that I enter in website$")
    public void thatIEnterInWebsite() {
        brayan.attemptsTo(OpenTheBrowser.at(plazaveaHomePage));
    }

    @When("^search the (.*)$")
    public void searchThe(String nameProduct) {
        brayan.attemptsTo(SearchInPlazavea.theProduct(nameProduct));
    }

    @And("^add (.*) in shopping car$")
    public void addTheProductInShoppingCar(String nameProduct) {
        brayan.attemptsTo(AddTheProduct.inShoppingCar());
    }

    @Then("^I validate that (.*) is in shopping car$")
    public void iValidateThatProductIsInShoppingCar(String expectResult) {
        brayan.should(seeThat(TheResult.is(), equalTo(expectResult)));
    }

}
