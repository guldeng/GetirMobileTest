package com.getir.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{

    @FindBy(xpath = "//*[@text='There is no result']")
    public WebElement basketText;

    @FindBy(id = "com.getir.casestudy.dev:id/ga_toolbar_leftIconImageView")
    public WebElement backBtn;

    @FindBy(id="com.getir.casestudy.dev:id/btnAdd")
    public WebElement addItem;

    @FindBy(id="com.getir.casestudy.dev:id/tvTotalTitle")
    public WebElement totalAmount;


}
