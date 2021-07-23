Feature: Login into Application


Scenario Outline: Positive test Validation login
Given Initialize the browser with chrome
And Navigate to "https://courses.rahulshettyacademy.com/" Site
And click on Login link in home page to land on Secure sign in page
When User enters "<username>" and "<password>"
Then Verify that user is successfully logged in

Examples:
|username											|password				|
|rupampramanick007@gmail.com	|Rupam123				|
|rupam@gmail.com							|sfdd						|
