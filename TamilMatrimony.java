package week4.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
public static void main(String[] args) {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	
	driver.get("https://www.tamilmatrimony.in/");
	driver.manage().window().maximize();
	
	WebElement click = driver.findElement(By.id("REGISTERED_BY"));
	Select dropdown = new Select(click);
	dropdown.selectByVisibleText("Myself");
	
	driver.findElement(By.id("NAME")).sendKeys("hari");
	driver.findElement(By.className("hp-gender")).click();
	
	WebElement DD = driver.findElement(By.id("DOBDAY"));
	Select dropdown1 = new Select(DD);
	dropdown1.selectByVisibleText("22");
	
	WebElement MM = driver.findElement(By.id("DOBMONTH"));
	Select dropdown2 = new Select(MM);
	dropdown2.selectByVisibleText("Sep");
	
	WebElement YEAR = driver.findElement(By.id("DOBYEAR"));
	Select dropdown3 = new Select(YEAR);
	dropdown3.selectByVisibleText("2000");
	
	WebElement REL = driver.findElement(By.id("RELIGION"));
	Select dropdown4 = new Select(REL);
	dropdown4.selectByVisibleText("Hindu");
	
	WebElement MT = driver.findElement(By.id("MOTHERTONGUE"));
	Select dropdown5 = new Select(MT);
	dropdown5.selectByVisibleText("Tamil");
	
	WebElement cou = driver.findElement(By.id("COUNTRY"));
	Select dropdown6 =new Select(cou);
	dropdown6.selectByVisibleText("India");
	
	driver.findElement(By.id("MOBILENO")).sendKeys("6667778880");
	driver.findElement(By.id("EMAIL")).sendKeys("bsd@gmail.com");
	driver.findElement(By.xpath("(//input[@id='PASSWORD'])[3]")).sendKeys("000");
	
	driver.close();
}
}
