package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 WebElement elementCreateAccount =driver.findElement(By.xpath("//a[text()='Create New Account']")); 
		 elementCreateAccount.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 WebElement elementFirstName = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		 elementFirstName.sendKeys ("ABC");
		 WebElement elementSurName = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		 elementSurName.sendKeys ("XYZ");
		 WebElement elementMobileNumber = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		 elementMobileNumber.sendKeys ("9876543210");
		 WebElement elementPassword = driver.findElement(By.xpath("//form[@id='reg']//input[@type='password']"));
		 elementPassword.sendKeys ("Welcome");
		 
		 WebElement elementDropdownDay = driver.findElement(By.id("day"));
		 Select dropdownvalue = new Select(elementDropdownDay);
		 dropdownvalue.selectByValue("1");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		 WebElement elementDropdownMonth = driver.findElement(By.id("month"));
		 Select dropdownvalue1 = new Select(elementDropdownMonth);
		 dropdownvalue1.selectByIndex(1);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		 WebElement elementDropdownYear=driver.findElement(By.id("year"));
		 Select dropdownvalue2=new Select(elementDropdownYear);
		 dropdownvalue2.selectByValue("2000");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				 	
		 WebElement elementRadio =driver.findElement(By.xpath("//label[text() = 'Female']"));
		 elementRadio.click();
				
	}

}
