package pages;

import org.openqa.selenium.By;
import test_data.TestData;

public class UserPage extends TestData {

    //Titles
    private final By userName = By.xpath("//span[contains(text(),'Test')]");

    //Tabs
    private final By homeTab = By.xpath("//*[@id=\"SiteNav-left\"]/li[1]/a");

    //Tabs
    private final By accountDetailsTab = By.xpath("//*[@id=\"account_details-li\"]");

    //Links
    private final By logOutLink = By.xpath("//a[contains(text(),'Logout')]");


    public String getUserName() {
        String name = driver.findElement(userName).getText();
        return name;
    }
    public void clickOnAccountDetailsTab() {
        driver.findElement(accountDetailsTab).click();
    }
    public void clickLogOutLink() {
        driver.findElement(logOutLink).click();
    }
      public void clickOnHomeTab() {
        driver.findElement(homeTab).click();
    }

}
