package leafground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement selectTrainingProgram = driver.findElement(By.id("dropdown1")); 
		new Select(selectTrainingProgram).selectByIndex(1);
		WebElement dropdown = driver.findElement(By.name("dropdown2")); 
		new Select(dropdown).selectByVisibleText("Selenium"); 
		WebElement dropdown1 = driver.findElement(By.xpath("(//div[@class='example']//select)[3]")); 
		new Select(dropdown1).selectByIndex(3);  
		WebElement selectTrainingProgram1 = driver.findElement(By.className("dropdown")); 
		new Select(selectTrainingProgram1).selectByIndex(2);   
		WebElement selectTrainingProgram11 = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")); 
		new Select(selectTrainingProgram11).selectByIndex(1);   
		WebElement selectTrainingProgram111 = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")); 
		new Select(selectTrainingProgram111).selectByIndex(1);  
	}

}
