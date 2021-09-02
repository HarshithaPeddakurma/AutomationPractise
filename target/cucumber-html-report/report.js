$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("automationpractise.feature");
formatter.feature({
  "line": 1,
  "name": "Automation Practise dresses page",
  "description": "",
  "id": "automation-practise-dresses-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 9,
  "name": "User should be able to register using a valid email address",
  "description": "",
  "id": "automation-practise-dresses-page;user-should-be-able-to-register-using-a-valid-email-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Open Chrome and navigate to \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Enter the Valid Email address and password",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Click on the Submit Button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should be able to login into the automation practise website",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 29
    }
  ],
  "location": "stepdefination.open_chrome_and_navigate_to_something(String)"
});
formatter.result({
  "duration": 8969915200,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.enter_the_valid_email_address_and_password()"
});
formatter.result({
  "duration": 2373383400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.click_on_the_submit_button()"
});
formatter.result({
  "duration": 1786286300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_should_be_able_to_login_into_the_automation_practise_website()"
});
formatter.result({
  "duration": 86374700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User should be successfully add the item to the cart",
  "description": "",
  "id": "automation-practise-dresses-page;user-should-be-successfully-add-the-item-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Go to Dresses and click on the Summer dresses",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Click on Add to Cart",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Validate that product is successfully added to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.go_to_dresses_and_click_on_the_summer_dresses()"
});
formatter.result({
  "duration": 3027797500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.click_on_add_to_cart()"
});
formatter.result({
  "duration": 252144500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.validate_that_product_is_successfully_added_to_the_cart()"
});
formatter.result({
  "duration": 57696700,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Validate whether same product name colour and quantity are displayed in Cart Summary page",
  "description": "",
  "id": "automation-practise-dresses-page;validate-whether-same-product-name-colour-and-quantity-are-displayed-in-cart-summary-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "Get the productname colour and quantity",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Click on Proceed to CheckOut",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Validate whether same productname colour and quantity are displayed in the Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.get_the_productname_colour_and_quantity()"
});
formatter.result({
  "duration": 10206905000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.click_on_proceed_to_checkout()"
});
formatter.result({
  "duration": 12699428700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.validate_whether_same_productname_colour_and_quantity_are_displayed_in_the_cart()"
});
formatter.result({
  "duration": 5229146800,
  "status": "passed"
});
});