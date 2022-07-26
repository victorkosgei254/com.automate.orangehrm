  @all
  @loginform
Feature: Unit Test Login OrangeHRM Dashboard

    Feature This test validates that given a valid user name and password the user should successfully login
    Scenario: Navigate to OrangeHRM Website
        * User navigates to "orangehrmURL"
        * User should see a login screen with a logo "logoImage"
        * User should see a prompt with "testloginCredentials"
        * User should see a "loginImage"
        * User shoudl see a "loginForm"

    Scenario: Verify that the user can enter username and password
        * The login form should have a "username" field
        * The login form should have a "password" field
        * The login form should have a "login" button
        * The login form should have a "forgotPassword" option

    Scenario: Verify that the user is given hints on what field to enter username or password
        * The username field should have a "usernamehint"
        * The password field should have a "passwordhint"

    @ui
    Scenario: Verify that the footer contains all the required fields
        * The "footer" should be  present
        * The footer should contain "companyName"
        * The footer should contain "productVersion"
        * The footer shoudl contain "copyrightInformation"
        * The footer should contain "linktoCopyrightInfo"
        * The footer should contain "socialLinks"

      @ui
      @verifyLinks
    Scenario: Verify that the social links at the footer points to correct destinations
        * For each of the <socialLink> it should point to <destination>
      Example:
        |socialLink|destination|
        |linkedIn  |http://www.linkedin.com/groups?home=&gid=891077|
        |facebook  |http://www.facebook.com/OrangeHRM|
        |twitter   |http://twitter.com/orangehrm|
        |youtube   |http://www.youtube.com/orangehrm|

    @verifyLinks
    @network
    Scenario: Verfy that the login form posts to the right url
      * The login in form should implement the "loginmethod" method
      * The loginform should point to "loginURL"

    @userinputs
    Scenario: Verify that the user can login using right credentials
        * The user enters "username"  as shown in the "usernamehint"
        * The user enters "password" as shown in the "passwordhint"
        * The user clicks "login" button

    @userinputs
    Scenario: Verify that the user cannot login using right username but wrong password
        * The user enters a valid "username" in the username field
        * The user enters an invalid "invalidpassword" in the password field
        * The user clicks on "login" button
        * The user should not be able to login
        * The user should receive a "warningMessage"
  @ui
    Scenario: Verify the the login form has a heading
        * The login form should have "loginFormHeading"

    @network
    Scenario: Verify the login form URL
        * The login form should be accessed from "loginFormURL"
    @network
    Scenario: Verify that the website is accessible using provided domain name
        *The website should be accessible in this "orangeHrmDomainName"

    @network
    Scenario: Verify the website is served via HTTPS
        * The website should be serves over https

