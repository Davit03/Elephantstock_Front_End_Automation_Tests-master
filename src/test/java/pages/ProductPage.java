package pages;

import org.openqa.selenium.By;
import test_data.TestData;

public class ProductPage extends TestData {

    //Pixels
    private final By wishListIcon = By.className("wishlist__loader");

    //Buttons
    private final By addToCartButton = By.id("AddToCart-product-template");
    private final By viewCartButton = By.xpath("//button[@class='modal-view-cart-btn modal-btns']");

    //Product Size
    private final By selectProductSize = By.xpath("//div[@class='panel-desc-Size'][contains(text(),'25\" X 12\"')]");

    //Like Counts
    private final By likeCount = By.xpath("//*[@id=\"soci-al-ico-ns\"]/div/div[1]/div/span[2]");

    public void selectTheProductSize() {
        driver.findElement(selectProductSize).click();
    }

    public void clickOnAddToCartButton() {
        driver.findElement(addToCartButton).submit();
    }

    public void clickOnViewCartButton() {
        driver.findElement(viewCartButton).click();
    }

    public void getLikeCount() throws InterruptedException {

        String count = driver.findElement(likeCount).getText();
        int num = Integer.parseInt(count);
        int sum = num + 1;
        while (num < sum) {
            driver.findElement(wishListIcon).click();
            setWaitTime();
            num++;
            break;
        }

    }
}
