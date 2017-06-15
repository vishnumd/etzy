package com.db.am.bauhaus.project.steps;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import com.jayway.restassured.specification.ResponseSpecification;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class APISteps {
    private Response response;
    public RequestSpecification request;


    @Given("^I access the Etsy landing page$")
    public void makeCall() {
        response = get("https://www.etsy.com/api/v3/ajax/public/category-nav/view/subnav?responsive_enabled=true");
    }

    @Then("^It should list the product categories$")
    public void i_should_the_text_displayed() throws Throwable {
        response.then().body("data.roots.node.name", hasItems("Clothing & Accessories", "Jewelry", "Craft Supplies & Tools", "Weddings", "Entertainment", "Home & Living", "Kids & Baby", "Vintage"));
    }
}