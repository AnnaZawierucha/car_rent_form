package stepDefinitions;

import cucumber.api.java8.En;
import pageObjects.FinalSummaryFormPage;
import static org.assertj.core.api.Assertions.assertThat;

public class FinalSummaryFormStepDefinitions implements En {
    private FinalSummaryFormPage finalSummaryFormPage;

    public FinalSummaryFormStepDefinitions() {
        finalSummaryFormPage = new FinalSummaryFormPage();

        And("^I provide necessary information: name \"([^\"]*)\", last name \"([^\"]*)\", card number \"([^\"]*)\", email \"([^\"]*)\"$", (String name, String lastName, String cardNumber, String email) -> {
            finalSummaryFormPage.fillInName(name);
            finalSummaryFormPage.fillInLastName(lastName);
            finalSummaryFormPage.fillInCardNumber(cardNumber);
            finalSummaryFormPage.fillInEmail(email);
        });

        Then("^The rent button is clickable$", () -> {
            finalSummaryFormPage.clickSubmitButton();
        });

        And("^No error is displayed$", () -> {
            assertThat(finalSummaryFormPage.isNoErrorDisplayed()).isFalse();
        });

    }
}
