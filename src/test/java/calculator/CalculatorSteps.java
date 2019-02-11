package calculator;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    private int result;

    @When("I calculate {int} + {int}")
    public void add(int arg0, int arg1) {
        result = arg0 + arg1;
    }

    @Then("the answer is {int}")
    public void theAnswerIs(int arg0) {
        assertEquals(arg0, result);
    }

    @When("I calculate {int} - {int}")
    public void subtract(int arg0, int arg1) {
        result = arg0 - arg1;
    }

    @When("I calculate {int} * {int}")
    public void multiply(int arg0, int arg1) {
        result = arg0 * arg1;
    }

    @When("I calculate {int} / {int}")
    public void divide(int arg0, int arg1) {
        result = arg0 / arg1;
    }
}
