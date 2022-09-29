@sportsbet
Feature: Bet on top two runners and validate
@sportsbet-bettoptwo
  Scenario: User bets twice on any particular runner
    Given User opens the "Sportsbet" website in "420" px width
    And User checks the next race time remaining to bet
  When User starts to bet on "different" runner for the next race


# Open Sportsbet in 420P width
# Check the next visible race in next to run and make sure it has atleast 1 minute left to start betting
   #- Sometimes the time left is in seconds and race becomes Live before we bet
   #- Some Races are not opening if time is very high




