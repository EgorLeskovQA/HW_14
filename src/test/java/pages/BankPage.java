package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BankPage {

    private SelenideElement
            buttonCard = $("span.fbOPSi7ue"),
            verifyClick = $(".ebnjUd1gM"),
            mainPage = $(".abbSEuNjz"),
            personalAccount = $(".abBLImlAW"),
            tabPersonalAccount =  $("ul.hbBLImlAW"),
            tabSerch = $(".undefined"),
            inputSearch = $("input.cbxgUnghy"),
            clickSearch = $(".cbphTii3t"),
            verifySearchResults = $("[data-testid='question-page']"),
            verifySearchMortgage = $(".a10cvm");


    public BankPage openPage() {
        open("/");
        return this;
    }

    public BankPage arrangeCard() {
        buttonCard.click();
        return this;
    }
    public BankPage verifyResults(String value) {
        verifyClick.shouldHave(text(value));
        return this;
    }
    public BankPage verifyMainPage(String value) {
        mainPage.shouldHave(text(value));
        return this;
    }

    public BankPage hoverPersonalAccount() {
        personalAccount.hover();
        return this;
    }

    public BankPage verifyPersonalAccount() {
        tabPersonalAccount.should(appear);
        return this;
    }

    public BankPage setInputValue(String value) {
        tabSerch.click();
        inputSearch.setValue(value);

        return this;
    }

    public BankPage clickSearchResult() {
        clickSearch.click();
        return this;
    }

    public BankPage verifyResultsSearch(String value) {
        verifySearchResults.shouldHave(text(value));
        return this;
    }

    public BankPage verifySearchMortgageResult(String value) {
        verifySearchMortgage.shouldHave(text(value));
        return this;
    }

}
