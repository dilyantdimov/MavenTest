$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "ToolsQA Tutorial",
  "description": "",
  "id": "toolsqa-tutorial",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4268824000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "End2End Scenario",
  "description": "",
  "id": "toolsqa-tutorial;end2end-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I choose the first one",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I select colour from the dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I select size from the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify the chosen product",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.i_am_on_the_Homepage()"
});
formatter.result({
  "duration": 5881467900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dress",
      "offset": 14
    }
  ],
  "location": "HomePageSteps.i_search_for(String)"
});
formatter.result({
  "duration": 3080742200,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageSteps.i_choose_the_first_one()"
});
formatter.result({
  "duration": 3358145900,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageSteps.iSelectColourFromTheDropdown()"
});
formatter.result({
  "duration": 125998900,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageSteps.iSelectSizeFromTheDropdown()"
});
formatter.result({
  "duration": 157836500,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageSteps.iVerifyTheChosenProduct()"
});
formatter.result({
  "duration": 55522200,
  "status": "passed"
});
formatter.after({
  "duration": 754141000,
  "status": "passed"
});
});