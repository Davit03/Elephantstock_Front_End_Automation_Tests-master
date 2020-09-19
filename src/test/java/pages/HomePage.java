package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import test_data.TestData;

public class HomePage extends TestData {
    //Buttons
    private final By xButtonInCouponModal = By.xpath("/html/body/div[11]/div[1]/span");
    private final By removeProductButton = By.className("wishlist__remove-item");
    private final By closeWishListButton = By.xpath("//div[@class='wishlist__wrapper ae--from-right']//span[@class='icon--close']");

    //Titles
    private final By myAccountTitle = By.className("icon--header-user");
    private final By homePageSPTitle = By.xpath("//*[@id=\"shopify-section-homepage_title\"]/div/h1");
    private final By userNameTitle = By.xpath("//span[contains(text(),'Test')]");
    private final By wishlistHeartIcon = By.className("icon--header-heart");
    private final By wineProductTitleInWishlist = By.xpath("//li[@class='wishlist__item']//p[contains(text(),'Wine Barrels Multi Panel Canvas Wall Art')]");
    private final By wishListTitle = By.className("wishlist__title");


    //Fields
    private final By searchField = By.xpath("//div[@class='sh__search']//input[@placeholder='Find Stunning Wall Art']");



    public void clickOnXButton() {
        driver.findElement(xButtonInCouponModal).click();
    }

    public void clickOnMyAccountTitle() {
        driver.findElement(myAccountTitle).click();
    }

    public String getHomePageSPTest() {
        String text = driver.findElement(homePageSPTitle).getText();
        return text;
    }

    public void typeInSearchField(String name) {
        driver.findElement(searchField).sendKeys(name);
    }

    public void pressOnSearchField() {
        driver.findElement(searchField).sendKeys(Keys.ENTER);
    }

    public void clickOnUserNameTitle() {
        driver.findElement(userNameTitle).click();
    }

    public String getWishListTitle() {
       String s = driver.findElement(wishListTitle).getText();
       return s;
    }

    public void clickOnUWishListIcon() {
        while (getWishListTitle().isEmpty())
        {
            driver.findElement(wishlistHeartIcon).click();
            driver.findElement(wishListTitle).isDisplayed();
        }
    }



    public String getWineProductNameFroWishlist() {
        String text = driver.findElement(wineProductTitleInWishlist).getText();
        return text;
    }

    public void clickOnRemoveProductPixel() {
        driver.findElement(removeProductButton).click();
    }

    public void clickOnCloseWishLIstButton() {
        driver.findElement(closeWishListButton).click();
    }

}
