package de.fhg.iais.atn.stepdef;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "html:target/cucumber" },
		features = "classpath:checkout.feature"
)
public class RunCheckoutTest {
}
