package com.beda.tasks;

import com.beda.userinterfaces.PlazaveaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

/**
 * Clase encargada de agregar el producto al carrito, busca el producto entre los resultados obtenidos en la busqueda
 * y agrega el producto que concuerda con el nombre del producto buscado
 *
 * @author Brayan Diaz
 */
public class AddTheProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PlazaveaHomePage.LABEL_PRODUCT_NAME, isPresent()),
                Scroll.to(PlazaveaHomePage.BUY_BUTTON_DETAIL)
        );
        PlazaveaHomePage.BUY_BUTTON_DETAIL.resolveAllFor(actor).get(1).click();
        actor.attemptsTo(
                Click.on(PlazaveaHomePage.SHOPPING_CAR_BUTTON)
        );
    }

    public static AddTheProduct inShoppingCar() {
        return instrumented(AddTheProduct.class);
    }

}
