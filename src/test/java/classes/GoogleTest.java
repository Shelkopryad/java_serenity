package classes;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleTest {

    @Steps
    GoogleSteps steps;

    @Before
    public void setUp() {
        steps.setUp();
    }

    @When("^user goes to google main page$")
    public void goToMainPage() {
        steps.goToMainPage();
    }

    @When("^he is searching \"(.*)\"$")
    public void search(String what) {
        steps.search(what);
    }

    @Then("he does something")
    public void dsmthng() {
        System.out.println(42);
    }

}
