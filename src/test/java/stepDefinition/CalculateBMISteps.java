package stepDefinition;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CalculateBMISteps {

	public static WebDriver driver;
	
	@Given("^Calculator url is launched$")
	public void calculator_url_is_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:/Users/swesreed/Desktop/SDET/SeleniumJars/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		String pageTitle = "Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science";
		if (driver.getTitle().equalsIgnoreCase(pageTitle))
			{
			System.out.println("Verified page Title "+pageTitle);;
			}
          
	}

	@When("^user clicks on BMI calculator$")
	public void user_clicks_on_BMI_calculator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='BMI Calculator']")).click();
	    
	}

	@Then("^BMI calculator page is loaded$")
	public void bmi_calculator_page_is_loaded() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String PageNameActual = driver.findElement(By.xpath("//h1[text()='BMI Calculator']")).getText();
		String PageNameExpected = "BMI Calculator";
		Assert.assertEquals(PageNameExpected, PageNameActual);	
	    
	}
	
	@Given("^BMI calculator is launched$")
	public void bmi_calculator_is_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String pageTitle2 = "BMI Calculator";
		if (driver.getTitle().equalsIgnoreCase(pageTitle2))
			{
			System.out.println("Verified page Title "+pageTitle2);;
			}

	}

	@When("^user enter below details and calculate BMI$")
	public void user_enter_below_details_and_calculate_BMI(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<List<String>>  data = arg1.raw();
		for (int i =0; i<data.size(); i++)
		{
			// entering data to Age,height and weight (First row + First column)
			driver.findElement(By.id("cage")).clear();
			driver.findElement(By.id("cage")).sendKeys(data.get(i).get(0));
			

			driver.findElement(By.id("cheightmeter")).clear();
			driver.findElement(By.id("cheightmeter")).sendKeys(data.get(i).get(1));
			 
			
			driver.findElement(By.id("ckg")).clear();
			driver.findElement(By.id("ckg")).sendKeys(data.get(i).get(2));
			
			 Thread.sleep(500);
			 
			 driver.findElement(By.xpath("//input[@type='image' and @value='Calculate']")).click();
			 Thread.sleep(500);
			 
			 String BMIResult= driver.findElement(By.xpath("//b[contains(text(),\"BMI\")]")).getText();
			System.out.println("BMI Result is " +BMIResult);
			Thread.sleep(500);
			 
		}
		

	}

	
	@Then("^user exits the application$")
	public void user_exits_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
      driver.close();
      driver.quit();
	}




}
