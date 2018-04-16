package classes;

import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GoogleSteps {

    GooglePage page;

    public void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        page.setDriver(new ChromeDriver(capabilities));
    }

    @Step("main page open")
    public void goToMainPage() {
        page.open();
    }

    @Step("search {0}")
    public void search(String what) {
        page.search(what);
        page.pressEnter();
    }




}
