package luma.us.stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MagentoEcommerce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://magento.softwaretestingboard.com/");

		driver.manage().window().maximize();
		WebElement SignIn = driver.findElement(By.xpath("(//a[contains(text(),'Sign In')])[1]"));
		SignIn.click();
		WebElement EnterEmail = driver.findElement(By.xpath("//input[@id = 'email']"));
		EnterEmail.sendKeys("tanvirpatwary16@gmail.com");

		WebElement EnterPassword = driver.findElement(By.xpath("(//input[@id = 'pass'])[1]"));
		EnterPassword.sendKeys("Tester01");
		WebElement SignInButton = driver.findElement(By.xpath("(//span[contains(text(),'Sign In')])[1]"));

		SignInButton.click();
		
//		String actual = driver.findElement(By.xpath("//*[contains(text(),'Thank you for your purchase!')]")).getText();
//		//String actual = obj.getWelcomeTxt().getText();
//		Assert.assertTrue(actual.contains(expected));
//		System.out.println("Order Confirmation ::"+actual);

		WebElement Men = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));

		Actions act = new Actions(driver);
		act.moveToElement(Men).build().perform();
		WebElement Tops = driver.findElement(By.xpath("(//*[contains(text(),'Tops')])[2]"));

		act.moveToElement(Tops).build().perform();

		WebElement Jacket = driver.findElement(By.xpath("(//*[contains(text(),'Jackets')])[2]"));
		Jacket.click();

		WebElement selitem = driver
				.findElement(By.xpath("//*[contains(text(),'Typhon Performance Fleece-lined Jacket ')]"));
		selitem.click();
		Thread.sleep(2000);
		WebElement selsize = driver.findElement(By.xpath("(//*[@class='swatch-option text'])[1]"));
		selsize.click();

		WebElement selcolor = driver.findElement(By.xpath("//*[@id='option-label-color-93-item-53']"));
		selcolor.click();

		WebElement Addtocart = driver.findElement(By.xpath("(//*[contains(text(),'Add to Cart')])[1]"));
		Addtocart.click();
		Thread.sleep(3000);
		WebElement ActionShowcart = driver.findElement(By.xpath("//*[@class='minicart-wrapper']"));
		ActionShowcart.click();
		// act.moveToElement(ActionShowcart).build().perform();
		WebElement Proceed_to_Checkout = driver.findElement(By.xpath("//*[@title='Proceed to Checkout']"));
		Proceed_to_Checkout.click();

		Thread.sleep(3000);

		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		WebElement radiobutton = driver.findElement(By.xpath("(//*[@name='ko_unique_1'])[1]"));
		radiobutton.click();
		Thread.sleep(3000);
		WebElement Nextbutton = driver.findElement(By.xpath("//*[contains(text(),'Next')]"));
		Nextbutton.click();

		// to perform Scroll on application using Selenium

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000)");

		//
		Thread.sleep(3000);

		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		WebElement placeorder = driver.findElement(By.xpath("	//*[contains(text(),'Place Order')]"));
		placeorder.click();
		
		Thread.sleep(5000);
		String expected = "Thank you for your purchase!";
	
		String actual = driver.findElement(By.xpath("//*[contains(text(),'Thank you for your purchase!')]")).getText();
		//String actual = obj.getWelcomeTxt().getText();
		Assert.assertTrue(actual.contains(expected));
		System.out.println("Order Confirmation ::"+actual);
		
	}

}
