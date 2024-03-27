
Feature: Login Page

Scenario: To check the login functionality with valid credentials 

Given Open the Chrome Browser
And Enter The Url
When User Enter the valid username and password 
And cliks on the login 
Then user should be redirected to th logout page
Then close the chromeBrowser


Scenario: To check the login with invalid credentails
Given Open the Chrome Browser
And Enter The Url "https://practice.expandtesting.com/login"
When User Enter the valid username "xxx" and password "xxx30958"
And cliks on the login 
Then user should be redirected to login page with title "Test Automation Practice: Working with Login form"
Then close the chromeBrowser




