package com.easyfundraising.steps;

import com.easyfundraising.page.SimpleSearchPageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SimpleSearchStepDef {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on cookies button$")
    public void iClickOnCookiesButton() {
        new SimpleSearchPageObject().clickonIacceptbutton();
    }

    @And("^I click on Find a cause button$")
    public void iClickOnFindACauseButton() {
        new SimpleSearchPageObject().clickonFindacause();
    }

    @And("^I enter three Character in the Search Field \"([^\"]*)\"$")
    public void iEnterThreeCharacterInTheSearchField(String chr)  {
            new SimpleSearchPageObject().sendThreeChar(chr);
    }

    @And("^I select Third causes from the suggested list$")
    public void iSelectThirdCausesFromTheSuggestedList() {
new SimpleSearchPageObject().selectTexttherd();
    }

    @And("^I click on Search cause button$")
    public void iClickOnSearchCauseButton() {
        new SimpleSearchPageObject().clickonSearchButton();
    }


    @Then("^I Confirm with a message that the selected Third \"([^\"]*)\" exists in the Search results$")
    public void iConfirmWithAMessageThatTheSelectedThirdExistsInTheSearchResults(String vtext)  {
        Assert.assertTrue(new SimpleSearchPageObject().verifythreecausetext().contains(vtext));

    }
}
