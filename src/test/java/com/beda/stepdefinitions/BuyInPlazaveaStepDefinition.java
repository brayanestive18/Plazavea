package com.beda.stepdefinitions;

import com.beda.tasks.AddTheProduct;
import com.beda.tasks.OpenTheBrowser;
import com.beda.tasks.SearchInPlazavea;
import com.beda.userinterfaces.PlazaveaHomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

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
    public void searchTheTelevisor(String nameProduct) {
        brayan.attemptsTo(SearchInPlazavea.theProduct(nameProduct));
    }

    @And("^add the product in shopping car$")
    public void addTheProductInShoppingCar() {
        brayan.attemptsTo(AddTheProduct.inShoppingCar());
    }

    @Then("^I validate that product is in shopping car$")
    public void iValidateThatProductIsInShoppingCar() {

    }

    @After
    public void after () {

    }

}
