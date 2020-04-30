Feature: Register to TestMeApp


Scenario: Registration test
 Given user should navigate to TestMeApp on chrome
 When should click on signum button
 And user enters with username as "VEERESH123"
 And user enters with firstname as "veeresh"
 And user enters with lastname as "k"
 And user enters with password as "password123"
 And user enters with confirmPassword as "password123"
 And user have to select gender
 And user enters with email as "veeresh@gmail.com"
 And user enters with  phonenumber as "9000000000"
 And user enters with dob as "26/12/1999"
 And user enters with address as "andhra"
 And user have to select  one question
 And user enters with answer as "ap"
 Then user have to click register
 
 
 
