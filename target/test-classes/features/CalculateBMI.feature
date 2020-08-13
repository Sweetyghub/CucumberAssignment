
Feature: Calculate BMI 
Calculate BMI of multiple persons

@Regression
Scenario: BMI Calculator Launching
Given Calculator url is launched
When user clicks on BMI calculator
Then BMI calculator page is loaded



@Regression
Scenario: BMI calculation of 5 persons
Given BMI calculator is launched
When user enter below details and calculate BMI 
|10    |     127   |    40     |
|30    |   156     |70        |
|25    |   152     | 55       |
|20    |   160     |45        |
|35    |   160     |70        |
Then user exits the application

