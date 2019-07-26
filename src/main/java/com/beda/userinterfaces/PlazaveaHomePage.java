package com.beda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.plazavea.com.pe/")
public class PlazaveaHomePage extends PageObject {

    public static final Target FIELD_SEARCH = Target.the("Field for search the product")
            .located(By.id("tags"));
    public static final Target ADD_BUTTON = Target.the("Add button the product in shoppping car")
            .located(By.className("buy-button-normal"));
    public static final Target SEARCH_BUTTON = Target.the("Search button the product")
            .located(By.className("iconpv-buscar"));
    public static final Target CANCEL_BUTTON_POPUP = Target.the("Cancel button popup")
            .located(By.id("onesignal-popover-cancel-button"));
    public static final Target SHOPPING_CAR_BUTTON = Target.the("Cancel button popup")
            .located(By.id("onesignal-popover-cancel-button"));
    public static final Target LABEL_PRODUCT_NAME = Target.the("Label the product name")
            .located(By.className("Showcase__name"));
    public static final Target LIST_SUMMARY_PRODUCT = Target.the("List summary the product")
            .located(By.className("Showcase__photo"));
    public static final Target LIST_PORCENT_PRODUCT = Target.the("List summary the product")
            .located(By.className("Showcase__tags"));
    public static final Target BUY_BUTTON_DETAIL = Target.the("Add button the product in car")
            .located(By.xpath("//a[@class='b12-btn-agregar b12-comprar']"));
    public static final Target LABEL_NAME_DETAIL = Target.the("Label product name in car")
            .located(By.xpath("//a[@id='product-name29962']"));

}
