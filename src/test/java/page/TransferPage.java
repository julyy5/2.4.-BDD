package page;

import data.dataHelper;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class transferPage {

   // public DashboardPage validDataToTransfer(String amountTransfer, dataHelper.CardInfo cardInfo){
     //   transfer(amountTransfer, cardInfo);
      //  return new DashboardPage();
   // }
    public DashboardPage validDataToTransfer(String amountTransfer, dataHelper.CardInfo cardInfo){
        $("[data-test-id=\"amount\"] input").setValue(amountTransfer);
        $("[data-test-id=\"from\"] input").setValue(cardInfo.getCardNumber());
        $("[data-test-id=\"action-transfer\"]").click();
        return new DashboardPage();
    }

}