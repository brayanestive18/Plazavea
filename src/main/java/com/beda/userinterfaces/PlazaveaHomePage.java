package com.beda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Clase encargada de tener el mapeo de los elementos que usamos en la automatizacion
 *
 * @author Brayan Diaz
 */
@DefaultUrl("https://www.plazavea.com.pe/")
public class PlazaveaHomePage extends PageObject {

    public static final Target FIELD_SEARCH = Target.the("Field for search the product")
            .located(By.className("Search__input"));
    public static final Target SHOPPING_CAR_BUTTON = Target.the("Cancel button popup")
            .located(By.className("cart__ico"));
    public static final Target LABEL_PRODUCT_NAME = Target.the("Label the product name")
            .located(By.xpath("//h6[contains(@class,'ProductCard__name')]"));
    public static final Target BUY_BUTTON_DETAIL = Target.the("Add button the product in car")
            .located(By.className("ProductCard__buttons"));
    public static final Target LABEL_NAME_DETAIL = Target.the("Label product name in car")
            .located(By.className("minicart__card__name"));
    public static final Target LABEL_RESULT_SEARCH = Target.the("Label name the result")
            .located(By.xpath("//div[@class='SuggestionItem__productName']//a"));

}
