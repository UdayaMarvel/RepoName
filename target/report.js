$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FacebookSignUp.feature");
formatter.feature({
  "name": "Facebook Signup",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@f"
    }
  ]
});
formatter.scenario({
  "name": "Sign Up",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@f"
    },
    {
      "name": "@s1"
    },
    {
      "name": "@s2"
    },
    {
      "name": "@s3"
    },
    {
      "name": "@s4"
    }
  ]
});
formatter.step({
  "name": "User create a new account",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUp.user_create_a_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters firstname",
  "keyword": "When "
});
formatter.match({
  "location": "SignUp.user_enters_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters lastname",
  "keyword": "And "
});
formatter.match({
  "location": "SignUp.user_enters_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters emailId",
  "keyword": "And "
});
formatter.match({
  "location": "SignUp.user_enters_email_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the signup page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify the signup is enabled",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Sign",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@f"
    },
    {
      "name": "@s2"
    },
    {
      "name": "@s3"
    }
  ]
});
formatter.step({
  "name": "User create a new account",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUp.user_create_a_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters firstname",
  "keyword": "When "
});
formatter.match({
  "location": "SignUp.user_enters_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters lastname",
  "keyword": "And "
});
formatter.match({
  "location": "SignUp.user_enters_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters emailId",
  "keyword": "And "
});
formatter.match({
  "location": "SignUp.user_enters_email_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the signup page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify the signup is enabled",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});