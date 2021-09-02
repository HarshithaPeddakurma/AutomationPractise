Feature: Automation Practise dresses page
 
@smoketest
Scenario: Register on the Website
Given Open Chrome and navigate to "http://automationpractice.com/index.php"
When Click on the SignIn and register a account
Then Check Name and Surname are correct after register

@smoketest
Scenario: User should be able to signout and sigin using a valid email address
Given Open Chrome and navigate to "http://automationpractice.com/index.php"
Given Enter the Valid Email address and password
When Click on the Submit Button
Then User should be able to login into the automation practise website

@smoketest
Scenario: User should be successfully add the item to the cart
Given Go to Dresses and click on the Summer dresses
When Click on Add to Cart
Then Validate that product is successfully added to the cart

@smoketest
Scenario: Validate whether same product name colour and quantity are displayed in Payment Summary page
Given Get the productname colour and quantity
When Click on Proceed to CheckOut
Then Validate whether same productname colour and quantity are displayed in the Cart



