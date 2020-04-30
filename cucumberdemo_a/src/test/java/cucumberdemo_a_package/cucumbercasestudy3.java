package cucumberdemo_a_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;

public class cucumbercasestudy3 {
	
	WebDriver driver;

@Given("User should go to url page")
public void user_should_go_to_url_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
}

@Given("user clicks signinbutton")
public void user_clicks_signinbutton() {
    driver.findElement(By.linkText("SignIn")).click();
}

@Given("user enters username as {string}")
public void user_enters_username_as(String un) {
    driver.findElement(By.name("userName")).sendKeys(un);
}

@Given("user enters password as {string}")
public void user_enters_password_as(String pwd) {
    driver.findElement(By.name("password")).sendKeys(pwd);
}

@Given("user clicks loginbutton")
public void user_clicks_loginbutton() {
    driver.findElement(By.name("Login")).click();
}

@Given("user enters a word")
public void user_enters_a_word() {
    WebElement  find1 = driver.findElement(By.id("myInput"));
    Actions act1 = new Actions(driver);
    act1.keyDown(find1,Keys.SHIFT).perform();
    act1.sendKeys("h").pause(2000).sendKeys("e").pause(2000).sendKeys("a").pause(2000).sendKeys("d").perform();
    act1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Headphone')]"))).click().perform();
    
}

@Given("user clicks findbutton")
public void user_clicks_findbutton() {
    driver.findElement(By.name("val")).click();
}

@Given("user clicks on addtocart")
public void user_clicks_on_addtocart() {
	driver.findElement(By.xpath("//a[@href='#']")).click();
}

@Given("use clicks on cart")
public void use_clicks_on_cart() {
    driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
}

@Given("user clicks on checkout")
public void user_clicks_on_checkout() {
	driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
    
}

@Given("user enters with address")
public void user_enters_with_address() {
    driver.findElement(By.name("choice-dollar")).click();
    driver.findElement(By.id("add2")).sendKeys("hyderabad");
}

@Given("user click on proceed to pay")
public void user_click_on_proceed_to_pay() {
    driver.findElement(By.linkText("Proceed to Pay")).click();
}

@Given("user clickson bank")
public void user_clickson_bank() {
    driver.findElement(By.name("radio1")).click();
}

@Given("user clicks on continuebtn")
public void user_clicks_on_continuebtn() {
    driver.findElement(By.id("btn")).click();
}

@Given("user enters with username")
public void user_enters_with_username() {
	driver.findElement(By.name("username")).sendKeys("lalitha");
}

@Given("user enters with password")
public void user_enters_with_password() {
	driver.findElement(By.name("password")).sendKeys("password123");
}

@Given("user click login")
public void user_click_login() {
    driver.findElement(By.name("LOGIN")).click();
}

}
