package com.easyfundraising.page;
import com.easyfundraising.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SimpleSearchPageObject extends Utility {
    private static final Logger log = LogManager.getLogger(SimpleSearchPageObject.class.getName());

    public SimpleSearchPageObject() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='cookieConsentPopup']/button")
    WebElement cookies;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Find a cause')]")
    WebElement findacause;

    public void clickonIacceptbutton() {
        clickOnElement(cookies);
    }

    public void clickonFindacause() {
        clickOnElement(findacause);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='sagc-hero-search-input']")
    WebElement threechar;

    public void sendThreeChar(String text) {
        sendTextToElement(threechar, text);
    }

@CacheLookup
    @FindBy(xpath = "//ul[@id='sagc-hero-search-input-auto-suggest']/li[3]/button[1]")
    List<WebElement> selcttext;

    public void selectTexttherd(){
        for (int i = 0; i<selcttext.size(); i++){
            System.out.println(selcttext.get(i).getText());
            if(selcttext.get(i).getText().contains("Save The Children")){
                selcttext.get(i).click();
            }
        }
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Search cause')]")
    WebElement seachbutton;
    public void clickonSearchButton(){
        clickOnElement(seachbutton);
    }
@CacheLookup
    @FindBy(xpath = "//h1[@class='typography-2xl font-v2-heavy my-v2-32']")
    WebElement verefytext;
    public String verifythreecausetext(){
        String message = getTextFromElement(verefytext);
        return message;
    }
}

