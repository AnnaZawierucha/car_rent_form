$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TestCase1.feature");
formatter.feature({
  "name": "Car rent form",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check system behaviour when user provides all the necessary data and fill in all the required steps",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CarRent"
    }
  ]
});
formatter.step({
  "name": "I open the page \"http://qalab.pl.tivixlabs.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "IntroPageStepDefinitions.java:13"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose country \"Poland\", city \"Wroclaw\", model \"abc\", pick up date \"14.02.2020\" and drop off date \"16.02.2020\"",
  "keyword": "And "
});
formatter.match({
  "location": "IntroPageStepDefinitions.java:17"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit my choice",
  "keyword": "And "
});
formatter.match({
  "location": "IntroPageStepDefinitions.java:25"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose car from company \"Charles-Alvarez\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarListPageStepDefinitions.java:13"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The summary for the chosen car \"Toyota RAV4\" is presented",
  "keyword": "And "
});
formatter.match({
  "location": "SummaryPageStepDefinitions.java:15"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the rent button",
  "keyword": "When "
});
formatter.match({
  "location": "SummaryPageStepDefinitions.java:19"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide necessary information: name \"Anna\", last name \"Zawierucha\", card number \"12345\", email \"zawierucha.ania@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "FinalSummaryFormStepDefinitions.java:13"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The rent button is clickable",
  "keyword": "Then "
});
formatter.match({
  "location": "FinalSummaryFormStepDefinitions.java:20"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "No error is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "FinalSummaryFormStepDefinitions.java:24"
});
formatter.result({
  "status": "passed"
});
});