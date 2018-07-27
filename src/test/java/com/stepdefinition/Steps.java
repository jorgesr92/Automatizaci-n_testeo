package com.stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Steps implements En {

    //    public Steps() {
//
//        Given("^Open the Chrome and launch the application$", Steps::open_the_Firefox_and_launch_the_application);
//        When("^Enter the Username and Password$", Steps::enter_the_Username_and_Password);
//        Then("^Reset the credential$", Steps::Reset_the_credential);
//    }
    WebDriver driver;

    @Given("^Open the Chrome and launch the landing page$")
    public void open_the_Firefox_and_launch_the_application() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Server\\Drivers\\chromedriver.exe");
        ChromeOptions optionsC = new ChromeOptions();
        optionsC.setAcceptInsecureCerts(true);
        optionsC.addArguments("--allow-insecure-localhost");
        optionsC.addArguments("--start-maximized");
        driver = new ChromeDriver(optionsC);
        driver.get("https:/www.xxxxxxx.com/es");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

        //driver.quit();

        System.out.println("This Step open the Chrome and launch the application.");
    }


    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() {
        System.out.println("This step enter the Username and Password on the login page.");
        driver.quit();
    }

    @When ("^Enter the Hotel name$")
    public void enter_the_Hotel_Name() {
        System.out.println("This step enter the Hotel name.");
        driver.quit();
    }

    @Then("^Reset the credential$")
    public void Reset_the_credential() {
        System.out.println("This step click on the Reset button.vsfgsg");
    }


}

