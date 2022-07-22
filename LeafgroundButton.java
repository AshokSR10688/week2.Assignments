package leafground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[contains(@class,'large-6 small-12')]//label")).click();
		driver.findElement(By.xpath("//div[contains(@class,'large-6 small-12')]//button")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'large-6 small-12')]//label)[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'large-6 small-12')]//button)[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'large-6 small-12')]//button)[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'large-6 small-12')]//button)[3]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/div[1]/div[1]/label[1]")).click();
		driver.findElement(By.xpath("//label[text()='Find the height and width']/following-sibling::button")).click();
		
	}

}
