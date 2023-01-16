package test;

import data.dataHelper;
import org.junit.jupiter.api.Test;
import page.LoginPage;
import page.VerificationPage;
import page.DashboardPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTransferTest {
    @Test

    void shouldTransferMoneyBetweenOwnCards() {
        var loginPage = open("http://localhost:9999", LoginPage.class);
        var authInfo = dataHelper.getAuthInfo();
        var verificationPage = loginPage.ValidLogin(authInfo);
        var VerificationCode = dataHelper.getVerificationCodeFor(authInfo);
        var dashboardPage = VerificationPage.validData(VerificationCode);
        var firstCard = dataHelper.getFirstCard();
        var secondCard = dataHelper.getSecondCard();
        var firstCardBalance = DashboardPage.CardBalance(firstCard);
        var secondCardBalance = DashboardPage.CardBalance(secondCard);
        var amount = 100;
        var transferPage = DashboardPage.selectCard(secondCard);
        DashboardPage dashboardPage1 = transferPage.validDataToTransfer(String.valueOf(amount), firstCard);
        var expectedBalance1Card = firstCardBalance - amount;
        var expectedBalance2Card = secondCardBalance + amount;
        var balanceNow1Card = DashboardPage.CardBalance(firstCard);
        var balanceNow2Card = DashboardPage.CardBalance(secondCard);
        assertEquals(expectedBalance1Card, balanceNow1Card);
        assertEquals(expectedBalance2Card, balanceNow2Card);
    }
}


