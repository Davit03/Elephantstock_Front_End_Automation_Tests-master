package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.*;
import test_data.TestData;

import static org.junit.Assert.assertEquals;


public class MainRegressionTests extends TestData {
    @Before
    public void setUP() {
        beforeMethod();
        driver.get("https://www.elephantstock.com/");

    }

    @Test
    public void successfulLogInTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickOnXButton();
        homePage.clickOnMyAccountTitle();
        LogInPage logInPage = new LogInPage();
        assertEquals("Login", logInPage.getHeaderText());
        logInPage.typeInEmailField(customerEmail);
        logInPage.typeInPasswordField(customerPassword);
        logInPage.clickOnSignInButton();
        UserPage userPage = new UserPage();
        setWaitTime();
        assertEquals("Test", userPage.getUserName());
        setWaitTime();
        userPage.clickOnAccountDetailsTab();
        userPage.clickLogOutLink();
        assertEquals("STUNNING WALL ART, HIGH QUALITY AND AFFORDABLE!", homePage.getHomePageSPTest());

    }

    @Test
    public void unsuccessfullyLogInWithInvalidEmail() {
        HomePage homePage = new HomePage();
        homePage.clickOnXButton();
        homePage.clickOnMyAccountTitle();
        LogInPage logInPage = new LogInPage();
        assertEquals("Login", logInPage.getHeaderText());
        logInPage.typeInEmailField(customerInvalidUserName);
        logInPage.typeInPasswordField(customerPassword);
        logInPage.clickOnSignInButton();
        assertEquals("Incorrect email or password.", logInPage.getLogInErrorMessage());

    }

    @Test
    public void unsuccessfullyLogInWithInvalidPassword() {
        HomePage homePage = new HomePage();
        homePage.clickOnXButton();
        homePage.clickOnMyAccountTitle();
        LogInPage logInPage = new LogInPage();
        assertEquals("Login", logInPage.getHeaderText());
        logInPage.typeInEmailField(customerEmail);
        logInPage.typeInPasswordField(customerEmail);
        logInPage.clickOnSignInButton();
        assertEquals("Incorrect email or password.", logInPage.getLogInErrorMessage());

    }

    @Test
    public void addProductToWishList() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickOnXButton();
        homePage.clickOnMyAccountTitle();
        LogInPage logInPage = new LogInPage();
        assertEquals("Login", logInPage.getHeaderText());
        logInPage.typeInEmailField(customerEmail);
        logInPage.typeInPasswordField(customerPassword);
        logInPage.clickOnSignInButton();
        UserPage userPage = new UserPage();
        assertEquals("Test", userPage.getUserName());
        userPage.clickOnHomeTab();
        assertEquals("STUNNING WALL ART, HIGH QUALITY AND AFFORDABLE!", homePage.getHomePageSPTest());
        homePage.typeInSearchField(wine);
        homePage.pressOnSearchField();
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.clickOnWineProduct();
        ProductPage productPage = new ProductPage();
        setWaitTime();
        productPage.getLikeCount();
        setWaitTime();
        homePage.clickOnUWishListIcon();
        assertEquals("Wine Barrels Multi Panel Canvas Wall Art", homePage.getWineProductNameFroWishlist());
        setWaitTime();
        homePage.clickOnRemoveProductPixel();
        homePage.clickOnCloseWishLIstButton();
        homePage.clickOnUserNameTitle();
        userPage.clickOnAccountDetailsTab();
        userPage.clickLogOutLink();
        assertEquals("STUNNING WALL ART, HIGH QUALITY AND AFFORDABLE!", homePage.getHomePageSPTest());


    }

    @Test
    public void addProductToCart() {
        HomePage homePage = new HomePage();
        homePage.clickOnXButton();
        homePage.clickOnMyAccountTitle();
        LogInPage logInPage = new LogInPage();
        assertEquals("Login", logInPage.getHeaderText());
        logInPage.typeInEmailField(customerEmail);
        logInPage.typeInPasswordField(customerPassword);
        logInPage.clickOnSignInButton();
        UserPage userPage = new UserPage();
        assertEquals("Test", userPage.getUserName());
        userPage.clickOnHomeTab();
        assertEquals("STUNNING WALL ART, HIGH QUALITY AND AFFORDABLE!", homePage.getHomePageSPTest());
        homePage.typeInSearchField(wine);
        homePage.pressOnSearchField();
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.clickOnWineProduct();
        ProductPage productPage = new ProductPage();
        productPage.selectTheProductSize();
        productPage.clickOnAddToCartButton();
        productPage.clickOnViewCartButton();
        CartPage cartPage = new CartPage();
        cartPage.clickOnQuantityMinusButton();
        assertEquals("Your cart is currently empty.", cartPage.getCartEmptyText());
        homePage.clickOnUserNameTitle();
        userPage.clickOnAccountDetailsTab();
        userPage.clickLogOutLink();
        assertEquals("STUNNING WALL ART, HIGH QUALITY AND AFFORDABLE!", homePage.getHomePageSPTest());

    }
//    @Test
//    public void resetUserPasswordTest() {
//        HomePage homePage = new HomePage();
//        homePage.clickOnXButton();
//        homePage.clickOnMyAccountTitle();
//        LogInPage logInPage = new LogInPage();
//        Assert.assertEquals("Login", logInPage.getHeaderText());
//        logInPage.clickOnResetPasswordLink();
//        logInPage.typeInResetPasswordField(customerEmail);
//        logInPage.clickOnSubmitButton();
//        Assert.assertEquals("We've sent you an email with a link to update your password.", logInPage.getSuccessfulResetMessage());
//    }

    //    @Test
//    public void createNewUserAccount(){
//        HomePage homePage = new HomePage();
//        homePage.clickOnXButton();
//        homePage.clickOnMyAccountTitle();
//        LogInPage logInPage = new LogInPage();
//        Assert.assertEquals("Login", logInPage.getHeaderText());
//        logInPage.clickOnCreateAccountLink();
//        RegistrationPage rpage = new RegistrationPage();
//        Assert.assertEquals("Create Account", rpage.getHeaderText());
//        rpage.setSelectBirthDay();
//    }
    @Test
    public void checkingUploadImageMinSize() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickOnXButton();
        homePage.clickOnMyAccountTitle();
        LogInPage logInPage = new LogInPage();
        Assert.assertEquals("Login", logInPage.getHeaderText());
        logInPage.typeInEmailField(customerEmail);
        logInPage.typeInPasswordField(customerPassword);
        logInPage.clickOnSignInButton();
        UserPage userPage = new UserPage();
        Assert.assertEquals("Test", userPage.getUserName());
        userPage.clickOnHomeTab();
        Assert.assertEquals("STUNNING WALL ART, HIGH QUALITY AND AFFORDABLE!", homePage.getHomePageSPTest());
        PhotoPrintsPage photoPrintsPage = new PhotoPrintsPage();
        photoPrintsPage.clickOnCanvasTitleInDropDown();
        setWaitTime();
        photoPrintsPage.clickOnTheHorizontalLayout();
        setWaitTime();
        photoPrintsPage.clickOnSecondHorizontalLayout();
        photoPrintsPage.clickOnUploadPhotoButton();
        photoPrintsPage.uploadImage();
        photoPrintsPage.clickOnUploadButton();
        Assert.assertEquals("Please use image width 189px and height 126px", photoPrintsPage.getErrorMessage());


    }


    @After
    public void tearDown() throws InterruptedException {
        setWaitTime();
        driver.quit();
    }
}
