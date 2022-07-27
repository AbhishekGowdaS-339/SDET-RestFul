package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefination {

	WebDriver driver;

	@Given("launch the browser")
	public void launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@And("Enter the URl")
	public void enter_the_url() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
	}

	@When("Login page is displayed enter userName and password")
	public void login_page_is_displayed_enter_user_name_and_password() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("pwd");
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}

	@Then("HomePage should be displayed")
	public void home_page_should_be_displayed() {
		System.out.println(driver.getTitle());
	}

	@Then("Verify the Homepage title")
	public void verify_the_homepage_title() {
		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("actiTIME -  Enter Time-Track"));
	}

	@Then("Organization element is displayed")
	public void organization_element_is_displayed() {
		System.out.println(driver.getTitle());
	}

}
