package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acme {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElement(By.xpath("(//div[@class='controls']/input)[2]")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
        driver.getTitle();
        System.out.println("Title of the Page is : "+ driver.getTitle());
        
        WebElement elementLogout =driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
		elementLogout.click();
        
        driver.close();
        
	}

}
