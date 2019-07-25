package com.beda.tasks;

import com.beda.userinterfaces.PlazaveaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SearchInPlazavea implements Task {

    private String nameProduct;

    public SearchInPlazavea(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    @Step("{0} search the product")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nameProduct).into(PlazaveaHomePage.FIELD_SEARCH),
                WaitUntil.the(PlazaveaHomePage.CANCEL_BUTTON_POPUP, isPresent()),
                Click.on(PlazaveaHomePage.CANCEL_BUTTON_POPUP),
                Enter.theValue(nameProduct).into(PlazaveaHomePage.FIELD_SEARCH),
                WaitUntil.the(PlazaveaHomePage.SEARCH_BUTTON, isPresent()),
                Click.on(PlazaveaHomePage.SEARCH_BUTTON)
        );
    }

    public static SearchInPlazavea theProduct (String nameProduct) {
        return instrumented(SearchInPlazavea.class, nameProduct);
    }

}
