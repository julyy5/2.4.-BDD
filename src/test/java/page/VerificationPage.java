package page;

import data.dataHelper;
import org.w3c.dom.html.HTMLInputElement;

import static com.codeborne.selenide.Selenide.$;


public class VerificationPage {
    public static DashboardPage validData(dataHelper.VerificationCode code) {
        $("[data-test-id=\"code\"] input").setValue(code.getCode());
        $("[data-test-id=action-verify]").click();
        return new DashboardPage();
    }
}
