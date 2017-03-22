package com.db.awm.bauhaus.project.steps;

import com.db.awm.bauhaus.project.pages.MainSearchPage;
import com.db.awm.bauhaus.project.steplib.SearchUser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by ongshir on 05/10/2016.
 */
public class SearchSteps {

    @Steps
    SearchUser user;

    MainSearchPage mainSearchPage;

    @Given("^John is viewing the Etsy landing page$")
    public void goto_landing_page() {
        mainSearchPage.open();
    }

    @When("^he searches for a product from the input box$")
    public void search_from_input_box() {
        user.search_from_input_box();
    }

    @Then("^the result should be displayed$")
    public void verify_search_result() {
        user.verify_result_for_top_categories();
        user.verify_result_for_all_categories();
    }
}
