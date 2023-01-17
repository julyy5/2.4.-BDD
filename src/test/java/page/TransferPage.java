package page;

import data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class TransferPage {

    public DashboardPage validDataToTransfer(String amountTransfer, DataHelper.CardInfo cardInfo) {
        $("[data-test-id=\"amount\"] input").setValue(amountTransfer);
        $("[data-test-id=\"from\"] input").setValue(cardInfo.getCardNumber());
        $("[data-test-id=\"action-transfer\"]").click();
        return new DashboardPage();
    }

}