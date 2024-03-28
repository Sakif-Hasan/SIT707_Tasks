package sit707_week2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import javax.imageio.ImageIO;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

/**
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void officeworks_registration_page(String url) throws IOException {

		// Step 1: Locate edge driver folder in the local drive.
		System.setProperty("webdriver.edge.driver", "/Users/sakif/Downloads/edgedriver_mac64_m1/msedgedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up edge browser.");
		WebDriver driver = new EdgeDriver();
		System.out.println("Driver info: " + driver);
		sleep(2);
	
		// Load a webpage in edge browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement fname = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + fname);
		// Send first name
		fname.sendKeys("Sakif");
		
		// Element - last name
		WebElement lname = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + lname);
		// Send last name
		lname.sendKeys("Hasan");

		// Element - mail
		WebElement mail = driver.findElement(By.id("email"));
		System.out.println("Found Email : "+ mail);
		mail.sendKeys("something@org.com");

		// Element - phone number
		WebElement phone = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found Email : "+ phone);
		phone.sendKeys("something@org.com");

		// Element password and confirm password
		WebElement pass = driver.findElement(By.id("password"));
		System.out.println("Found Email : "+ pass);
		pass.sendKeys("logIN101");

		WebElement confpass = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found Email : "+ confpass);
		confpass.sendKeys("logIN101");

		// Button
		String buttonXpath = "/html/body/div[2]/div/div[1]/div/div/form/div[12]/button";
		WebElement button = driver.findElement(By.xpath(buttonXpath));

		// Click the button
		button.click();
		
		/*
		 * Take screenshot using selenium API.
		 */

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] imageBytes = screenshot.getScreenshotAs(OutputType.BYTES);

		// Save the screenshot to a file
		File screenshotFile = new File("screenshot_" + System.currentTimeMillis() + ".png");
		ImageIO.write(ImageIO.read(new ByteArrayInputStream(imageBytes)), "png", screenshotFile);

		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}

	public static void harveynorman_registration_page(String url) throws IOException, InterruptedException {

		// Step 1: Locate edge driver folder in the local drive.
		System.setProperty("webdriver.edge.driver", "/Users/sakif/Downloads/edgedriver_mac64_m1/msedgedriver");

		// Step 2: Use above chrome driver to open up a edge browser.
		System.out.println("Fire up edge browser.");
		WebDriver driver = new EdgeDriver();
		System.out.println("Driver info: " + driver);
		sleep(2);

		// Load a webpage in edge browser.
		driver.get(url);

		// Find first input field which is firstname
		WebElement hfname = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + hfname);
		// Send first name
		hfname.sendKeys("Sakif");

		// Element - last name
		WebElement hlname = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + hlname);
		// Send last name
		hlname.sendKeys("Hasan");

		// Element - mail
		WebElement hmail = driver.findElement(By.id("email_address"));
		System.out.println("Found Email : "+ hmail);
		hmail.sendKeys("something@org.com");

		// Element password and confirm password
		WebElement hpass = driver.findElement(By.id("password"));
		System.out.println("Found Email : "+ hpass);
		hpass.sendKeys("logIN101");

		WebElement hconfpass = driver.findElement(By.id("password_confirmation"));
		System.out.println("Found Email : "+ hconfpass);
		hconfpass.sendKeys("logIN101");

		// This code creates a simulation to bypasses the recaptcha
		WebElement recaptchaFrame = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span"));
		driver.switchTo().frame(recaptchaFrame);

		Thread.sleep(10000); // Simulate the delay for solving the recaptcha puzzle
		driver.switchTo().defaultContent();

		// Accept terms and agreements using xPath
		String termsXpath = "/html/body/div[4]/main/div[3]/div/div[1]/form/fieldset[2]/div[5]/input";
		WebElement termsButton = driver.findElement(By.xpath(termsXpath));

		// Sign up Button using xPath
		String hbuttonXpath = "/html/body/div[4]/main/div[3]/div/div[1]/form/div/div[1]/button";
		WebElement hbutton = driver.findElement(By.xpath(hbuttonXpath));

		// Click the button
		hbutton.click();

		// Takes the screenshot and saves it as a byte code array
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] imageBytes = screenshot.getScreenshotAs(OutputType.BYTES);

		// Save the screenshot to a file from the byte code array
		File screenshotFile = new File("screenshot_" + System.currentTimeMillis() + ".png");
		ImageIO.write(ImageIO.read(new ByteArrayInputStream(imageBytes)), "png", screenshotFile);

		// Sleep a while
		sleep(2);

		// close chrome driver
		driver.close();
	}
}
