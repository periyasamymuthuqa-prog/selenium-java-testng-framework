package base;


import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


import driver.DriverFactory;

import utils.ScreenshotUtil;



public class BaseTest {



@BeforeMethod

public void setUp(){

    DriverFactory.initializeDriver();

}



@AfterMethod

public void tearDown(
        ITestResult result){


    if(result.getStatus()
            == ITestResult.FAILURE){


        ScreenshotUtil.captureScreenshot(
        DriverFactory.getDriver(),
        result.getName());


    }


    DriverFactory.quitDriver();


}


}
