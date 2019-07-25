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
}
