package cucumberdemo_a_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumbercasestudy_1 {
	WebDriver driver;

@Given("user should navigate to TestMeApp on chrome")
public void user_should_navigate_to_TestMeApp_on_chrome() {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
}

@When("should click on signum button")
public void should_click_on_signum_button() {
    driver.findElement(By.linkText("SignUp")).click();
}

@When("user enters with username as {string}")
public void user_enters_with_username_as(String un) {
    driver.findElement(By.name("userName")).sendKeys(un);
}

@When("user enters with firstname as {string}")
public void user_enters_with_firstname_as(String fn) {
    driver.findElement(By.name("firstName")).sendKeys(fn);
}

@When("user enters with lastname as {string}")
public void user_enters_with_lastname_as(String ln) {
    driver.findElement(By.name("lastName")).sendKeys(ln);
}

@When("user enters with password as {string}")
public void user_enters_with_password_as(String pwd) {
    driver.findElement(By.name("password")).sendKeys(pwd);
}

@When("user enters with confirmPassword as {string}")
public void user_enters_with_confirmPassword_as(String cpwd) {
    driver.findElement(By.name("confirmPassword")).sendKeys(cpwd);
}

@When("user have to select gender")
public void user_have_to_select_gender() {
    driver.findElement(By.name("gender")).click();
}

@When("user enters with email as {string}")
public void user_enters_with_email_as(String mail) {
    driver.findElement(By.name("emailAddress")).sendKeys(mail);
}

@When("user enters with  phonenumber as {string}")
public void user_enters_with_phonenumber_as(String mn) {
    driver.findElement(By.name("mobileNumber")).sendKeys(mn);
}

@When("user enters with dob as {string}")
public void user_enters_with_dob_as(String dob) {
    driver.findElement(By.name("dob")).sendKeys(dob);
}

@When("user enters with address as {string}")
public void user_enters_with_address_as(String ad) {
    driver.findElement(By.name("address")).sendKeys(ad);
}

@When("user have to select  one question")
public void user_have_to_select_one_question() {
    WebElement d = driver.findElement(By.name("securityQuestion"));
    Select s = new Select(d);
    s.selectByValue("411010");
}

@When("user enters with answer as {string}")
public void user_enters_with_answer_as(String ans) {
    driver.findElement(By.name("answer")).sendKeys(ans);
}

@Then("user have to click register")
public void user_have_to_click_register() {
    driver.findElement(By.name("Submit"));
}

}
