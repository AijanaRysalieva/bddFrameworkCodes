$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/DesktopsFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Desktops",
  "description": "",
  "id": "desktops",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2611105100,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User click on Show all desktops",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 4725193700,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsStepDefinition.user_click_on_Desktops_tab()"
});
formatter.result({
  "duration": 88945600,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsStepDefinition.user_click_on_Show_all_desktops()"
});
formatter.result({
  "duration": 980329100,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "User add a review to \u0027Canon EOS 5D\u0027 item inDesktops tab",
  "description": "",
  "id": "desktops;user-add-a-review-to-\u0027canon-eos-5d\u0027-item-indesktops-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@TestingThirdScenario"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User click on \u0027Canon EOS 5D\u0027 item",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User click on write a review link",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user fill the review information with below information",
  "rows": [
    {
      "cells": [
        "yourName",
        "yourReview",
        "rating"
      ],
      "line": 32
    },
    {
      "cells": [
        "Jane",
        "Very good camera, good quality and best price.Recomended",
        "good"
      ],
      "line": 33
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval’",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Canon EOS 5D",
      "offset": 15
    }
  ],
  "location": "DesktopsStepDefinition.user_click_on_item(String)"
});
formatter.result({
  "duration": 2357651400,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsStepDefinition.user_click_on_write_a_review_link()"
});
formatter.result({
  "duration": 105125900,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsStepDefinition.user_fill_the_review_information_with_below_information(DataTable)"
});
formatter.result({
  "duration": 1041846300,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsStepDefinition.user_click_on_Continue_Button()"
});
formatter.result({
  "duration": 636144000,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsStepDefinition.user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval()"
});
formatter.result({
  "duration": 581030100,
  "status": "passed"
});
formatter.after({
  "duration": 891139500,
  "status": "passed"
});
});