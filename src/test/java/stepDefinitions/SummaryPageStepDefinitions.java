package stepDefinitions;

import cucumber.api.java8.En;
import pageObjects.SummaryPage;

import static org.assertj.core.api.Assertions.assertThat;

public class SummaryPageStepDefinitions implements En {
    private SummaryPage summaryPage;

    public SummaryPageStepDefinitions() {

        summaryPage = new SummaryPage();

        And("^The summary for the chosen car \"([^\"]*)\" is presented$", (String carName) -> {
            assertThat(summaryPage.isProperSummaryDisplayed(carName)).isTrue();
        });

        When("^I click the rent button$", () -> {
            summaryPage.clickRentButton();
        });

    }
}
