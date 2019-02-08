$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("IdCapture.feature");
formatter.feature({
  "line": 1,
  "name": "Capturing IdButtons In Facebook Login Page",
  "description": "",
  "id": "capturing-idbuttons-in-facebook-login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 24294844953,
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
  "duration": 6026006463,
  "status": "passed"
});
formatter.match({
  "location": "IdCaptureStepDefs.facebookWhen()"
});
formatter.result({
  "duration": 105047,
  "status": "passed"
});
formatter.match({
  "location": "IdCaptureStepDefs.facebookAnd()"
});
formatter.result({
  "duration": 75465,
  "status": "passed"
});
formatter.match({
  "location": "IdCaptureStepDefs.facebookThen()"
});
formatter.result({
  "duration": 4809925284,
  "status": "passed"
});
formatter.after({
  "duration": 33809,
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
  "duration": 6196152973,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Opening Multiple pages from Naukri.com",
  "description": "",
  "id": "handling-multiple-webpages;opening-multiple-pages-from-naukri.com",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Opening the Naukri Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Opening multiple pages from Naukri Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Closing All Windows",
  "keyword": "Then "
});
formatter.match({
  "location": "WindowHandlingStepDefs.step1()"
});
formatter.result({
  "duration": 10589962786,
  "status": "passed"
});
formatter.match({
  "location": "WindowHandlingStepDefs.step2()"
});
formatter.result({
  "duration": 3303132222,
  "status": "passed"
});
formatter.match({
  "location": "WindowHandlingStepDefs.step3()"
});
formatter.result({
  "duration": 17371625505,
  "status": "passed"
});
formatter.after({
  "duration": 25960,
  "status": "passed"
});
});