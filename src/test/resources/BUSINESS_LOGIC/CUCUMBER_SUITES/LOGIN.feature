Feature: LOGIN Feature

Background: user is successfully logged in
Given user opens "chrome" browser with exe "E://Automation software//chromedriver.exe"
Given user enters url "http://primusbank.qedgetech.com/"


@SmokeTest
Scenario: Login functinality for valid username and valid password
When user enters "Admin" as username
When user enters "Admin" as password
When user click on the "login" button
When user able to click on "Branch" button


