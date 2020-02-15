package stepDefinitions;

import cucumber.api.java8.En;
import pageObjects.CarListPage;

public class CarListPageStepDefinitions implements En {

    private CarListPage carListPage;

    public CarListPageStepDefinitions() {
        carListPage = new CarListPage();

        When("^I choose car from company \"([^\"]*)\"$", (String companyName) -> {
            carListPage.chooseCarFromSpecificCompany(companyName);
        });
    }
}
