package com.steps.flight;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.dto.SearchDto;
import com.ecommerce.helpers.Constants;
import com.ecommerce.helpers.WebDriverInitializer;
import com.pageobjects.WebPageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchFlightTwo {

	private WebDriverInitializer webDriverInitializer;
	WebDriver driver = null;
	SearchDto search = null;

	String parent;

	public SearchFlightTwo(WebDriverInitializer webDriverInitializer) {

		this.webDriverInitializer = webDriverInitializer;
	}

	@Given("^user at Make My trip portal$")
	public void user_at_Make_My_trip_portal() throws Throwable {

		driver = webDriverInitializer.getDriver();
		WebPageObject page = new WebPageObject(driver);
		search = new SearchDto(driver);
		page.navigateToWebPage(Constants.LOGIN_PAGE);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebPageObject.getScreenShots(driver, "UserLogin_Error", Constants.IMAGE_LOCATION, Constants.HOME_PAGE);

	}

	@When("^user hover on \"([^\"]*)\" and print all the items$")
	public void user_hover_on_and_print_all_the_items(String arg1) throws Throwable {

		driver = webDriverInitializer.getDriver();
		search = new SearchDto(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement items = driver.findElement(By.xpath("//span[@class='darkGreyText']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(items).perform();

		List<WebElement> elements = driver.findElements(By.xpath("//a[@class='appendBottom5 blackText']"));
		System.out.println("Total number of Items : " + elements.size());

	}

	@And("^user select \"([^\"]*)\" from the drop down$")
	public void user_select_from_the_drop_down(String deals) throws Throwable {

		parent = driver.getWindowHandle();
		System.out.println("Parent : " + parent);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,"
				+ driver.findElement(By.xpath("//a[contains(text(),'Deals')]")).getLocation().y + ")");

		driver.findElement(By.xpath("//a[contains(text(),'Deals')]")).click();

	}

	@And("^user select from as \"([^\"]*)\"$")
	public void user_select_from_as(String from) throws Throwable {

		Set<String> allWindows = driver.getWindowHandles();

		int count = allWindows.size();
		System.out.println("Windoow Count is : " + count);

		for (String child : allWindows) {
			System.out.println(child);

			if (!child.equalsIgnoreCase(parent)) {

				driver.switchTo().window(child);

				driver.findElement(By.id("hp-widget__sfrom")).sendKeys(from);
				driver.findElement(By.xpath("//span[contains(text(),'" + from + "')]")).click();

				driver.findElement(By.id("hp-widget__sTo")).sendKeys("Hyderabad");
				driver.findElement(By.xpath("//span[contains(text(),'Hyderabad')]")).click();

				driver.findElement(By.id("hp-widget__depart")).click();
				driver.findElement(By.xpath("//a[contains(text(),'22')]")).click();

				driver.findElement(By.id("searchBtn")).click();

				List<WebElement> elements = driver.findElements(By.xpath("//span[@class='appendRight8']"));
				System.out.println("Total number of flights : " + elements.size());
				driver.close();

			}

		}

	}

	@Then("^user switch to home page$")
	public void user_switch_to_home_page() throws Throwable {

		driver.switchTo().window(parent);
		String parentTitle = driver.getTitle();
		System.out.println("Parent Window Title : " + parentTitle);
		driver.close();

	}

}
