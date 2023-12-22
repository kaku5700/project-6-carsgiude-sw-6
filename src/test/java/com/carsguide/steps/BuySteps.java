package com.carsguide.steps;

import com.carsguide.pages.HomePage;
import com.carsguide.pages.NewAndUsedCarSearchPage;
import com.carsguide.pages.ResultPage;
import com.carsguide.pages.UsedCarSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() throws InterruptedException {
        new HomePage().mouseHoverToBuySellTab();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCars();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertEquals("New & Used Car Search - carsguide", new NewAndUsedCarSearchPage().verifyIfNavigateToNewAndUsedCarSearchPage());
    }

    @And("^I select make \"([^\"]*)\" on new and used card search$")
    public void iSelectMakeOnNewAndUsedCardSearch(String text) {
        new NewAndUsedCarSearchPage().selectCarMakeFromDropDown(text);
    }

    @And("^I select model \"([^\"]*)\" on new and used card search$")
    public void iSelectModelOnNewAndUsedCardSearch(String text) {
        new NewAndUsedCarSearchPage().selectCarModelFromDropDown(text);
    }

    @And("^I select location \"([^\"]*)\" on new and used card search$")
    public void iSelectLocationOnNewAndUsedCardSearch(String text)  {
        new NewAndUsedCarSearchPage().selectLocationFromDropDown(text);
    }

    @And("^I select price \"([^\"]*)\" on new and used card search$")
    public void iSelectPriceOnNewAndUsedCardSearch(String text)  {
        new NewAndUsedCarSearchPage().selectCarPriceFromDropDown(text);
    }


    @And("^I click ‘Used’ link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCars();
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
        Assert.assertEquals("Used Cars For Sale", new UsedCarSearchPage().verifyIfNavigateToNewAndUsedCarSearchPage());
    }

    @And("^I select make \"([^\"]*)\" on used card search$")
    public void iSelectMakeOnUsedCardSearch(String text){
        new UsedCarSearchPage().selectCarMakeFromDropDown(text);
    }

    @And("^I select model \"([^\"]*)\" on used card search$")
    public void iSelectModelOnUsedCardSearch(String text){
        new UsedCarSearchPage().selectCarModelFromDropDown(text);
    }

    @And("^I select location \"([^\"]*)\" on used card search$")
    public void iSelectLocationOnUsedCardSearch(String text){
        new UsedCarSearchPage().selectLocationFromDropDown(text);
    }

    @And("^I select price \"([^\"]*)\" on used card search$")
    public void iSelectPriceOnUsedCardSearch(String text){
        new UsedCarSearchPage().selectCarPriceFromDropDown(text);
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String text){
        Assert.assertTrue(new ResultPage().verifyResult().contains(text));
    }

    @And("^I click on Find My Next Car tab on new and used card search$")
    public void iClickOnFindMyNextCarTabOnNewAndUsedCardSearch() {
        new NewAndUsedCarSearchPage().clickingOnFindMyNextCarButton();
    }

    @And("^I click on Find My Next Car tab on used card search$")
    public void iClickOnFindMyNextCarTabOnUsedCardSearch() {
        new UsedCarSearchPage().clickingOnFindMyNextCarButton();
    }
}
