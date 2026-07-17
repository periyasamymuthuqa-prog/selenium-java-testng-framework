package tests;


import org.testng.Assert;
import org.testng.annotations.Test;


import base.BaseTest;
import driver.DriverFactory;
import pages.LoginPage;



public class LoginTest extends BaseTest {



@Test
public void validateUserLogin(){


    DriverFactory.getDriver()
            .get("https://www.saucedemo.com/");


    LoginPage loginPage =
            new LoginPage(
            DriverFactory.getDriver());


    loginPage.login(
            "standard_user",
            "secret_sauce");


    Assert.assertTrue(
            DriverFactory.getDriver()
            .getCurrentUrl()
            .contains("inventory"));

}

}
