package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("Verifying that driver is logged in");
        BrowserUtils.waitFor(2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);

    }
    @Given("the user is on the login page")
    public void driver_user_is_on_the_login_page() {
        System.out.println("Opening the login page");
        // Driver.get() ---> this gets webdriver
        // Driver.get() --->
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the users enters the driver information")
    public void the_users_enters_the_driver_information() {
        System.out.println("Entering driver login info");
        String dUsername=ConfigurationReader.get("driver_username");
        String dPassword=ConfigurationReader.get("driver_password");
        LoginPage loginPage=new LoginPage();
        loginPage.login(dUsername, dPassword);
    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {
        System.out.println("Entering sales manager login info");
        String slUsername=ConfigurationReader.get("sales_manager_username");
        String slPassword=ConfigurationReader.get("sales_manager_password");
        LoginPage loginPage=new LoginPage();
        loginPage.login(slUsername, slPassword);
    }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {
        System.out.println("Entering store manager information");
        String stUsername=ConfigurationReader.get("store_manager_username");
        String stPassword=ConfigurationReader.get("store_manager_password");
        LoginPage loginPage=new LoginPage();
        loginPage.login(stUsername, stPassword);
    }

}
