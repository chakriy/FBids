$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("IdCapture.feature");
formatter.feature({
  "line": 1,
  "name": "Capturing IdButtons In Facebook Login Page",
  "description": "",
  "id": "capturing-idbuttons-in-facebook-login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4243549248,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "IdButtons In Facebook",
  "description": "",
  "id": "capturing-idbuttons-in-facebook-login-page;idbuttons-in-facebook",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I Have a Chrome Browser Opened",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Open Facebook Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Capture all Id\u0027s in loginPage",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Quit the Chrome Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "IdCaptureStepDefs.step()"
});
formatter.result({
  "duration": 3746062536,
  "status": "passed"
});
formatter.match({
  "location": "IdCaptureStepDefs.facebookWhen()"
});
formatter.result({
  "duration": 125574,
  "status": "passed"
});
formatter.match({
  "location": "IdCaptureStepDefs.facebookAnd()"
});
formatter.result({
  "duration": 69428,
  "status": "passed"
});
formatter.match({
  "location": "IdCaptureStepDefs.facebookThen()"
});
formatter.result({
  "duration": 4586745560,
  "status": "passed"
});
formatter.after({
  "duration": 27771,
  "status": "passed"
});
formatter.uri("WindowHandling.feature");
formatter.feature({
  "line": 1,
  "name": "Handling Multiple WebPages",
  "description": "",
  "id": "handling-multiple-webpages",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2304119908,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Opening Multiple pages from Santander",
  "description": "",
  "id": "handling-multiple-webpages;opening-multiple-pages-from-santander",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Opening the Santander Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "opening multiple pages from Santander",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Getting back to Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "WindowHandlingStepDefs.step1()"
});
formatter.result({
  "duration": 5299966313,
  "status": "passed"
});
formatter.match({
  "location": "WindowHandlingStepDefs.step2()"
});
formatter.result({
  "duration": 1634219716,
  "status": "passed"
});
formatter.match({
  "location": "WindowHandlingStepDefs.step3()"
});
formatter.result({
  "duration": 136616485,
  "status": "passed"
});
formatter.after({
  "duration": 21734,
  "status": "passed"
});
});