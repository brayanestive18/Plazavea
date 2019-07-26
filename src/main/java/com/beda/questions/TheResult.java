package com.beda.questions;

import com.beda.userinterfaces.PlazaveaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Question para validar que el producto que esta en el carrito, corresponde al producto buscado
 *
 * @author Brayan Diaz
 */
public class TheResult implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PlazaveaHomePage.LABEL_NAME_DETAIL).viewedBy(actor).asString();
    }

    public static TheResult is() {
        return new TheResult();
    }
}
