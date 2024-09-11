package com.evalartapp.tasks.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/forms.feature",
        glue = "com.evalartapp.tasks.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class LoginTaskRunner {
}
