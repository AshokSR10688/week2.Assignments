package week2.Assignment1;
//Create a new Facebook Account with Name DOB Gender
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
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ashok");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S R");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Welcome@12345");
		
		  WebElement Day =driver.findElement(By.xpath("//span[@data-name='birthday_wrapper']//select[@name='birthday_day']")); 
			
			  Select drop1=new Select(Day); drop1.selectByIndex(9);
			 
		  WebElement Month = driver.findElement(By.xpath("//span[@data-name='birthday_wrapper']//select[@name='birthday_month']")); 
			
			  Select drop2=new Select(Month); drop2.selectByIndex(5);
			 
		  WebElement year =  driver.findElement(By.xpath("//span[@data-name='birthday_wrapper']//select[@name='birthday_year']")); 
			
			  Select drop3=new Select(year); drop3.selectByIndex(34);
			 
		  
		  driver.findElement(By.xpath("//span[@data-name='gender_wrapper']//label[text()='Male']")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);

	}

}
