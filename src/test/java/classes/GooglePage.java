package classes;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

@DefaultUrl("https://www.google.ru")
public class GooglePage extends PageObject {

    @FindBy(name = "q")
    private WebElement searchInput;

    @Step("search {0}")
    public void search(String query) {
        searchInput.sendKeys(query);
    }

    @Step("press ENTER")
    public void pressEnter() {
        try {
            new Robot().keyPress(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

}
