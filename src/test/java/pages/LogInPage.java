package pages;

import org.openqa.selenium.By;
import test_data.TestData;

public class LogInPage extends TestData {
    //Headers
    private final By header = By.xpath("//*[@id=\"customer_login\"]/h1");

    //Fields
    private final By emailField = By.id("CustomerEmail");
    private final By passwordField = By.id("CustomerPassword");
    private final By emailFieldOnResetPasswordField = By.id("RecoverEmail");

    //Buttons
    private final By signInButton = By.xpath("//*[@id=\"customer_login\"]/p[2]/input");
    private final By submitButton = By.xpath("//*[@id=\"RecoverPasswordForm\"]/div/form/p/input");

    //Messages
    private final By logInErrorMessage = By.xpath("//*[@id=\"customer_login\"]/div/ul/li");
    private final By successfulResetMessage = By.id("ResetSuccess");

    //Links
    private final By resetPasswordLink = By.id("RecoverPassword");
    private final By createAccountLink = By.id("customer_register_link");


    public String getHeaderText() {
        String h = driver.findElement(header).getText();
        return h;
    }

    public void typeInEmailField(String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    public void typeInPasswordField(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickOnSignInButton() {
        driver.findElement(signInButton).submit();
    }

    public String getLogInErrorMessage() {
        String errorTest = driver.findElement(logInErrorMessage).getText();
        return errorTest;
    }
    public String getSuccessfulResetMessage() {
        String message = driver.findElement(successfulResetMessage).getText();
        return message;
    }

    public void clickOnResetPasswordLink() {
        driver.findElement(resetPasswordLink).click();
    }


    public void typeInResetPasswordField(String email) {
        driver.findElement(emailFieldOnResetPasswordField).clear();
        driver.findElement(emailFieldOnResetPasswordField).sendKeys(email);
    }

    public void clickOnSubmitButton() {
        driver.findElement(submitButton).submit();
    }

    public void clickOnCreateAccountLink() {
        driver.findElement(createAccountLink).click();
    }


}
