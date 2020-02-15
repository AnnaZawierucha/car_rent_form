package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class IntroPage {
    private SelenideElement
            dropdownCountry = $(By.cssSelector("#country")),
            dropdownCity = $(By.cssSelector("#city")),
            buttonSubmit = $(By.xpath("//button[@type='submit']"));

    public void selectCountry(String country) {
        dropdownCountry.click();
        $(By.xpath("//option[contains(text(),'countryName')]".replace("countryName", country))).click();
    }

    public void selectCity(String city) {
        dropdownCity.click();
        $(By.xpath("//option[text()='xxx']".replace("xxx", city))).click();
    }

    public void inputModel(String model) {
        $(By.xpath("//input[@id='model']")).sendKeys(model);
    }

    public void fillInPickUpDate(String pickUpDate) {
        $(By.xpath("//input[@id='pickup']")).sendKeys(pickUpDate);
    }

    public void fillInDropOffDate(String dropOffDate) {
        $(By.id("dropoff")).sendKeys(dropOffDate);
    }

    public void clickSubmitButton() {
        buttonSubmit.click();
    }
}
