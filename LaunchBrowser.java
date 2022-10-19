package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
public static void main(String[] args) {
	//Download the driver and set the path
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.leaftaps/opentaps/control/login");
	//Maximize the browser
	driver.manage().window().maximize();

	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.id("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Biotique");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("cosmetics");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("biotique");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rakshi");
	driver.findElement(By.name("createLeadForm_departmentName")).sendKeys("cosmetics");
	driver.findElement(By.name("createLeadForm_description")).sendKeys("Exclusive Showroom for Womens");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("biotique22@gmail.com");
	driver.findElement(By.id("Create Lead")).click();
	driver.findElement(By.id("subMenuButton")).click();
	driver.findElement(By.id("updateLeadForm_description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Keep Shopping");
	driver.findElement(By.id("Update")).click();
	String title=driver.getTitle();
	System.out.println(title);

}
}

