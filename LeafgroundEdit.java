package leafground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundEdit {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
driver.get("http://www.leafground.com/home.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//a[contains(@class,\"wp-categories-link maxheight\")]")).click();
driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("srashok10688@gmail.com");
driver.findElement(By.xpath("(//div[contains(@class,'large-6 small-12')]//input)[2]")).clear();
driver.findElement(By.xpath("(//div[contains(@class,'large-6 small-12')]//input)[2]")).sendKeys("Appended text");
driver.findElement(By.xpath("//input[@value='TestLeaf']")).clear();
driver.findElement(By.xpath("//input[@value='TestLeaf']")).sendKeys("default");
driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
driver.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("Cleared");
driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).sendKeys("No Value");
String title1=driver.getTitle();
System.out.println(title1);
	}

}
