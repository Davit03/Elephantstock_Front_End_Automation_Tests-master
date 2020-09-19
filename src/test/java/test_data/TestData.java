package test_data;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestData {
    protected static WebDriver driver;

    protected String customerEmail = "utest202010@gmail.com";
    protected String customerPassword = "Test1234";
    protected String customerInvalidUserName = "utest@gmail.com";

    //Products
    protected String wine = "Wine Barrels Multi Panel Canvas Wall Art";


    protected static void beforeMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    protected static WebDriver setWaitTime() throws InterruptedException {
        Thread.sleep(2000);
        return driver;
    }
    protected static WebDriver setLongWaitTime() throws InterruptedException {
        Thread.sleep(5000);
        return driver;

    }



}
