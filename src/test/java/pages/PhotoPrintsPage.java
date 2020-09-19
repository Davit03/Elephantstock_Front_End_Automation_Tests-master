package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import test_data.TestData;

public class PhotoPrintsPage extends TestData {
    //Header
    private final By header = By.xpath("//h1[contains(text(),'Create Account')]");

    //Tab
    private final By photoPrintTab = By.xpath("//*[@id=\"SiteNav-left\"]/li[9]/a");

    //Canvas in photo prints
    private final By selectCanvas = By.xpath("//*[@id=\"SiteNav-left\"]/li[9]/ul/li[1]/a/span");
    private WebDriver webdriver;

    //LayoutTypes
    private final By horizontalLayout = By.xpath("//div[contains(text(),'Horizontal')]");
    private final By selectSecondLayout = By.xpath("//img[@class='custom-layout-icon icon-1-horizontal']");

    //Buttons
    private final By uploadPhotoButton = By.xpath("//*[@id=\"ProductSection-product-template\"]/div/div[2]/div[2]/div/div/div[2]/button[1]");
    private final By uploadPhotoButton2 = By.xpath("//button[@class='uploadcare--button uploadcare--button_primary uploadcare--tab__action-button']");

    //Links
    private final By uploadImageLink = By.xpath("//div[@class='uploadcare--menu__item uploadcare--menu__item_tab_url']");

    //Field
    private final By uploadFileField = By.xpath("//input[@placeholder='Paste your link here...']");

    //Text
    private final By imageErrorTitle = By.xpath("//div[contains(text(),'Please use image width 189px and height 126px')]");

    public void clickOnCanvasTitleInDropDown() throws InterruptedException {
        setWaitTime();
        WebElement mainMenu = driver.findElement(photoPrintTab);
        Actions action = new Actions(driver);
        action.moveToElement(mainMenu).moveToElement(driver.findElement(selectCanvas)).click().build().perform();
    }

    public void clickOnTheHorizontalLayout() {
        driver.findElement(horizontalLayout).click();
    }

    public void clickOnSecondHorizontalLayout() {
        driver.findElement(selectSecondLayout).click();
    }

    public void clickOnUploadPhotoButton() {
        driver.findElement(uploadPhotoButton).click();
    }


    public void uploadImage() throws InterruptedException {
        driver.findElement(uploadImageLink).click();
        driver.findElement(uploadFileField).sendKeys("https://lh3.googleusercontent.com/RLOslsL0g8xWsXKBnlhJvxTYKQM8ntFBb5pq27yRdNt5z71aHKcXiA4afgyUpeuer2EAtH7d3nNJz4_Eq5faZIx0C0TODtttm8A_IcOCYW7nJwiKXrztuur-uCmlGthEhlbSzn7LEjH9lRqdgK0Mf89XTLMzKls4d3rI50mrvRrn0RPUSoQdEzaNBh2G4rUGI35nYqNXokdxOzlIB-IQi1HHbsOELSs2GIk3BUbkr4EmAfuAznhALcKVz490nwh8A9JoyazV-SmhKZvCI9_jX0Voh2XmUQqEs6lGP-ExupQfsifCYx9H7yw3MZz8lK6WuxgEbys5D5Kj6l6PGKSDbQgHAuME0hIBP7DNYiOASCaPEs2wRbtyDK7JHegkV-qkGd1DlOWmAHjiiftu_akBNTFz4tZ7M1aeflKTMZ4XLZedtuWUhQ3dK32cTxIiDumQsBFC1utOWrMGKNz-_gBzh1Pbo12DTBba8D4mY53ynZgmx2lEAhxzBsVMZcdDZBInEeVf5rA7nCdfji1JaOTefwoHvl0fVbFE4jcKHMw--Gkc__rwAwvsG83nJujGmmsdYrgLWtOHruZYBgqe5GydQxQxUwRXk0aEJPPqKOrvfLBq5ZM4HL5_pA0y3ZHjIK9IEUfAQPnEHzU5VB9sUXRk-ST14Iomtsw-_IVlgMV8jeYChe4RYYVkRSmDmQML=w188-h125-no?authuser=0");
    }
    public void clickOnUploadButton() throws InterruptedException {
        driver.findElement(uploadPhotoButton2).click();

    }
    public String getErrorMessage() throws InterruptedException {
        String text = driver.findElement(imageErrorTitle).getText();
        return text;
    }

}