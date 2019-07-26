package com.beda.tasks;

import com.beda.interactions.SelectProduct;
import com.beda.userinterfaces.PlazaveaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddTheProduct implements Task {

    private String nameProduct;

    public AddTheProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PlazaveaHomePage.LIST_PORCENT_PRODUCT, isPresent()),
                Scroll.to(PlazaveaHomePage.LIST_PORCENT_PRODUCT),
                SelectProduct.withName( PlazaveaHomePage.LABEL_PRODUCT_NAME, PlazaveaHomePage.ADD_BUTTON, nameProduct),
                WaitUntil.the(PlazaveaHomePage.BUY_BUTTON_DETAIL, isVisible()),
                Click.on(PlazaveaHomePage.BUY_BUTTON_DETAIL)
        );

    }

    public static AddTheProduct inShoppingCar (String nameProduct) {
        return instrumented(AddTheProduct.class, nameProduct);
    }

}
