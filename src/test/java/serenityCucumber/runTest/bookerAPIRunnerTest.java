package serenityCucumber.runTest;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import serenityCucumber.firstProject.BookStoreAPI;
import serenityCucumber.firstProject.stepDefinitions.BookStore;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"serenityCucumber.firstProject.stepDefinitions"},
        features = "src/test/resources/features/BookerAPITest.feature")

public class bookerAPIRunnerTest {}
