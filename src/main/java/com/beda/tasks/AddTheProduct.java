package com.beda.tasks;

import com.beda.userinterfaces.PlazaveaHomePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class AddTheProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listAddButton = PlazaveaHomePage.ADD_BUTTON.resolveAllFor(actor);
        actor.attemptsTo(
                Scroll.to(listAddButton.get(0))
                //WaitUntil.the(PlazaveaHomePage.ADD_BUTTON, isPresent()),
                //Click.on(PlazaveaHomePage.ADD_BUTTON)
        );
        System.out.println(listAddButton.size());
        listAddButton.get(0).click();
    }

    public static AddTheProduct inShoppingCar () {
        return instrumented(AddTheProduct.class);
    }

}
