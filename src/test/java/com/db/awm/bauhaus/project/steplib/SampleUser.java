package com.db.awm.bauhaus.project.steplib;

import com.db.awm.bauhaus.project.pages.SamplePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by ongshir on 05/10/2016.
 */
public class SampleUser extends ScenarioSteps {

    SamplePage samplePage;

    @Step
    public void step_1() {
        samplePage.clickMe1();
    }

    @Step
    public void step_2() {
        samplePage.clickMe2();
    }
}
