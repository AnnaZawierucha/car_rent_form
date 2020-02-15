package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class FinalSummaryFormPage {
    private SelenideElement
            nameField = $(By.cssSelector("#name")),
            lastNameField = $(By.cssSelector("#last_name")),
            cardNumberField = $(By.cssSelector("#card_number")),
            emailField = $(By.cssSelector("#email")),
            buttonSubmit = $(By.xpath("//button[@type='submit']"));

    public void fillInName(String name) {
        nameField.click();
        nameField.sendKeys(name);
    }

    public void fillInLastName(String lastName) {
        lastNameField.click();
        lastNameField.sendKeys(lastName);
    }

    public void fillInCardNumber(String cardNumber) {
        cardNumberField.click();
        cardNumberField.sendKeys(cardNumber);
    }

    public void fillInEmail(String email) {
        emailField.click();
        emailField.sendKeys(email);
    }

    public void clickSubmitButton() {
        buttonSubmit.click();
    }

    public boolean isNoErrorDisplayed() {
        return $(By.className("alert")).isDisplayed();
    }
}
