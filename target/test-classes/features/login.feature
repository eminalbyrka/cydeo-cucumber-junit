
@Regression @smoke
Feature:Library app login feature.
  User story :
  As a user, I should be able to login with correct credentials to different accounts.And dashboard
  should be displayed.
  Accounts are : librarian, student, admin
 # Background:For the scenarios in the future file, user is expected to be on login page.
  #Given user is on the library login page

 @librarian @employee @wip
  Scenario: Login as librarian
  in this scenario, user is logging in as a librarian and is supposed to be seeing the dashboard.
  #(bu şekilde ekstra detail şeyler yazılabilir.)


    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard
#@student
@deneme1
  Scenario: Login as a student
    When user enters student username
    And user enters student password
    Then user should see the dashboard
  @admin @employee
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard

#jjj bu şekilde not ekleyebiliyoruz.

