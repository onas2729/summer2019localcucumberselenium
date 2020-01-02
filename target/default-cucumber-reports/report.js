$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/NavigationMenu.feature");
formatter.feature({
  "name": "Navigation menu",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Marketing --\u003e Campaigns",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@special"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the sales manager information",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.the_user_enters_the_sales_manager_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to Marketing, Campaigns",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationMenuStepDefintions.the_user_goes_to_Marketing_Campaigns()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the url should be https://qa3.vytrack.com/campaign/",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationMenuStepDefintions.the_url_should_be_https_qa_vytrack_com_campaign(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});