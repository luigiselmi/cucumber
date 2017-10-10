package de.fhg.iais.atn.stepdef;

import cucumber.api.java.en.*;
import de.fhg.iais.atn.impl.Checkout;
import static org.junit.Assert.*;

public class CheckoutSteps {

  int bananaPrice = 0;
  Checkout checkout;
  
  @Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
  public void thePriceOfAIsC(String name, int price) throws Throwable {
    this.bananaPrice = price;
  }

  @When("^I checkout (\\d+) \"([^\"]*)\"$")
  public void iCheckout(int itemCount, String itemName) throws Throwable {
    checkout = new Checkout();
    checkout.add(itemCount, bananaPrice);
  }

  @Then("^the total price should be (\\d+)c$")
  public void theTotalPriceShouldBeC(int total) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    assertEquals(total, checkout.total());
  }

}
