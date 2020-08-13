$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CalculateBMI.feature");
formatter.feature({
  "line": 2,
  "name": "Calculate BMI",
  "description": "Calculate BMI of multiple persons",
  "id": "calculate-bmi",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "BMI Calculator Launching",
  "description": "",
  "id": "calculate-bmi;bmi-calculator-launching",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Calculator url is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user clicks on BMI calculator",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "BMI calculator page is loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculateBMISteps.calculator_url_is_launched()"
});
formatter.result({
  "duration": 7901435100,
  "status": "passed"
});
formatter.match({
  "location": "CalculateBMISteps.user_clicks_on_BMI_calculator()"
});
formatter.result({
  "duration": 783086200,
  "status": "passed"
});
formatter.match({
  "location": "CalculateBMISteps.bmi_calculator_page_is_loaded()"
});
formatter.result({
  "duration": 46807900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "BMI calculation of 5 persons",
  "description": "",
  "id": "calculate-bmi;bmi-calculation-of-5-persons",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "BMI calculator is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user enter below details and calculate BMI",
  "rows": [
    {
      "cells": [
        "10",
        "127",
        "40"
      ],
      "line": 17
    },
    {
      "cells": [
        "30",
        "156",
        "70"
      ],
      "line": 18
    },
    {
      "cells": [
        "25",
        "152",
        "55"
      ],
      "line": 19
    },
    {
      "cells": [
        "20",
        "160",
        "45"
      ],
      "line": 20
    },
    {
      "cells": [
        "35",
        "160",
        "70"
      ],
      "line": 21
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user exits the application",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculateBMISteps.bmi_calculator_is_launched()"
});
formatter.result({
  "duration": 10657000,
  "status": "passed"
});
formatter.match({
  "location": "CalculateBMISteps.user_enter_below_details_and_calculate_BMI(DataTable)"
});
formatter.result({
  "duration": 12665698300,
  "status": "passed"
});
formatter.match({
  "location": "CalculateBMISteps.user_exits_the_application()"
});
formatter.result({
  "duration": 4740008800,
  "status": "passed"
});
});