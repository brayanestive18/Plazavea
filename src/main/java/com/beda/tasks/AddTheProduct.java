package com.beda.tasks;

import com.beda.userinterfaces.PlazaveaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddTheProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PlazaveaHomePage.ADD_BUTTON)
        );
    }

    public static AddTheProduct inShoppingCar () {
        return instrumented(AddTheProduct.class);
    }

}
