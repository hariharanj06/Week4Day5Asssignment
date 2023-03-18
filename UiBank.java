package week4.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class UiBank {
public static void main(String[] args) {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://uibank.uipath.com/register-account");
	driver.findElement(By.id("firstName")).sendKeys("Hari");
	
	WebElement tt = driver.findElement(By.id("title"));
	Select dropdown = new Select(tt);
	dropdown.selectByVisibleText("Mr");
	
	driver.findElement(By.id("middleName")).sendKeys("J");
	driver.findElement(By.id("lastName")).sendKeys("haran");
	
	WebElement gen = driver.findElement(By.id("sex"));
	Select dropdown1 = new Select(gen);
	dropdown1.selectByVisibleText("Male");
	
	WebElement ms = driver.findElement(By.id("employmentStatus"));
	Select dropdown2 = new Select(ms);
	dropdown2.selectByVisibleText("Full-time");
	
	driver.findElement(By.id("username")).sendKeys("hh");
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("password")).sendKeys("0000");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.close();
	
}
}
