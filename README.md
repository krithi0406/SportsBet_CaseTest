# Selenium Project With Cucumber
This project includes cucumber BDD Test for Case Scenario for testing in Sportsbet Mobile view

Test scenarios are described in the feature files located here src/test/java/Features



Installation
You need to have Java 8 JDK installed along with maven.

To run the tests locally with Chrome, install ChromeDriver from here, add its location to your system PATH and add webdriver.chrome.driver=path/to/the/driver to your local variables.

To run the tests locally with Firefox, install GeckoDriver from here and add its location to your system PATH.

To install all dependencies, run

$ mvn clean install
Running tests
$ mvn test   or right click on the TestRunner file and select Run Test Runner
By default, tests will run on Chrome. To change that, specify -Dbrowser={browser} where {browser} is either chrome or firefox. If you haven't added the chrome driver path to your local variables, you can add it directly in the run command with the option -Dwebdriver.chrome.driver=path/to/the/driver.

You can also select specific scenarios to execute using -Dcucumber.options="--tags @your_tag". More info about tags and how to combine them here.





Automation Journey



1. Navigate to https://www.sportsbet.com.au using a browser window with width 420px,
   click on the first card under the ‘Next to Jump’ carousel which will navigate you to a
   racecard

2. Add two different bets into your Bet Slip by clicking on the market button for a
   particular horse

3. Open the Bet Slip (yellow button in the top right) and confirm the correct two bets have been added.



Assumptions:

Framework Use:

Sportsbet site is build on Java , C/C++ so I assumed to use a Selenium Java based JunitTest automation framework integrated with Cucumber BDD
Looking at the elements in the DOM , there are no ng- elements and hence there is requirement to use a Javascript/Nodejs based framework like protractor
Only UI Test with Screen dimension set to a defined width for a very dynamic website
Tested only in chrome browser as there is no specification of any browser in the requirement

Functionality to Case Test

1. Since we have to bet on same run with 2 diff bets , I assumed 1 bet for win and 1 bet for place
2. My Assumption for this case study is to choose or select the first race which is not under 1minute(M) to avoid the chance of the race getting on live
3. Test the bet slip screen only after both bets have been added
4. Assumed will bet on the favourite runner alone(not any runner)



Challenges :

1. Selecting the First displayed Race - Its risky as race with very few secs left to bet might go into Live before we complete the bet and test will fail
2. Some races have only Win option and no place option ( few races that happen overseas , very early AEST morning time)
3. Some bets when page loads in 420px do not load the win/place values
4. Some races have multiple favourite runners at a given time
5. Betting value keeps changing real time hence its challenging to assert if the selection is valid when the test is complete
6. Capturing xpath is a bit challenging as there is no ID and also there are multiple columns and components and each element is in a diff DIV
7. Had to use multiple relative Xpaths


Other possible problems :

1. Highly dynamic website , so chances that we would have to refactor bit of code and have constant maintenance effort
2. Chances of getting False positives and false negatives
3. Testing the WebApp
4. Testing cross browsers in mobile mode
5.  PopUps ?
6. Might have to add more wait times on diff tests
7. Parallel execution might be an issue with same user sessions as betslip will get added with new bets each time and tests checking betslips counts might start failing


Improvement Areas
1. Include API Tests if possible , can add Rest Assured dependencies to the framework and tests rest apis
2. Discuss with Devs to see if they can include ID to the DOM elements
3. Use multi users for tests running in parallel

