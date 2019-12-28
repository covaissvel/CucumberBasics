package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class CucumberOptionsDefn {
	
	@Before
	public void setup() {
		System.out.println("opening the browser");
	}

	@After
	public void teardown() {
		System.out.println("closing the browser");
	}
	
	@Then("the user enters the dev username")
	public void the_user_enters_the_dev_username() {
	    System.out.println("User entered dev username");
	}

	@Then("the user enters the dev password")
	public void the_user_enters_the_dev_password() {
		 System.out.println("User entered dev password");
	}

	@Then("the user is able to login successfully into dev")
	public void the_user_is_able_to_login_successfully_into_dev() {
		 System.out.println("User successfully logged into dev");
	}

}
