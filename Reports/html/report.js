$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/acer/youtube-workspace/OtriumCucumber/src/test/resources/Feature/Myaccount.feature");
formatter.feature({
  "name": "To Validate the My accout functionality of Otrium",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to Launch Browser and url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepdefinitionClass.user_has_to_Launch_Browser_and_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigate to Login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User clicks on the Login link",
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinitionClass.user_clicks_on_the_Login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be navigated to the Login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefinitionClass.user_should_be_navigated_to_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
});