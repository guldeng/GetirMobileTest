package com.getir.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//*[@text='username']")
    public WebElement usernameInput;
    //public AndroidElement usernameInput;

    @FindBy(xpath = "//*[@text='password']")
    public WebElement passwordInput;
    //public AndroidElement passwordInput;

    @FindBy(xpath = "//*[@text='Submit']")
    public WebElement submitBtn;
    //public AndroidElement submitBtn;

    @FindBy(xpath = "//*[@text='Dondurma']")
    public WebElement cat_Dondurma;

    @FindBy(id = "com.getir.casestudy.dev:id/ga_toolbar_getir10GABasketButton")
    public WebElement basketBtn;

    @FindBy(className="android.widget.TextView")
    public List<WebElement> menuList;

    public void login(String username, String password){
        waitUntil(usernameInput);
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitBtn.click();
        waitUntil(cat_Dondurma);
    }

    public WebElement waitUntil(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

//    public AndroidElement waitUntil(AndroidElement element){
//        return wait.until(ExpectedConditions.visibilityOf(element));
//    }

  /*  public void getCategory(String catName){
        driver.findElement(By.xpath("//*[@text='"+catName+"']")).click();
    }*/

    public WebElement getCategory(String catName){
       return driver.findElement(By.xpath("//*[@text='"+catName+"']"));

    }
}
