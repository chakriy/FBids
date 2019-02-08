$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("IdCapture.feature");
formatter.feature({
  "line": 1,
  "name": "Capturing IdButtons In Facebook Login Page",
  "description": "",
  "id": "capturing-idbuttons-in-facebook-login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3618172828,
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
  "duration": 4349829389,
  "status": "passed"
});
formatter.match({
  "location": "IdCaptureStepDefs.facebookWhen()"
});
formatter.result({
  "duration": 249940,
  "status": "passed"
});
formatter.match({
  "location": "IdCaptureStepDefs.facebookAnd()"
});
formatter.result({
  "duration": 251147,
  "status": "passed"
});
formatter.match({
  "location": "IdCaptureStepDefs.facebookThen()"
});
formatter.result({
  "duration": 4599024629,
  "status": "passed"
});
formatter.after({
  "duration": 36827,
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
  "duration": 2309642742,
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
  "duration": 7795165528,
  "status": "passed"
});
formatter.match({
  "location": "WindowHandlingStepDefs.step2()"
});
formatter.result({
  "duration": 3347348098,
  "status": "passed"
});
formatter.match({
  "location": "WindowHandlingStepDefs.step3()"
});
formatter.result({
  "duration": 17371041707,
  "status": "passed"
});
formatter.after({
  "duration": 28375,
  "status": "passed"
});
});