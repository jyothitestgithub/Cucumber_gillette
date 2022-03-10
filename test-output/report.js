$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Products.feature");
formatter.feature({
  "name": "Product verification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verification of a Product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "ProductsSteps.initialize_the_browser_with_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to \"https://www.gillette.co.in/en-in\" site",
  "keyword": "And "
});
formatter.match({
  "location": "ProductsSteps.navigate_to_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hovers on Products",
  "keyword": "When "
});
formatter.match({
  "location": "ProductsSteps.user_hovers_on_Products()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"MACH3\" under By Brands",
  "keyword": "And "
});
formatter.match({
  "location": "ProductsSteps.user_clicks_on_under_By_Brands(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that text \"Gillette MACH3 Turbo\" is displayed under out of products list",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsSteps.verify_that_text_is_displayed_under_out_of_products_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "ProductsSteps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/Searchoption.feature");
formatter.feature({
  "name": "Search icon functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verification of search functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "name": "Navigate to \"https://www.gillette.co.in/en-in\" site",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Search icon",
  "keyword": "When "
});
formatter.step({
  "name": "User enters search \u003ckeyword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User again clicks on Search icon",
  "keyword": "And "
});
formatter.step({
  "name": "Verify that text \u003cresult\u003e is displayed at the top of search results",
  "keyword": "Then "
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "keyword",
        "result"
      ]
    },
    {
      "cells": [
        "Razor",
        "Results For \"Razor\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verification of search functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "ProductsSteps.initialize_the_browser_with_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to \"https://www.gillette.co.in/en-in\" site",
  "keyword": "And "
});
formatter.match({
  "location": "ProductsSteps.navigate_to_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Search icon",
  "keyword": "When "
});
formatter.match({
  "location": "ProductsSteps.user_clicks_on_search_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters search Razor",
  "keyword": "And "
});
formatter.match({
  "location": "ProductsSteps.user_enters_search(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User again clicks on Search icon",
  "keyword": "And "
});
formatter.match({
  "location": "ProductsSteps.user_again_clicks_on_search_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that text Results For \"Razor\" is displayed at the top of search results",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsSteps.verify_that_text_is_displayed_at_the_top_of_search_results(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "ProductsSteps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/Styling.feature");
formatter.feature({
  "name": "Styling verification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verification of styling",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "ProductsSteps.initialize_the_browser_with_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to \"https://www.gillette.co.in/en-in\" site",
  "keyword": "And "
});
formatter.match({
  "location": "ProductsSteps.navigate_to_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"Styling\" under \"Learn\" in footer",
  "keyword": "When "
});
formatter.match({
  "location": "ProductsSteps.user_clicks_on_something_under_something_in_footer(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that text \"Facial Hair Styles: The Anchor Beard\" is displayed under list of articles under styling",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsSteps.verify_that_text_something_is_displayed_under_list_of_articles_under_styling(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "ProductsSteps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});