package utils;


import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;



public class ScreenshotUtil {



    public static void captureScreenshot(
            WebDriver driver,
            String fileName) {


        try {


            File source =
            ((TakesScreenshot)driver)
            .getScreenshotAs(
            OutputType.FILE);


            File destination =
            new File(
            "./screenshots/"
            + fileName
            + ".png");


            FileUtils.copyFile(
            source,
            destination);


        }
        catch(Exception e){

            e.printStackTrace();

        }

    }

}
