package week4.day5;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
public static void main(String[] args) {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Hari");
	driver.findElement(By.name("lastname")).sendKeys("J");
	driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
	driver.findElement(By.id("password_step_input")).sendKeys("0000");
	
	WebElement date = driver.findElement(By.id("day"));
	Select dropdown = new Select(date);
	dropdown.selectByVisibleText("22");
	
	WebElement Maatham = driver.findElement(By.id("month"));
	Select dropdown1 = new Select(Maatham);
	dropdown1.selectByVisibleText("Sep");
	
	WebElement YEAR = driver.findElement(By.id("year"));
	Select dropdown2 = new Select(YEAR);
	dropdown2.selectByVisibleText("2000");
	
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	driver.close();	
}
	
}
