package com.getir.stepDefs;

import com.getir.pages.BasketPage;
import com.getir.pages.LoginPage;
import com.getir.utilities.ScrollHepler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Getir_StepDef {
    LoginPage loginPage = new LoginPage();
    BasketPage basketPage = new BasketPage();


    @Given("The user opens the Getir app and enters {string} and {string}")
    public void the_user_opens_the_Getir_app_and_enters_and(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("The user logins successfully")
    public void the_user_logins_successfully() {
        String expectedText = "Dondurma";
        String actualText = loginPage.cat_Dondurma.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @And("The user clicks basket button")
    public void theUserClicksBasketButton() {
        loginPage.basketBtn.click();
    }

    @Then("The user verifies that the basket is empty and able to see {string}")
    public void theUserVerifiesThatTheBasketIsEmptyAndAbleToSee(String expectedText) {
        Assert.assertEquals(expectedText, basketPage.basketText.getText());
        basketPage.backBtn.click();
    }

    @Then("The user should be able to see all menu list in console and verifies that the size is {int}")
    public void theUserShouldBeAbleToSeeAllMenuListInConsoleAndVerifiesThatTheSizeIs(int expectedSize) {
        int actualSize = loginPage.menuList.size();
        Assert.assertEquals(expectedSize, actualSize);
    }

    @And("The user clicks category which is {string}")
    public void theUserClicksCategoryWhichIs(String category) {
        loginPage.getCategory(category).click();
    }

    @And("The user adds two different items")
    public void theUserAddsTwoDifferentItems() {
        basketPage.addItem.click();
        basketPage.addItem.click();
    }

    @And("The user scrolls down to {string}")
    public void theUserScrollsDownTo(String itemText) {
        new ScrollHepler().scrollVerticalHelper(itemText);
    }

    @Then("The user verifies that {string}")
    public void theUserVerifiesThat(String expectedTotalAmount) {
        String actualTotalAmount= basketPage.totalAmount.getText();
        Assert.assertEquals(expectedTotalAmount, actualTotalAmount);

    }
}

