package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	public static WebDriver driver;
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/login.html");
		System.out.println(driver.getTitle());

		throw new PendingException();
	}

	@When("^User Enters Valid Username and Password$")
	public void user_Enters_Valid_Username_and_Password() throws Throwable {

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("test@gmail.com");

		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("Test@123");

		throw new PendingException();
	}

	@Then("^Display Message Credentials Entered$")
	public void display_Message_Credentials_Entered() throws Throwable {

		System.out.println("The email and password field is entered...!");

		throw new PendingException();
	}

	@When("^Username and Password fields cleared$")
	public void username_and_Password_fields_cleared() throws Throwable {

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.name("passwd")).clear();

		throw new PendingException();
	}

	@Then("^Display Message Fields cleared$")
	public void display_Message_Fields_cleared() throws Throwable {

		System.out.println("The email and password fields are cleared...!");

		throw new PendingException();
	}

	@When("^User Enters New Username and Password$")
	public void user_Enters_New_Username_and_Password() throws Throwable {

		driver.findElement(By.id("email")).sendKeys("testemail@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("test@123");
		driver.findElement(By.name("SubmitLogin")).click();

		throw new PendingException();
	}

	@Then("^Display Message Login Successfull with New Credentials$")
	public void display_Message_Login_Successfull_with_New_Credentials() throws Throwable {

		System.out.println("Login Successful...!");

		throw new PendingException();
	}

}
