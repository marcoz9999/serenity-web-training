package serenityCucumber.firstProject.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import serenityCucumber.firstProject.LoginInActions;

import static org.assertj.core.api.Assertions.assertThat;
import static serenityCucumber.firstProject.Users.STANDARD_USER;

public class WhenLoggingOn {
    @Managed
    WebDriver driver;

    @Steps
    LoginInActions login;

    @Test
    @Given("^valid credentials and environment$")
    public void user(){
        // Write code here that turns the phrase above into concrete actions
        login.as(STANDARD_USER);

    }


    @When("^Logging in with correct user name and password and click on logging button$")
    public void navigatesTo(){
        // Write code here that turns the phrase above into concrete actions
        login.clickOnLoginIn();

    }

    @Then("^Homepage is shown$")
    public void mainPageIsDisplayed(){
        // Write code here that turns the phrase above into concrete action
        Serenity.reportThat("The home page should be displayed showing correct company logo",
                () -> assertThat(driver.findElement(By.xpath("//img[@class='logo']")).getAttribute("ParaBank"))
        );
        Serenity.reportThat("The home page should be displayed showing Account Overview as header",
                () -> assertThat(driver.findElement(By.xpath("//h1[@class='title']")).getText()).isEqualToIgnoringCase("Accounts Overview")
        );

    }
}
