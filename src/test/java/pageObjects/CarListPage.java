package pageObjects;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class CarListPage {

    public void chooseCarFromSpecificCompany(String companyName) {
        $(By.xpath("//td[contains(text(),'companyName')]/..//td//a".replace("companyName", companyName))).click();
    }
}
