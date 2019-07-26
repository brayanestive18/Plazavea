package com.beda.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Interaccion que se encargar de escoger el producto que corresponde al nombre del producto que se
 * busco anteriormente y selecionarlo para agregarlo al carrito posteriormente.
 *
 * @author Brayan Diaz
 */
public class SelectProduct implements Interaction {

    private Target listNameProduct;
    private Target listButtonAdd;
    private String productName;

    public SelectProduct(Target listNameProduct, Target listButtonAdd, String productName) {
        this.listNameProduct = listNameProduct;
        this.listButtonAdd = listButtonAdd;
        this.productName = productName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listWebElementProdNames = listNameProduct.resolveAllFor(actor);
        List<WebElementFacade> listWebElementAddButton = listNameProduct.resolveAllFor(actor);
        for (int i = 0; i < listWebElementProdNames.size(); i++ ) {
            if(listWebElementProdNames.get(i).getText().equals(productName)) {
                listWebElementAddButton.get(i).click();
                break;
            }
        }
    }

    public static SelectProduct withName (Target listNameProduct, Target listButtonAdd, String productName) {
        return instrumented(SelectProduct.class, listNameProduct, listButtonAdd , productName);
    }

}
