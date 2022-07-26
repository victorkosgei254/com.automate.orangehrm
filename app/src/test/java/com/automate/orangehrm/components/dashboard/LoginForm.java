package com.automate.orangehrm.components.dashboard;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automate.orangehrm.tools.WebDriverManager;
import org.openqa.selenium.WebElement;

import java.util.Objects;

/**
 * The Login form is composed of the Following Elements
 * The username field
 * The password field
 * the login password
 * The form header
 * Login button
 */
public class LoginForm {
    /**
     * Getting the instance of a web driver
     */
    private WebDriver driver = WebDriverManager.getDriver();
    /**
     * Elements or components that make up a login form
     */
    WebElement usernameField,passwordField,formHeader,loginBtn;
    /**
     * This is the URL at which the form can be accessible, this is be refactored into a properties file.
     */
    String componentURL = "https://opensource-demo.orangehrmlive.com/";

    /**
     * The constructor,
     * Upon instantiation, the driver navigates to the component location, gets the page and
     * locates all the components
     *
     */
    /**
     * Form instance
     */
    LoginForm Form;
    public  LoginForm(){
        driver.navigate().to(componentURL);
        usernameField = driver.findElement(By.id("txtUsername"));
        passwordField = driver.findElement(By.id("txtPassword"));
        formHeader = driver.findElement(By.id("logInPanelHeading"));
        loginBtn = driver.findElement(By.id("btnLogin"));

    }


    //Test cases
    @Given("User navigates to {string}")
    public void user_navigates_to(String string) {
        this.Form = new LoginForm();
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Assert.assertTrue(Objects.equals("OrangeHRM",pageTitle));


    }

    @Given("User should see a login screen with a logo {string}")
    public void user_should_see_a_login_screen_with_a_logo(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
    }

    @Given("User should see a prompt with {string}")
    public void user_should_see_a_prompt_with(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User should see a {string}")
    public void user_should_see_a(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User shoudl see a {string}")
    public void user_shoudl_see_a(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The login form should have a {string} field")
    public void the_login_form_should_have_a_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The login form should have a {string} button")
    public void the_login_form_should_have_a_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The login form should have a {string} option")
    public void the_login_form_should_have_a_option(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The username field should have a {string}")
    public void the_username_field_should_have_a(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The password field should have a {string}")
    public void the_password_field_should_have_a(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The {string} should be  present")
    public void the_should_be_present(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The footer should contain {string}")
    public void the_footer_should_contain(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The footer shoudl contain {string}")
    public void the_footer_shoudl_contain(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("For each of the <socialLink> it should point to <destination>")
    public void for_each_of_the_social_link_it_should_point_to_destination() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The login in form should implement the {string} method")
    public void the_login_in_form_should_implement_the_method(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The loginform should point to {string}")
    public void the_loginform_should_point_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user enters {string}  as shown in the {string}")
    public void the_user_enters_as_shown_in_the(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user enters {string} as shown in the {string}")
    public void the_user_entrs_as_shown_in_the(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user clicks {string} button")
    public void the_user_clicks_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user enters a valid {string} in the username field")
    public void the_user_enters_a_valid_in_the_username_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user enters an invalid {string} in the password field")
    public void the_user_enters_an_invalid_in_the_password_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user clicks on {string} button")
    public void the_user_clicks_on_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user should not be able to login")
    public void the_user_should_not_be_able_to_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user should receive a {string}")
    public void the_user_should_receive_a(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The login form should have {string}")
    public void the_login_form_should_have(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The login form should be accessed from {string}")
    public void the_login_form_should_be_accessed_from(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The website should be serves over https")
    public void the_website_should_be_serves_over_https() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
