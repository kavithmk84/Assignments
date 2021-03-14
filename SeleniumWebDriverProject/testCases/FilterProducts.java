package testCases;

import base.Driver;
import org.testng.annotations.Test;
import pages.SpreeHomePage;
import java.io.IOException;

public class FilterProducts extends Driver {
    @Test
    public void runFilterProduct() throws InterruptedException, IOException {
        SpreeHomePage SpreehomePage = new SpreeHomePage(driver);
        SpreehomePage.FilterByPriceOnBags();
    }
}
