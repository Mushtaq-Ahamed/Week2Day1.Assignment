package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckBox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//div[@class='example']//input")).click();
		
		driver.findElement(By.xpath("(//div[@class='example']//input)[3]")).click();
		System.out.println("Confirm Selenium is selected : "+driver.findElement(By.xpath("(//div[@class='example']//input)[6]")).isSelected());
		
	
		
	
		Boolean textDeselect=driver.findElement(By.xpath("(//div[@class='example']//input)[8]")).isSelected();
		System.out.println("Deselect only checked Checkbox - " +textDeselect);
		if(textDeselect.booleanValue())
		{	
			driver.findElement(By.xpath("(//div[@class='example']//input)[8]")).click();
			
		}
		
		
		driver.findElement(By.xpath("(//div[@class='example']//input)[9]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[10]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[11]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[12]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[13]")).click();

	}

}
