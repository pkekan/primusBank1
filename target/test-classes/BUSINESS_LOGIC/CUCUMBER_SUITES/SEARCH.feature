Feature: SEARCH Feature

Background: user is successfully logged in and on Admin page
Given user opens "chrome" browser with exe "E://Automation software//chromedriver.exe"
Given user enters url "http://primusbank.qedgetech.com/"
When user enters "Admin" as username
When user enters "Admin" as password
When user click on the "login" button


@SmokeTest
Scenario: Search Functionality with valid data
When user able to click on "Branch" button
When user able to select Country as "INDIA"
When user able to select State as "MAHARASTRA"
When user able to select City as "MUMBAI"
When user able to click "Search" button
Then Application shows search result for "MUMBAI" city
