$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sportsbet.feature");
formatter.feature({
  "line": 1,
  "name": "Bet on top two runners and validate",
  "description": "",
  "id": "bet-on-top-two-runners-and-validate",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5556490900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User bets twice on the top runner in the race",
  "description": "",
  "id": "bet-on-top-two-runners-and-validate;user-bets-twice-on-the-top-runner-in-the-race",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sportsbet-bettoptwo"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User opens the \"Sportsbet\" website in \"420\" px width",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User checks the next race time remaining to bet",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User starts to bet on the next race",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Sportsbet",
      "offset": 16
    },
    {
      "val": "420",
      "offset": 39
    }
  ],
  "location": "sportsbet_home.userOpensTheWebsiteIn(String,int)"
});
formatter.result({
  "duration": 18402995096,
  "status": "passed"
});
formatter.match({
  "location": "sportsbet_home.userChecksTheNextRaceTimeRemianingToBet()"
});
formatter.result({
  "duration": 576160014,
  "status": "passed"
});
formatter.match({
  "location": "sportsbet_home.userStartsToBetOnTheNextRace()"
});
formatter.result({
  "duration": 297212076,
  "status": "passed"
});
formatter.after({
  "duration": 304454580,
  "status": "passed"
});
});