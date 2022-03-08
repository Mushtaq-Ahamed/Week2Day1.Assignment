package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
				WebElement IndexDropdown = driver.findElement(By.id("dropdown1"));
				Select dropdownvalue = new Select(IndexDropdown);
				dropdownvalue.selectByIndex(1);
				
				WebElement TextDropdown = driver.findElement(By.name("dropdown2"));
				Select dropdownvalue1 = new Select(TextDropdown);
				dropdownvalue1.selectByVisibleText("Selenium");
	
				WebElement ValueDropDown = driver.findElement(By.id("dropdown3"));
				Select dropdownvalue2 = new Select(ValueDropDown);
				dropdownvalue2.selectByValue("1");
		         
				
				Select selectDropdown = new Select(driver.findElement(By.className("dropdown")));
				
			
				List<WebElement> listOptionDropdown =selectDropdown.getOptions();
				
				
				int dropdownCount = listOptionDropdown.size();
				
			    System.out.println("Total Number of Dropdown Options = " + dropdownCount);
			
			         
	
			    driver.findElement(By.xpath("(//div[@class='example']//select)[5]")).sendKeys("Selenium");
				driver.findElement(By.xpath("(//div[@class='example']//select)[6]")).sendKeys("Selenium");
						


	}

}
