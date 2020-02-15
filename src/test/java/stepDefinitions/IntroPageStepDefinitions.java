package stepDefinitions;

import com.codeborne.selenide.Selenide;
import cucumber.api.java8.En;
import pageObjects.IntroPage;

public class IntroPageStepDefinitions implements En {
    private IntroPage introPage;

    public IntroPageStepDefinitions() {
        introPage = new IntroPage();

        Given("^I open the page \"([^\"]*)\"$", (String pageUrl) -> {
            Selenide.open(pageUrl);
        });

        When("^I choose country \"([^\"]*)\", city \"([^\"]*)\", model \"([^\"]*)\", pick up date \"([^\"]*)\" and drop off date \"([^\"]*)\"$", (String country, String city, String model, String pickUpDate, String dropOffDate) -> {
            introPage.selectCountry(country);
            introPage.selectCity(city);
            introPage.inputModel(model);
            introPage.fillInPickUpDate(pickUpDate);
            introPage.fillInDropOffDate(dropOffDate);
        });

        And("^I submit my choice$", () -> {
            introPage.clickSubmitButton();
        });




    }
}