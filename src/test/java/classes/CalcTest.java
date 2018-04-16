package classes;

import core.Calc;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CalcTest {

    @When("^i add (\\d*) to (\\d*) it equals (\\d*)$")
    public void sumTest(int a, int b, int c) {
        Assert.assertEquals("Not equals!", c, new Calc().sum(a, b));
    }

    @When("^i multiply (\\d*) to (\\d*) it equals (\\d*)$")
    public void multiplyTest(int a, int b, int c) {
        Assert.assertEquals("Not equals!", c, new Calc().multiply(a, b));
    }

    @When("^i substract (\\d*) from (\\d*) it equals (\\d*)$")
    public void deductTest(int a, int b, int c) {
        Assert.assertEquals("Not equals!", c, new Calc().substract(b, a));
    }

    public void divideTest() {
        Assert.assertEquals("Not equals!", 4, new Calc().divide(16, 4));
    }

    public void divideByZeroTest() {
        Assert.assertEquals("Not equals!", Integer.MAX_VALUE, new Calc().divide(84, 0));
    }

    public void squreTest() {
        Assert.assertEquals("Not equals!", 25, new Calc().square(5));
    }

}
