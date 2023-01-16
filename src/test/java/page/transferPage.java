package page;

import data.dataHelper;

import static com.codeborne.selenide.Selenide.$;

public class transferPage {

   // public DashboardPage validDataToTransfer(String amountTransfer, dataHelper.CardInfo cardInfo){
     //   transfer(amountTransfer, cardInfo);
      //  return new DashboardPage();
   // }
    public DashboardPage validDataToTransfer(String amountTransfer, dataHelper.CardInfo cardInfo){
        $("[data-test-id=\"amount\"]").setValue(amountTransfer);
        $("[data-test-id=\"from\"]").setValue(cardInfo.getCardNumber());
        $("[data-test-id=\"action-transfer\"]").click();
        return new DashboardPage();
    }

}