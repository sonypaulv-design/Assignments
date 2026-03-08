package seleDay3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_Wait {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/sonyp/Downloads/upload_92b75a56-02bc-4268-9b5c-7504f597a45a/Selenium_waits_Assignment/example3.html");
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.textToBePresentInElementLocated((By.xpath("//div/h1")),"Food Order Automation"));
		WebElement dessertbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/button[text()='Dessert']")));
		dessertbtn.click();
		driver.findElement(By.xpath("//div[@id='dessert2']//button")).click();
		WebElement cart= driver.findElement(By.xpath("//div/button[@id='cartBtn']"));
		wait.until(ExpectedConditions.textToBePresentInElement(cart, "1"));
		
		driver.findElement(By.xpath("//*[text()='Confirm Order']")).click();


		WebElement closeBtn = wait.until(
		        ExpectedConditions.elementToBeClickable(By.id("closePopupBtn")));
		closeBtn.click();
		
	
		
	}

}
