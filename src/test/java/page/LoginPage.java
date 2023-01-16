package page;

import data.dataHelper;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    public LoginPage ValidLogin(dataHelper.AuthInfo info) {
        $("[data-test-id=login] input").setValue(info.getLogin());
        $("[data-test-id=password] input").setValue(info.getPassword());
        $("[data-test-id=action-login]").click();
        return page(LoginPage.class);
    }
}
