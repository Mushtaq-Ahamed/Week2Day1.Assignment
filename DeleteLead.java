package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
	
		 WebElement elementUsername = driver.findElement(By.id("username"));
			elementUsername.sendKeys("Demosalesmanager");
			WebElement elementPassword = driver.findElement(By.id("password"));
			elementPassword.sendKeys("crmsfa");
	
			WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
			elementLoginButton.click();
			WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
			elementCRMSFA.click();
			driver.findElement(By.xpath("//a[text()= 'Leads']")).click();

		    driver.findElement(By.xpath("//a[text()= 'Find Leads']")).click();
		    Thread.sleep(3000);
		    
  
		    driver.findElement(By.xpath("//span[text()= 'Phone']")).click();
			Thread.sleep(3000);
			WebElement elementPhoneNumber1= driver.findElement(By.xpath("//input[@name='phoneNumber']"));
			elementPhoneNumber1.sendKeys("97");
			
	
	
			WebElement elementFindLeadsID= driver.findElement(By.xpath("//button[text()= 'Find Leads']"));
			elementFindLeadsID.click();
						Thread.sleep(3000);
	
											
						WebElement elementFindleadLink = driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]"));
						 String text= elementFindleadLink.getText(); 
						 System.out.println(text);	
						 elementFindleadLink.click();
						Thread.sleep(3000);
						
						
						driver.findElement(By.xpath("//a[text()= 'Delete']")).click();	
	
                driver.findElement(By.xpath("//a[text()= 'Find Leads']")).click();
               
                driver.findElement(By.xpath("(//div[@class='x-form-item x-tab-item']//input)[1]")).sendKeys(text);
                     			     			
    			
   			WebElement elementFindLeadID= driver.findElement(By.xpath("//button[text()= 'Find Leads']"));
   			elementFindLeadID.click();
   						Thread.sleep(3000);
   			
                
   						if (driver.getPageSource().contains("No records to display")) {
   							System.out.println("Records deleted successfully");
   						}else {
   							
   							System.out.println("Records not deleted");
   						}

   					    
   			       	
											

	}

}
