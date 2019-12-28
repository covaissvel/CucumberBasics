package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	@Given("^the user is in the login page$")
	public void the_user_is_in_the_login_page() {
	    System.out.println("In the login page");
	}

	@When("the user validates the title of the page")
	public void the_user_validates_the_title_of_the_page() {
		 System.out.println("Successfully validated the title");
	}

	@Then("the user enters the \"([a-zA-Z]{1,})\" username")
	public void the_user_enters_the_valid_username(String username) {
	   System.out.println("Entered the "+username+" username");
	}

	@Then("the user enters the \"([a-zA-Z]{1,})\" password")
	public void the_user_enters_the_valid_password(String password) {
	   System.out.println("Entered the "+password+" password");
	}

	@Then("the user is \"([a-zA-Z]{1,})\" to login successfully")
	public void the_user_is_able_to_login_successfully(String status) {
		System.out.println(status+" to login successfully");
	}
	
//	@Then("the user is not able to login successfully")
//	public void the_user_is_not_able_to_login_successfully() {
//		System.out.println("Not able to login");
//	}

}
