package testCases;

import base.Driver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SpreeHomePage;
import java.io.IOException;

@Listeners(Listener.class)

public class SearchProduct extends Driver {
    @Test
    public void searchRubyAndApache() throws InterruptedException, IOException {
        SpreeHomePage SpreehomePage = new SpreeHomePage(driver);
        SpreehomePage.searchRuby();
        SpreehomePage.searchApache();
    }
}
