package com.db.am.bauhaus.project.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

/**
 * Created by ongshir on 05/10/2016.
 */
@DefaultUrl("/")
public class MainSearchPage extends PageObject {

    @FindBy(id = "search-query")
    WebElementFacade inputBox;

    @FindBy(css = "#gnav-search div.search-button-wrapper.hide > button")
    WebElementFacade searchButton;

    @FindBy(css = "vesta-hp-curated-category")
    WebElementFacade productLink;

    public MainSearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchFromInputBox(String searchText) {
        inputBox.waitUntilPresent().sendKeys(searchText);
        searchButton.click();
    }

    public String getTopCategoriesHeader() {
        return find(By.cssSelector("h4.pb-xs-1-5")).getText();
    }

    public String getAllCategoriesHeader() {
        return find(By.cssSelector("#content div:nth-child(1) > h1")).getText();
    }

    public void clickProductIcon(int n) {
        find(By.cssSelector("#content > div:nth-child(2) > div > span.vesta-hp-category-default > div > div > div > div:nth-child("+n+")")).click();
    }

    public String getTitle() {
        return find(By.cssSelector("div.float-left h1")).getText();
    }

    public void selectProductCategory(String category){
        find(By.linkText(category)).click();
    }

    public void selectSubProductCategory(String subCategory){
        find(By.linkText(subCategory)).click();
    }
}
