package com.beda.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.beda.features/BuyInPlazavea.feature",
        glue = "com.beda.stepdefinitions",
        tags = "@TestCase1",
        snippets = SnippetType.CAMELCASE
)
public class BuyInPlazaveaRunner {
}
