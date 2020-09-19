package pages;

import org.openqa.selenium.By;

import test_data.TestData;

public class CartPage extends TestData {

    //Buttons
    private final By quantityMinusButton = By.className("cart_decrease-quantity");

    //Titles
    private final By cartEmptyText = By.className("cart-empty-text");


    public void clickOnQuantityMinusButton() {
        driver.findElement(quantityMinusButton).click();
    }
    public String getCartEmptyText() {
        String text = driver.findElement(cartEmptyText).getText();
        return text;

    }
}
