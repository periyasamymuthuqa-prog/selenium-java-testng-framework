package base;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.DriverFactory;


public class BaseTest {


    @BeforeMethod
    public void setUp() {

        DriverFactory.initializeDriver();

    }


    @AfterMethod
    public void tearDown() {

        DriverFactory.quitDriver();

    }

}
