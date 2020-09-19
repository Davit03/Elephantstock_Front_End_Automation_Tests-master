package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import test_data.TestData;

public class RegistrationPage extends TestData {
    //Header
    private final By header = By.xpath("//h1[contains(text(),'Create Account')]");

    //fields
    private final By firstNameField = By.id("FirstName");
    private final By lastNameField = By.id("LastName");

    //SelectField
    private final By birthDayField = By.id("Birthday");

    public String getHeaderText() {
        String text = driver.findElement(header).getText();
        return text;
    }

    public void setSelectBirthDay() {

        Select select = new Select(driver.findElement(birthDayField));
        select.selectByIndex(1);


    }


}