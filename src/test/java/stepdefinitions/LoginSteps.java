package stepdefinitions;


import io.cucumber.java.en.*;

import org.testng.Assert;


import driver.DriverFactory;

import pages.LoginPage;



public class LoginSteps {


LoginPage loginPage;



@Given("user opens the application")

public void openApplication(){


    DriverFactory.initializeDriver();


    DriverFactory.getDriver()
    .get("https://www.saucedemo.com/");


}



@When("user enters valid username and password")

public void enterCredentials(){


    loginPage =
    new LoginPage(
    DriverFactory.getDriver());


    loginPage.enterUsername(
    "standard_user");


    loginPage.enterPassword(
    "secret_sauce");


}



@When("clicks on login button")

public void clickLogin(){


    loginPage.clickLogin();


}



@Then("user should navigate to inventory page")

public void verifyLogin(){


    Assert.assertTrue(
    DriverFactory.getDriver()
    .getCurrentUrl()
    .contains("inventory"));


    DriverFactory.quitDriver();


}

}
