package pages;

import org.openqa.selenium.By;
import test_data.TestData;

public class SearchResultsPage extends TestData {

    //Products
    private final By wineProduct = By.id("snize-product-8132228808");

    public void clickOnWineProduct() {
        driver.findElement(wineProduct).click();
    }

}
