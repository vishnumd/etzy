package com.db.awm.bauhaus.project.steps;

import com.db.awm.bauhaus.project.steplib.SampleUser;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

/**
 * Created by ongshir on 05/10/2016.
 */
public class SampleSteps {

    @Steps
    SampleUser user;

    @Given("^this is a sample with two substeps$")
    public void sample() {
        user.step_1();
        user.step_2();
    }
}
