package org.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectManagement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Edureka\\lib\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.edureka.co/");
	driver.manage().window().maximize();
	WebElement project=driver.findElement(By.xpath("(//a[@class='nav-link ga_category_upfront'])[3]"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", project);
	
	WebElement view=driver.findElement(By.xpath("(//button[@class='view-details'])[2]"));
	js.executeScript("arguments[0].click();",view);
	WebElement enroll=driver.findElement(By.xpath("(//div[@class='title_bx'])[2]"));
	
	js.executeScript("arguments[0].click();", enroll);
	WebElement btn=driver.findElement(By.xpath("//button[@id='download-curriculum-button']"));
	js.executeScript("arguments[0].click();", btn);
	
	
}
}
