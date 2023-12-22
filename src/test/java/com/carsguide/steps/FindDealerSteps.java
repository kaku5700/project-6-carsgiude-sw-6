package com.carsguide.steps;

import com.carsguide.pages.FindDealerPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class FindDealerSteps {
    @And("^I click ‘Find a Dealer’ link$")
    public void iClickFindADealerLink() throws InterruptedException {
        Thread.sleep(500);
        new FindDealerPage().clickOnFindADealer();
    }

    @Then("^I am able to see the dealer list$")
    public void iAmAbleToSeeTheDealerList(DataTable dataTable) {
        List<String> expectedList = dataTable.asList(String.class);
        for (String data : expectedList) {
            while (new FindDealerPage().gettingNameOfDealer(data) == null) {
                new FindDealerPage().clickOnNextButton();
            }
            Assert.assertEquals(data, new FindDealerPage().gettingNameOfDealer(data));
        }
    }
}
