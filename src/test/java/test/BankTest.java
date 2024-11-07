package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BankPage;

import static io.qameta.allure.Allure.step;

@Tag("main")
public class BankTest  extends TestBase{

    BankPage bankPage = new BankPage();

    @Test
    @DisplayName("Отображение главной страницы")
    void checkMainPage() {
        step("Открыть главную страницу ТБанка", () -> {
            bankPage.openPage();
        });

        step("Отображение текста на главной странице", () -> {
            bankPage.verifyMainPage("Дебетовая карта, которую рекомендуют ваши друзья");
        });

    }

    @Test
    @DisplayName("Наличие нужных элементов при нажатии на 'Оформить карту'")
    void debitCardRegistration() {
        step("Открыть главную страницу ТБанка", () -> {
            bankPage.openPage();
        });

        step("Нажатие на кнопку 'Оформить карту' на главной странице", () -> {
            bankPage.arrangeCard();
        });

        step("Открытие страницы оформления карты", () -> {
            bankPage.verifyResults("Дебетовая карта Black");
        });
    }


    @Test
    @DisplayName("Отображение тултипа при наведении на 'Личный кабинет'")
    void chekPersonalAccount() {
        step("Открыть главную страницу ТБанка", () -> {
            bankPage.openPage();
        });

        step("Наведение на 'Личный кабинет'", () -> {
            bankPage.hoverPersonalAccount();
        });

        step("Отображение Тултипа", () -> {
            bankPage.verifyPersonalAccount();
        });
    }

    @Test
    @DisplayName("Корректная работа поиска 'Кредит'")
    void  searchResultsCredit() {
        step("Открыть главную страницу ТБанка", () -> {
            bankPage.openPage();
        });

        step("Ввод в поле поика", () -> {
            bankPage.setInputValue("Кредит");
        });

        step("Клик на Выдачу выпадающего списка", () -> {
            bankPage.clickSearchResult();
        });

        step("Результат поиска", () -> {
            bankPage.verifyResultsSearch("Погасить кредит");
        });
    }

    @Test
    @DisplayName("Корректная работа поиска 'Ипотека'")
    void  searchResultsMortgage() {
        step("Открыть главную страницу ТБанка", () -> {
            bankPage.openPage();
        });

        step("Ввод в поле поика", () -> {
            bankPage.setInputValue("Ипотека");
        });

        step("Клик на Выдачу выпадающего списка", () -> {
            bankPage.clickSearchResult();
        });

        step("Результат поиска", () -> {
            bankPage.verifySearchMortgageResult("Ипотека на вторичное жилье");
        });
    }

}
