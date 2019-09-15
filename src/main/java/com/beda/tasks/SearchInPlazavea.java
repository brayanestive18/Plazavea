package com.beda.tasks;

import com.beda.userinterfaces.PlazaveaHomePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Task que se encarga de buscar el producto en la página web.
 *
 * @author Brayan Diaz
 */
public class SearchInPlazavea implements Task {

    private String nameProduct;

    public SearchInPlazavea(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    @Step("{0} search the product")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nameProduct).into(PlazaveaHomePage.FIELD_SEARCH)
        );

        List<WebElementFacade> listResult = PlazaveaHomePage.LABEL_RESULT_SEARCH.resolveAllFor(actor);
        for (WebElementFacade productResult : listResult) {
            if(nameProduct.equalsIgnoreCase(productResult.getText())) {
                productResult.click();
                break;
            }
        }
    }

    public static SearchInPlazavea theProduct(String nameProduct) {
        return instrumented(SearchInPlazavea.class, nameProduct);
    }

}
