package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buySell;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCars;
    @CacheLookup
    @FindBy(xpath = "//div[@class='uhf-child-content']//a[contains(text(),'Used')]")
    WebElement usedCars;

    public void mouseHoverToBuySellTab() throws InterruptedException {
        Thread.sleep(500);
        mouseHoverToElement(buySell);
        log.info("Mouse Hover to Buy+Sell Tab " + buySell.toString());
    }

    public void clickOnSearchCars() {
        clickOnElement(searchCars);
        log.info("Click on Search Cars " + searchCars.toString());
    }

    public void clickOnUsedCars() {
        clickOnElement(usedCars);
        log.info("Click on Used Cars " + usedCars.toString());
    }
}