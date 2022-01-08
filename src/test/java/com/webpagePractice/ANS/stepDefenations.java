package com.webpagePractice.ANS;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefenations {
	WebDriver driver;
	
	@Given("Customer navigates to the website")
	public void customer_navigates_to_the_website() {
	    driver.get(System.getProperty("url"));
	}

	@Given("Customer login to his account")
	public void customer_login_to_his_account() {
	   
	}

	@When("customer searches for laptop")
	public void customer_searches_for_laptop() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("clicks on add to cart button")
	public void clicks_on_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Customer is redirected to cart page")
	public void customer_is_redirected_to_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Customer is able to click the place order button")
	public void customer_is_able_to_click_the_place_order_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	@Given("some precondition")
	public void some_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Problem statement");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Problem statement");
	}

	@When("some action by the element\\/user")
	public void some_action_by_the_element_user() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Problem statement");
	}

	@When("some other action from user")
	public void some_other_action_from_user() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Problem statement");
	}

	@When("yet another action from element")
	public void yet_another_action_from_element() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Problem statement");
	}

	@Then("some testable outcome is achieved")
	public void some_testable_outcome_is_achieved() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Problem statement");
	}

	@Then("something else we can check happens too")
	public void something_else_we_can_check_happens_too() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Problem statement");
	}
}
