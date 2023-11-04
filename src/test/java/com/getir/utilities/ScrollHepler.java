package com.getir.utilities;

import com.getir.stepDefs.Initialize;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class ScrollHepler {


    private AndroidDriver driver = Initialize.driver;

    public void scrollVerticalHelper(String text){
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollTextIntoView(\""+text+"\")"));

    }

    public void scrollHorizontalHelper(String text){
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".setAsHorizontalList().scrollTextIntoView(\""+text+"\")"));
    }

    public WebElement scrollVerticalHelper2(String text){
        return driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollTextIntoView(\""+text+"\")"));

    }

    public WebElement scrollHorizontalHelper2(String text){
        return driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".setAsHorizontalList().scrollTextIntoView(\""+text+"\")"));
    }


}
