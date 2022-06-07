#Author:Kavya M R
Feature: To test Alchemy website
@lmsProject

@testcase1 @webtitle @lms
Scenario: Validate the webpage title
Given User is on alchemy Home Page
When user is able to view the title and validate that title is as expected
Then Close the browser

@testcase2 @webpageheading @lms
Scenario: Validate the webpage heading
  Given User is on alchemy Home Page
  When user is able to view the heading and validate that heading is as expected
  Then Close the browser

 @testcase3 @traningtitle @lms
  Scenario: Validate the webpage title of Actionable Training info section
    Given User is on alchemy Home Page
    When user is able to view the title and validate that title is as expected in training info section
    Then Close the browser

  @testcase4 @secondpopularcoursetitle @lms
  Scenario: Validate the webpage title of second most popular course in alchemy page
    Given User is on alchemy Home Page
    When user is able to view the title and validate that title is as expected in second most popular course in alchemy page
    Then Close the browser

  @testcase5 @myaccountpagetitle @lms
  Scenario: Validate the webpage title of my account in alchemy page
   Given User is on alchemy Home Page
    When user is able to click on My account and validate the title
   Then Close the browser

  @testcase6 @myaccountpagelogin @lms
  Scenario: Validate that user is able to login to My account in alchemy page
    Given User is on alchemy Home Page
    When user is able to click on My account and login using username and password
    Then Close the browser

  @testcase7 @numberofcourses @lms
  Scenario: Validate that user is able to view all courses available in alchemy page
    Given User is on alchemy Home Page
    When user is able to click on All courses and read the number of courses
    Then Close the browser

  @testcase8 @contactadmin @lms
  Scenario: Validate that user is able to navigate to contact the admin in alchemy page
    Given User is on alchemy Home Page
    When user is able to click on Contact admin and leave a message to admin
    Then Close the browser

  @testcase9 @coursecontent @lms
  Scenario: Validate that user is able to navigate to courses in all courses page
   Given User is on alchemy Home Page
   When user is able to click on all courses,select a course and validate the navigation of it
   Then Close the browser