package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
public class StepDefination {

	
	@Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //code to navigate login url
		System.out.println("navigate to login url");
    }
	 @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {
		 System.out.println("Deciding a browser t open");
	    }

	    @When("^browser is triggerred$")
	    public void browser_is_triggerred() throws Throwable {
	    	System.out.println("Browser is trieggred");
	    }
	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	       System.out.println("browser is open");
	    }

	    @Then("^check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	    	System.out.println("Browser is started");
	    }

    @When("^User login into the application with username and password$")
    public void user_login_into_the_application_with_username_and_password() throws Throwable {
      //code to login
    	System.out.println("login successfully");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //homepage validation
    	System.out.println("validated homepage");
    }

    @When("User login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String arg1, String arg2) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(arg1);
	System.out.println(arg2);

}
      @Then("Cards displayed are {string}")
    public void cards_displayed_are(String arg1) {
    // Write code here that turns the phrase above into concrete actions
   System.out.println(arg1);
}
       
      @When("^User login into application with \"([^\"]*)\" and password  \"([^\"]*)\"$")
      public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
         System.out.println(strArg1);
         System.out.println(strArg2);
      }

      @Then("^Error message should be displayed$")
      public void error_message_should_be_displayed() throws Throwable {
         
      }
      

      @And("^cards displayed are \"([^\"]*)\"$")
      public void cards_displayed_are_something(String strArg1) throws Throwable {
         System.out.println(strArg1);
	}
      
      @When("^User sign up with following details$")
      public void user_sign_up_with_following_details(DataTable data) throws Throwable {
          List<List<String>> obj = data.asLists();
          System.out.println(obj.get(0).get(0));
          System.out.println(obj.get(0).get(1));
          System.out.println(obj.get(0).get(2));
          System.out.println(obj.get(0).get(3));
          System.out.println(obj.get(0).get(4));
}
      @When("^User login into application with (.+) and password (.+)$")
      public void user_login_into_application_with_and_password1(String username, String password) throws Throwable {
         System.out.println(username);
         System.out.println(password);
}
}