package serenityCucumber.firstProject;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LoginInActions extends UIInteractionSteps {
    @Step("Log in as {0}")
    public void as(Users user) {
        openUrl("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");

        // Login as a standard user
        $("//input[@name='username']").sendKeys(user.getUsername());
        $("//input[@name='password']").sendKeys(user.getPassword());
    }
    @Step("Click On Log In")
    public void clickOnLoginIn(){
        $("//input[@class='button']").click();
    }

}
