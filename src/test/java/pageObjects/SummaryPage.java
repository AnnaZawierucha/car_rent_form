package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SummaryPage {
    private SelenideElement
            buttonRent = $(By.xpath("//a[text()='Rent!']"));

    public boolean isProperSummaryDisplayed(String carName) {
        return $$(By.xpath("//div[@class='card-header']")).findBy(Condition.text(carName)).shouldBe(Condition.visible).isDisplayed();
    }

    public void clickRentButton(){
        buttonRent.click();
    }
}
