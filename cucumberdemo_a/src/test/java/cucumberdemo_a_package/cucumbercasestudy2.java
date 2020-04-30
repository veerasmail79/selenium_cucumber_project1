package cucumberdemo_a_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class cucumbercasestudy2 {
WebDriver driver;
@Given("user navigate to page")
public void user_navigate_to_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
}

@Given("user clicks signin")
public void user_clicks_signin() {
    driver.findElement(By.linkText("SignIn")).click();
}

@Given("user enter loginusername as {string}")
public void user_enter_loginusername_as(String un) {
    driver.findElement(By.name("userName")).sendKeys(un);
}

@Given("user enters loginpassword as {string}")
public void user_enters_loginpassword_as(String pwd) {
    driver.findElement(By.name("password")).sendKeys(pwd);
}

@Given("user click loginbutton")
public void user_click_loginbutton() {
    driver.findElement(By.name("Login")).click();
}


}
