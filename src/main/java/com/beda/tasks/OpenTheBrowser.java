package com.beda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task {

    private PageObject pageObject;

    public OpenTheBrowser(PageObject pageObject) {
        this.pageObject = pageObject;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pageObject));
    }

    public static OpenTheBrowser at (PageObject pageObject) {
        return instrumented(OpenTheBrowser.class, pageObject);
    }

}
